package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddInvoiceDetailQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("invoice_detail_query_response")
    private InvoiceDetailQueryResponse invoiceDetailQueryResponse;

    
    public InvoiceDetailQueryResponse getInvoiceDetailQueryResponse() {
        return invoiceDetailQueryResponse;
    }

    
    public static class InvoiceDetailQueryResponse {

        /**
         * 拒绝原因
         */
        @JsonProperty("denied_reason")
        private String deniedReason;

        /**
         * 备注
         */
        @JsonProperty("memo")
        private String memo;

        /**
         * 发票文件地址
         */
        @JsonProperty("invoice_file_path")
        private String invoiceFilePath;

        /**
         * 开票日期,时间戳（毫秒）
         */
        @JsonProperty("invoice_time")
        private Long invoiceTime;

        /**
         * 开票人
         */
        @JsonProperty("payee_operator")
        private String payeeOperator;

        /**
         * 原蓝票号码（红票必填）
         */
        @JsonProperty("original_invoice_no")
        private String originalInvoiceNo;

        /**
         * 原蓝票代码（红票必填）
         */
        @JsonProperty("original_invoice_code")
        private String originalInvoiceCode;

        /**
         * 发票号码
         */
        @JsonProperty("invoice_no")
        private String invoiceNo;

        /**
         * 发票代码
         */
        @JsonProperty("invoice_code")
        private String invoiceCode;

        /**
         * 总税额
         */
        @JsonProperty("sum_tax")
        private Long sumTax;

        /**
         * 税率
         */
        @JsonProperty("tax_rate")
        private Long taxRate;

        /**
         * 不含税金额
         */
        @JsonProperty("sum_price")
        private Long sumPrice;

        /**
         * 开票金额
         */
        @JsonProperty("invoice_amount")
        private Long invoiceAmount;

        /**
         * 开票类型：0-蓝票，1-红票；目前只支持0
         */
        @JsonProperty("invoice_type")
        private Integer invoiceType;

        /**
         * 发票种类：0-电子发票，1-纸质发票，2-专票；目前只支持0
         */
        @JsonProperty("invoice_kind")
        private Integer invoiceKind;

        /**
         * 审核结果：1-开票中，2-已完成
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 税号，企业必填
         */
        @JsonProperty("payer_register_no")
        private String payerRegisterNo;

        /**
         * 发票抬头
         */
        @JsonProperty("payer_name")
        private String payerName;

        /**
         * 抬头类型：0-个人，1-企业
         */
        @JsonProperty("business_type")
        private Integer businessType;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 发票流水号
         */
        @JsonProperty("serial_no")
        private String serialNo;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 申请状态：0-已拒绝，1-申请中，2-已同意
         */
        @JsonProperty("application_status")
        private Integer applicationStatus;

        
        public String getDeniedReason() {
            return deniedReason;
        }

        public String getMemo() {
            return memo;
        }

        public String getInvoiceFilePath() {
            return invoiceFilePath;
        }

        public Long getInvoiceTime() {
            return invoiceTime;
        }

        public String getPayeeOperator() {
            return payeeOperator;
        }

        public String getOriginalInvoiceNo() {
            return originalInvoiceNo;
        }

        public String getOriginalInvoiceCode() {
            return originalInvoiceCode;
        }

        public String getInvoiceNo() {
            return invoiceNo;
        }

        public String getInvoiceCode() {
            return invoiceCode;
        }

        public Long getSumTax() {
            return sumTax;
        }

        public Long getTaxRate() {
            return taxRate;
        }

        public Long getSumPrice() {
            return sumPrice;
        }

        public Long getInvoiceAmount() {
            return invoiceAmount;
        }

        public Integer getInvoiceType() {
            return invoiceType;
        }

        public Integer getInvoiceKind() {
            return invoiceKind;
        }

        public Integer getStatus() {
            return status;
        }

        public String getPayerRegisterNo() {
            return payerRegisterNo;
        }

        public String getPayerName() {
            return payerName;
        }

        public Integer getBusinessType() {
            return businessType;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getSerialNo() {
            return serialNo;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getApplicationStatus() {
            return applicationStatus;
        }

        
    }
    
}