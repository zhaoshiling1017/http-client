package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddLogisticsTicketImageUploadResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("logistics_ticket_image_upload_response")
    private LogisticsTicketImageUploadResponse logisticsTicketImageUploadResponse;

    
    public LogisticsTicketImageUploadResponse getLogisticsTicketImageUploadResponse() {
        return logisticsTicketImageUploadResponse;
    }

    
    public static class LogisticsTicketImageUploadResponse {

        /**
         * 图片url
         */
        @JsonProperty("image_url")
        private String imageUrl;

        
        public String getImageUrl() {
            return imageUrl;
        }

        
    }
    
}