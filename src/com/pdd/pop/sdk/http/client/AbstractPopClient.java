package com.pdd.pop.sdk.http.client;

import com.pdd.pop.sdk.common.constant.Constants;
import com.pdd.pop.sdk.common.constant.PddCharset;
import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.common.logger.PopLogger;
import com.pdd.pop.sdk.common.logger.PopLoggerFactory;
import com.pdd.pop.sdk.common.util.*;
import com.pdd.pop.sdk.http.*;
import com.pdd.pop.ext.apache.http.Consts;
import com.pdd.pop.ext.apache.http.NameValuePair;
import com.pdd.pop.ext.apache.http.client.entity.UrlEncodedFormEntity;
import com.pdd.pop.ext.apache.http.client.methods.CloseableHttpResponse;
import com.pdd.pop.ext.apache.http.client.methods.HttpGet;
import com.pdd.pop.ext.apache.http.client.methods.HttpPost;
import com.pdd.pop.ext.apache.http.client.utils.URLEncodedUtils;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;
import com.pdd.pop.ext.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xuanli
 * @Description: AbstractPopClient
 * @date 2018/12/4 16:57
 */
public abstract  class AbstractPopClient extends HttpExecuter implements PopClient {
    
    protected static final PopLogger logger = PopLoggerFactory.getLogger(AbstractPopClient.class);
    
    /**
     * api网关服务地址
     */
    protected String apiServerUrl = "https://gw-api.pinduoduo.com/api/router";
    
    /**
     * 客户端秘钥
     */
    protected String clientSecret;
    
    /**
     * 客户端编号
     */
    protected String clientId;
    
    /**
     * httpClient客户端实例
     */
    protected CloseableHttpClient httpClient;
    
    
    /**
     * 获取默认的执行线程池
     * @return
     */
    protected ExecutorService getDefaultExecutorService(){
        HttpClientConfig config = HttpClientConfig.getDefault();
        return new ThreadPoolExecutor(0, config.getMaxParallel(), config.getThreadKeepAliveTime(), TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
    
    
    /**
     * 同步执行Get请求
     * @param request
     * @param <T>
     * @return
     * @throws Exception
     */
    protected <T extends PopBaseHttpResponse> T syncGet(PopBaseHttpRequest<T> request,String accessToken) throws Exception{
        CloseableHttpResponse httpResponse = null;
        
        StringBuilder sb = new StringBuilder(apiServerUrl).append("?");
        
        List<NameValuePair> formParams = assemblyNameValuePair(request.getParamsMap(),accessToken);
        if (!CollectionUtil.isEmpty(formParams)) {
            sb.append(URLEncodedUtils.format(formParams, PddCharset.UTF_8));
        }
        HttpGet httpGet = new HttpGet(sb.toString());
        
        if (! CollectionUtil.isEmpty(request.getHeaders())) {
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                httpGet.setHeader(entry.getKey(), entry.getValue());
            }
        }
        
        String responseContent = syncExecute(httpClient,httpGet);
        return JsonUtil.transferToObj(responseContent, request.getResponseClass());
        
    }
    
    /**
     * 同步执行Post请求
     * @param request
     * @param <T>
     * @return
     * @throws Exception
     */
    protected <T extends PopBaseHttpResponse> T syncPost(PopBaseHttpRequest<T> request,String accessToken) throws Exception{
        
        List<NameValuePair> formParams = assemblyNameValuePair(request.getParamsMap(),accessToken);
        HttpPost httpPost = new HttpPost(apiServerUrl);
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams, Consts.UTF_8);
        httpPost.setEntity(entity);
        if (! CollectionUtil.isEmpty(request.getHeaders())) {
            for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
                httpPost.setHeader(entry.getKey(), entry.getValue());
            }
        }
        
        String responseContent = syncExecute(httpClient,httpPost);
        return JsonUtil.transferToObj(responseContent, request.getResponseClass());
        
    }
    

    
    /**
     * 组装请求URL
     * @param requestParams
     * @return
     */
    private List<NameValuePair> assemblyNameValuePair (Map<String, String> requestParams,String accessToken) {
        requestParams.put(Constants.CLIENT_ID, clientId);
        if(!StringUtils.isEmpty(accessToken)){
            requestParams.put(Constants.ACCESS_TOKEN, accessToken);
        }
        // 签名原串
        String signSrc= SignUtils.buildSignSource(requestParams,this.clientSecret);
        
        // 签名
        String sign = SignUtils.sign(signSrc, Constants.MD5);
        logger.debug(String.format("SIGN_SRC:[%s],SIGN:[%s]",signSrc,sign));
        
        // 设置签名至请求参数
        requestParams.put(Constants.SIGN, sign);
        List<NameValuePair> formParams = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String> entry : requestParams.entrySet()) {
            formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return formParams;
    }
    
    /**
     * 销毁连接
     */
    public void destroy() {
        try {
            if (httpClient != null) {
                httpClient.close();
                logger.debug("PopClient destroy success");
            }
        } catch (IOException e) {
            logger.debug("PopClient destroy fail");
            throw new PopClientException(ClientErrorCode.DESTROY_CLIENT_ERROR);
        } finally {
            IOSupport.closeQuietly(httpClient);
        }
    }
    
}
