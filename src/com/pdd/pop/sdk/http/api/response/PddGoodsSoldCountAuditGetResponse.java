package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsSoldCountAuditGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_sold_count_audit_get_response")
    private GoodsSoldCountAuditGetResponse goodsSoldCountAuditGetResponse;

    
    public GoodsSoldCountAuditGetResponse getGoodsSoldCountAuditGetResponse() {
        return goodsSoldCountAuditGetResponse;
    }

    
    public static class GoodsSoldCountAuditGetResponse {

        /**
         * 审核状态
         */
        @JsonProperty("audit_status")
        private Integer auditStatus;

        
        public Integer getAuditStatus() {
            return auditStatus;
        }

        
    }
    
}