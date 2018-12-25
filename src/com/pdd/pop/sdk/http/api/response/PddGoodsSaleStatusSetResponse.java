package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSaleStatusSetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("goods_sale_status_set_response")
    private GoodsSaleStatusSetResponse goodsSaleStatusSetResponse;

    
    public GoodsSaleStatusSetResponse getGoodsSaleStatusSetResponse() {
        return goodsSaleStatusSetResponse;
    }

    
    public static class GoodsSaleStatusSetResponse {

        /**
         * 是否修改成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}