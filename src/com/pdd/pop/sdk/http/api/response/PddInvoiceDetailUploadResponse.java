package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddInvoiceDetailUploadResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("invoice_detail_upload_response")
    private InvoiceDetailUploadResponse invoiceDetailUploadResponse;

    
    public InvoiceDetailUploadResponse getInvoiceDetailUploadResponse() {
        return invoiceDetailUploadResponse;
    }

    
    public static class InvoiceDetailUploadResponse {

        /**
         * 发票流水号
         */
        @JsonProperty("serial_no")
        private String serialNo;

        
        public String getSerialNo() {
            return serialNo;
        }

        
    }
    
}