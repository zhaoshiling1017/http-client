package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsCpsMallUnitCreateResponse extends PopBaseHttpResponse{

    /**
     * 是否设置成功
     */
    @JsonProperty("is_create_success")
    private Boolean isCreateSuccess;

    
    public Boolean getIsCreateSuccess() {
        return isCreateSuccess;
    }

    
    
}