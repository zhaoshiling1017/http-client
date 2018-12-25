package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddDeleteGoodsCommitResponse extends PopBaseHttpResponse{

    /**
     * 操作结果
     */
    @JsonProperty("open_api_response")
    private Boolean openApiResponse;

    
    public Boolean getOpenApiResponse() {
        return openApiResponse;
    }

    
    
}