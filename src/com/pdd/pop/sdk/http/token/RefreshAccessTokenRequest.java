package com.pdd.pop.sdk.http.token;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author xuanli
 * @Description: RefreshAccessTokenRequest
 * @date 2018/12/2 21:54
 */
public class RefreshAccessTokenRequest {
    
    @JsonProperty("client_id")
    private String clientId;
    
    @JsonProperty("client_secret")
    private String clientSecret;
    
    @JsonProperty("grant_type")
    private String grantType;
    
    @JsonProperty("refresh_token")
    private String refreshToken;
    
    
    public String getClientId() {
        return clientId;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    public String getClientSecret() {
        return clientSecret;
    }
    
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
    
    public String getGrantType() {
        return grantType;
    }
    
    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
    
    public String getRefreshToken() {
        return refreshToken;
    }
    
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
