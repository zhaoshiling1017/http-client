package com.pdd.pop.sdk.http.token;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

public class AccessTokenResponse extends PopBaseHttpResponse {

    /**
     * access_token
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * access_token 剩余过期有效时间(秒)
     */
    @JsonProperty("expires_in")
    private Integer expiresIn;

    /**
     * refresh_token，可用来刷新access_token
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * 授权接口范围
     */
    @JsonProperty("scope")
    private List<String> scope;

    /**
     * 等同与授权成功的mall_id，拼多多店铺ID
     */
    @JsonProperty("owner_id")
    private String ownerId;

    /**
     * 等同与授权成功的user_name，拼多多店铺账号名
     */
    @JsonProperty("owner_name")
    private String ownerName;

    public String getAccessToken(){
        return accessToken;
    }

    public Integer getExpiresIn(){
        return expiresIn;
    }

    public String getRefreshToken(){
        return refreshToken;
    }

    public List<String> getScope(){
        return scope;
    }

    public String getOwnerId(){
        return ownerId;
    }

    public String getOwnerName(){
        return ownerName;
    }
}
