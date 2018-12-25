package com.pdd.pop.sdk.http.token;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccessToken 请求
 */
public class AccessTokenRequest {
    
    @JsonProperty("client_id")
    private String clientId;
    
    @JsonProperty("client_secret")
    private String clientSecret;
    
    @JsonProperty("grant_type")
    private String grantType;
    
    @JsonProperty("code")
    private String code;
    
    public String getRedirectUri() {
        return redirectUri;
    }
    
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }
    
    @JsonProperty("redirect_uri")
    private String redirectUri ="http://www.baidu.com";
    
    
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
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
