package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddInvoiceApplicationQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("invoice_application_query_response")
    private InvoiceApplicationQueryResponse invoiceApplicationQueryResponse;

    
    public InvoiceApplicationQueryResponse getInvoiceApplicationQueryResponse() {
        return invoiceApplicationQueryResponse;
    }

    
    public static class InvoiceApplicationQueryResponse {

        /**
         * 发票申请列表
         */
        @JsonProperty("invoice_application_list")
        private List<InvoiceApplicationListItem> invoiceApplicationList;

        
        public List<InvoiceApplicationListItem> getInvoiceApplicationList() {
            return invoiceApplicationList;
        }

        
    }
    public static class InvoiceApplicationListItem {

        /**
         * 修改时间
         */
        @JsonProperty("gmt_modified")
        private Long gmtModified;

        /**
         * 创建时间
         */
        @JsonProperty("gmt_create")
        private Long gmtCreate;

        /**
         * 备注
         */
        @JsonProperty("memo")
        private String memo;

        /**
         * 驳回原因
         */
        @JsonProperty("reason")
        private String reason;

        /**
         * 总税额，暂为null
         */
        @JsonProperty("sum_tax")
        private String sumTax;

        /**
         * 税率，暂为null
         */
        @JsonProperty("tax_rate")
        private String taxRate;

        /**
         * 不含税金额，暂为null
         */
        @JsonProperty("sum_price")
        private String sumPrice;

        /**
         * 开票金额，暂为null，取买家实付
         */
        @JsonProperty("invoice_amount")
        private String invoiceAmount;

        /**
         * 发票类型：0-蓝票，1-红票；目前只支持0
         */
        @JsonProperty("invoice_type")
        private Integer invoiceType;

        /**
         * 发票种类：0-电子，1-纸质，2-专票；目前只支持0
         */
        @JsonProperty("invoice_kind")
        private Integer invoiceKind;

        /**
         * 企业税号，抬头为企业类型必填
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
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 开票申请触发类型：1-申请开票，2-改抬头，3电换纸；目前只支持1
         */
        @JsonProperty("trigger_status")
        private Integer triggerStatus;

        /**
         * 申请状态：0-已拒绝，1-申请中，2-已同意
         */
        @JsonProperty("application_status")
        private Integer applicationStatus;

        /**
         * 申请流水号
         */
        @JsonProperty("application_id")
        private Long applicationId;

        
        public Long getGmtModified() {
            return gmtModified;
        }

        public Long getGmtCreate() {
            return gmtCreate;
        }

        public String getMemo() {
            return memo;
        }

        public String getReason() {
            return reason;
        }

        public String getSumTax() {
            return sumTax;
        }

        public String getTaxRate() {
            return taxRate;
        }

        public String getSumPrice() {
            return sumPrice;
        }

        public String getInvoiceAmount() {
            return invoiceAmount;
        }

        public Integer getInvoiceType() {
            return invoiceType;
        }

        public Integer getInvoiceKind() {
            return invoiceKind;
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

        public String getOrderSn() {
            return orderSn;
        }

        public Integer getTriggerStatus() {
            return triggerStatus;
        }

        public Integer getApplicationStatus() {
            return applicationStatus;
        }

        public Long getApplicationId() {
            return applicationId;
        }

        
    }
    
}