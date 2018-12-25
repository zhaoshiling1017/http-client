package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsCpsUnitChangeResponse extends PopBaseHttpResponse{

    /**
     * 是否修改成功
     */
    @JsonProperty("is_change_success")
    private Boolean isChangeSuccess;

    
    public Boolean getIsChangeSuccess() {
        return isChangeSuccess;
    }

    
    
}