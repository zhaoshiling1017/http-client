package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddMallInfoGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("mall_info_get_response")
    private MallInfoGetResponse mallInfoGetResponse;

    
    public MallInfoGetResponse getMallInfoGetResponse() {
        return mallInfoGetResponse;
    }

    
    public static class MallInfoGetResponse {

        /**
         * 店铺logo
         */
        @JsonProperty("logo")
        private String logo;

        /**
         * 店铺名称
         */
        @JsonProperty("mall_name")
        private String mallName;

        /**
         * 店铺描述
         */
        @JsonProperty("mall_desc")
        private String mallDesc;

        
        public String getLogo() {
            return logo;
        }

        public String getMallName() {
            return mallName;
        }

        public String getMallDesc() {
            return mallDesc;
        }

        
    }
    
}