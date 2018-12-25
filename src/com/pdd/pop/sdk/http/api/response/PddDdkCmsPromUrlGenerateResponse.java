package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkCmsPromUrlGenerateResponse extends PopBaseHttpResponse{

    /**
     * 商城推广链接返回对象
     */
    @JsonProperty("cms_promotion_url_generate_response")
    private CmsPromotionUrlGenerateResponse cmsPromotionUrlGenerateResponse;

    
    public CmsPromotionUrlGenerateResponse getCmsPromotionUrlGenerateResponse() {
        return cmsPromotionUrlGenerateResponse;
    }

    
    public static class CmsPromotionUrlGenerateResponse {

        /**
         * total
         */
        @JsonProperty("total")
        private Integer total;

        
        public Integer getTotal() {
            return total;
        }

        
    }
    
}