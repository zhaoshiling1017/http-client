package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddMallInfoCreateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("mall_info_create_response")
    private MallInfoCreateResponse mallInfoCreateResponse;

    
    public MallInfoCreateResponse getMallInfoCreateResponse() {
        return mallInfoCreateResponse;
    }

    
    public static class MallInfoCreateResponse {

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        /**
         * 授权access_token
         */
        @JsonProperty("access_token")
        private String accessToken;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        
        public Boolean getSuccess() {
            return success;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public Long getMallId() {
            return mallId;
        }

        
    }
    
}