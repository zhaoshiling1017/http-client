package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSoldCountSetResponse extends PopBaseHttpResponse{

    /**
     * 请求response
     */
    @JsonProperty("goods_sold_count_set_response")
    private GoodsSoldCountSetResponse goodsSoldCountSetResponse;

    
    public GoodsSoldCountSetResponse getGoodsSoldCountSetResponse() {
        return goodsSoldCountSetResponse;
    }

    
    public static class GoodsSoldCountSetResponse {

        /**
         * 申请标号
         */
        @JsonProperty("serial_number")
        private String serialNumber;

        
        public String getSerialNumber() {
            return serialNumber;
        }

        
    }
    
}