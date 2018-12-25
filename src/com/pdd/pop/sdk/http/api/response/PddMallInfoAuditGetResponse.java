package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddMallInfoAuditGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("mall_info_audit_get_response")
    private MallInfoAuditGetResponse mallInfoAuditGetResponse;

    
    public MallInfoAuditGetResponse getMallInfoAuditGetResponse() {
        return mallInfoAuditGetResponse;
    }

    
    public static class MallInfoAuditGetResponse {

        /**
         * 审核状态
         */
        @JsonProperty("audit_status")
        private Integer auditStatus;

        /**
         * 生效状态
         */
        @JsonProperty("validate_status")
        private Integer validateStatus;

        
        public Integer getAuditStatus() {
            return auditStatus;
        }

        public Integer getValidateStatus() {
            return validateStatus;
        }

        
    }
    
}