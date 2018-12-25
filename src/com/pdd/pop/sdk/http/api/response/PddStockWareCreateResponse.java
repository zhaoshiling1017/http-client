package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddStockWareCreateResponse extends PopBaseHttpResponse{

    /**
     * 货品id
     */
    @JsonProperty("open_api_response")
    private Integer openApiResponse;

    
    public Integer getOpenApiResponse() {
        return openApiResponse;
    }

    
    
}