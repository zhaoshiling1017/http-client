package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddStockDepotPriorityUpdateResponse extends PopBaseHttpResponse{

    /**
     * 请求结果
     */
    @JsonProperty("open_api_response")
    private String openApiResponse;

    
    public String getOpenApiResponse() {
        return openApiResponse;
    }

    
    
}