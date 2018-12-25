package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDdkWeappQrcodeUrlGenResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("weapp_qrcode_generate_response")
    private WeappQrcodeGenerateResponse weappQrcodeGenerateResponse;

    
    public WeappQrcodeGenerateResponse getWeappQrcodeGenerateResponse() {
        return weappQrcodeGenerateResponse;
    }

    
    public static class WeappQrcodeGenerateResponse {

        /**
         * 单品推广小程序二维码url
         */
        @JsonProperty("url")
        private String url;

        
        public String getUrl() {
            return url;
        }

        
    }
    
}