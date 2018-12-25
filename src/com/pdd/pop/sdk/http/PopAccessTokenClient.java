package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.constant.Constants;
import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.common.util.PreconditionUtil;
import com.pdd.pop.sdk.http.client.HttpClientFactory;
import com.pdd.pop.sdk.http.client.HttpExecuter;
import com.pdd.pop.sdk.http.token.AccessTokenRequest;
import com.pdd.pop.sdk.http.token.AccessTokenResponse;
import com.pdd.pop.sdk.http.token.RefreshAccessTokenRequest;
import com.pdd.pop.ext.apache.http.client.entity.EntityBuilder;
import com.pdd.pop.ext.apache.http.client.methods.HttpPost;
import com.pdd.pop.ext.apache.http.entity.ContentType;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;

/**
 * @author xuanli
 * @Description: 鉴权Token访问客户端
 * @date 2018/12/4 17:30
 */
public class PopAccessTokenClient extends HttpExecuter {
    
    /**
     * 默认授权服务地址
     */
    private final static String OAUTH_SERVER_URL = "https://open-api.pinduoduo.com/oauth/token";
    /**
     * 客户端秘钥
     */
    private String clientSecret;
    
    /**
     * 客户端编号
     */
    private String clientId;
    
    /**
     * 授权服务地址
     */
    private String oauthServerUrl;
    
    /**
     * HttpClient 配置
     */
    private HttpClientConfig config;
    
    public PopAccessTokenClient(String clientId, String clientSecret){
        this(clientId,clientSecret,OAUTH_SERVER_URL);
    }
    
    public PopAccessTokenClient(String clientId, String clientSecret,String oauthServerUrl){
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.oauthServerUrl = oauthServerUrl;
        this.config = HttpClientConfig.getDefault();
        config.setMaxTotal(2);
        config.setDefaultMaxPerRoute(2);
    }
    
    /**
     * 生成AccessToken
     * @param code : 授权码
     * @return
     * @throws Exception
     */
    public AccessTokenResponse generate(String code) throws Exception{
        PreconditionUtil.checkNotNull(code);
    
        CloseableHttpClient client = HttpClientFactory.getHttpClient(config);
        try{
            HttpPost httpPost = new HttpPost(oauthServerUrl);
            AccessTokenRequest request = new AccessTokenRequest();
            request.setClientId(clientId);
            request.setClientSecret(clientSecret);
            request.setCode(code);
            request.setGrantType(Constants.AUTH_CODE_TYPE);
            String json = JsonUtil.transferToJson(request);
    
            httpPost.setEntity(EntityBuilder.create().setContentType(ContentType.APPLICATION_JSON).setText(json).build());
            String responseContent = super.syncExecute(client,httpPost);
    
            return JsonUtil.transferToObj(responseContent, AccessTokenResponse.class);
        }finally {
            client.close();
        }

    }
    
    /**
     * 刷新AccessToken
     * @param refreshToken : 刷新码
     * @return
     * @throws Exception
     */
    public AccessTokenResponse refresh(String refreshToken)throws Exception{
        PreconditionUtil.checkNotNull(refreshToken);
        CloseableHttpClient client = HttpClientFactory.getHttpClient(config);
        try{
    
            HttpPost httpPost = new HttpPost(oauthServerUrl);
            RefreshAccessTokenRequest request = new RefreshAccessTokenRequest();
            request.setClientId(clientId);
            request.setClientSecret(clientSecret);
            request.setGrantType(Constants.REFRESH_TYPE);
            request.setRefreshToken(refreshToken);
            String json = JsonUtil.transferToJson(request);
    
            httpPost.setEntity(EntityBuilder.create().setContentType(ContentType.APPLICATION_JSON).setText(json).build());
    
            String responseContent = super.syncExecute(client,httpPost);
    
            return JsonUtil.transferToObj(responseContent, AccessTokenResponse.class);
        }finally {
            client.close();
        }
    }


}
