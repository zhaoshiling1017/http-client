package com.pdd.pop.sdk.http.demo;

import com.pdd.pop.sdk.http.PopAccessTokenClient;
import com.pdd.pop.sdk.http.token.AccessTokenResponse;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/4 19:34
 */
public class AccessTokenDemo {
    
    public static void main(String[] args) {
        String clientId = "your app clientId";
        String clientSecret = "your app clientSecret";
        String refreshToken = "your app refreshToken";
        String code = "your code";
    
        PopAccessTokenClient accessTokenClient = new PopAccessTokenClient(clientId,clientSecret);
    
        
        // 生成AccessToken
        try {
            AccessTokenResponse response = accessTokenClient.generate(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
        // 刷新AccessToken
        try {
            AccessTokenResponse response = accessTokenClient.refresh(refreshToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
