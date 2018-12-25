package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.common.util.PreconditionUtil;
import com.pdd.pop.sdk.http.client.AbstractPopClient;
import com.pdd.pop.sdk.http.client.HttpClientFactory;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class PopHttpClient extends AbstractPopClient {
    
    private ExecutorService executorService;
    
    public PopHttpClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, HttpClientConfig.getDefault());
    }
    
    public PopHttpClient(String apiServerUrl, String clientId, String clientSecret) {
        this(clientId, clientSecret, HttpClientConfig.getDefault());
        this.apiServerUrl = apiServerUrl;
    }
    
    public PopHttpClient(String clientId, String clientSecret, CloseableHttpClient closeableHttpClient) {
        PreconditionUtil.checkNotNull(closeableHttpClient);
        PreconditionUtil.checkNotNull(clientId);
        PreconditionUtil.checkNotNull(clientSecret);
        
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        
        httpClient = closeableHttpClient;
        executorService = getDefaultExecutorService();
    }
    
    public PopHttpClient(String clientId, String clientSecret, HttpClientConfig config) {
        PreconditionUtil.checkNotNull(clientId);
        PreconditionUtil.checkNotNull(clientSecret);
        
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        
    
        httpClient = HttpClientFactory.getHttpClient(config);
        
        if (config.getExecutorService() == null) {
            executorService = getDefaultExecutorService();
        } else {
            executorService = config.getExecutorService();
        }
        
   
        
    }
    
    public <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request) throws Exception {
        return syncInvoke(request,null);
    }
    
    /**
     * 同步执行请求
     *
     * @param request     ： 请求参数
     * @param accessToken : 鉴权token
     * @return 继承于 PopBaseHttpResponse的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> T syncInvoke(PopBaseHttpRequest<T> request, String accessToken) throws Exception {
        switch (request.getHttpMethod()) {
            case GET:
                return syncGet(request,accessToken);
            case POST:
                return syncPost(request,accessToken);
            default:
                throw new PopClientException(ClientErrorCode.ILLEGAL_HTTP_METHOD);
        }
    }
    
    /**
     * 异步执行请求
     * @param request ： 请求参数
     * @param <T>
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request) throws Exception {
       return asyncInvoke(request,null);
    }
    
    /**
     * 异步执行请求
     *
     * @param request     ： 请求参数
     * @param accessToken : 鉴权token
     * @return Future<PopBaseHttpResponse>的响应
     * @throws Exception
     */
    public <T extends PopBaseHttpResponse> Future<T> asyncInvoke(final PopBaseHttpRequest<T> request, final String accessToken) throws Exception {
        PreconditionUtil.checkNotNull(executorService);
        return executorService.submit(new Callable<T>() {
            public T call() throws Exception {
                return syncInvoke(request,accessToken);
            }
        });
    }
    
    
}
