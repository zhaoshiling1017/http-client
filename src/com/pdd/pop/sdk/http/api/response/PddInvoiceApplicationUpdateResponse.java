package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddInvoiceApplicationUpdateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("invoice_application_update_response")
    private InvoiceApplicationUpdateResponse invoiceApplicationUpdateResponse;

    
    public InvoiceApplicationUpdateResponse getInvoiceApplicationUpdateResponse() {
        return invoiceApplicationUpdateResponse;
    }

    
    public static class InvoiceApplicationUpdateResponse {

        /**
         * true
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        
        public Boolean getIsSuccess() {
            return isSuccess;
        }

        
    }
    
}