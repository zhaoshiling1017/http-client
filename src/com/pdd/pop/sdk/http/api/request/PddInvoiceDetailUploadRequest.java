package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddInvoiceDetailUploadResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddInvoiceDetailUploadRequest extends PopBaseHttpRequest<PddInvoiceDetailUploadResponse>{

    /**
     * 发票抬头
     */
    @JsonProperty("payer_name")
    private String payerName;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 申请流水号
     */
    @JsonProperty("application_id")
    private Long applicationId;

    /**
     * 抬头类型：0-个人，1-企业
     */
    @JsonProperty("business_type")
    private Integer businessType;

    /**
     * 发票种类：0-电子发票，1-纸质发票，2-专票；目前只支持0
     */
    @JsonProperty("invoice_kind")
    private Integer invoiceKind;

    /**
     * 开票类型：0-蓝票，1-红票；目前 只支持0
     */
    @JsonProperty("invoice_type")
    private Integer invoiceType;

    /**
     * 开票金额，整数，单位：分
     */
    @JsonProperty("invoice_amount")
    private Long invoiceAmount;

    /**
     * 不含税金额，整数，单位：分
     */
    @JsonProperty("sum_price")
    private Long sumPrice;

    /**
     * 税号，企业必填
     */
    @JsonProperty("payer_register_no")
    private String payerRegisterNo;

    /**
     * 税率,整数
     */
    @JsonProperty("tax_rate")
    private Integer taxRate;

    /**
     * 总税额，整数，单位：分
     */
    @JsonProperty("sum_tax")
    private Integer sumTax;

    /**
     * 发票代码
     */
    @JsonProperty("invoice_code")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("invoice_no")
    private String invoiceNo;

    /**
     * 原蓝票代码（红票必填）
     */
    @JsonProperty("original_invoice_code")
    private String originalInvoiceCode;

    /**
     * 原蓝票号码（红票必填）
     */
    @JsonProperty("original_invoice_no")
    private String originalInvoiceNo;

    /**
     * 开票人
     */
    @JsonProperty("payee_operator")
    private String payeeOperator;

    /**
     * 开票日期,时间戳（毫秒）
     */
    @JsonProperty("invoice_time")
    private Long invoiceTime;

    /**
     * 发票内容，pdf文件，转码base64编码
     */
    @JsonProperty("invoice_file_content")
    private String invoiceFileContent;

    /**
     * 备注
     */
    @JsonProperty("memo")
    private String memo;

    
    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public String getType() {
        return "pdd.invoice.detail.upload";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddInvoiceDetailUploadResponse> getResponseClass() {
        return PddInvoiceDetailUploadResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(payerName != null) {
            paramsMap.put("payer_name", payerName.toString());
            
        }
        if(orderSn != null) {
            paramsMap.put("order_sn", orderSn.toString());
            
        }
        if(applicationId != null) {
            paramsMap.put("application_id", applicationId.toString());
            
        }
        if(businessType != null) {
            paramsMap.put("business_type", businessType.toString());
            
        }
        if(invoiceKind != null) {
            paramsMap.put("invoice_kind", invoiceKind.toString());
            
        }
        if(invoiceType != null) {
            paramsMap.put("invoice_type", invoiceType.toString());
            
        }
        if(invoiceAmount != null) {
            paramsMap.put("invoice_amount", invoiceAmount.toString());
            
        }
        if(sumPrice != null) {
            paramsMap.put("sum_price", sumPrice.toString());
            
        }
        if(payerRegisterNo != null) {
            paramsMap.put("payer_register_no", payerRegisterNo.toString());
            
        }
        if(taxRate != null) {
            paramsMap.put("tax_rate", taxRate.toString());
            
        }
        if(sumTax != null) {
            paramsMap.put("sum_tax", sumTax.toString());
            
        }
        if(invoiceCode != null) {
            paramsMap.put("invoice_code", invoiceCode.toString());
            
        }
        if(invoiceNo != null) {
            paramsMap.put("invoice_no", invoiceNo.toString());
            
        }
        if(originalInvoiceCode != null) {
            paramsMap.put("original_invoice_code", originalInvoiceCode.toString());
            
        }
        if(originalInvoiceNo != null) {
            paramsMap.put("original_invoice_no", originalInvoiceNo.toString());
            
        }
        if(payeeOperator != null) {
            paramsMap.put("payee_operator", payeeOperator.toString());
            
        }
        if(invoiceTime != null) {
            paramsMap.put("invoice_time", invoiceTime.toString());
            
        }
        if(invoiceFileContent != null) {
            paramsMap.put("invoice_file_content", invoiceFileContent.toString());
            
        }
        if(memo != null) {
            paramsMap.put("memo", memo.toString());
            
        }
        
        return paramsMap;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public void setInvoiceKind(Integer invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public void setSumPrice(Long sumPrice) {
        this.sumPrice = sumPrice;
    }

    public void setPayerRegisterNo(String payerRegisterNo) {
        this.payerRegisterNo = payerRegisterNo;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public void setSumTax(Integer sumTax) {
        this.sumTax = sumTax;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setOriginalInvoiceCode(String originalInvoiceCode) {
        this.originalInvoiceCode = originalInvoiceCode;
    }

    public void setOriginalInvoiceNo(String originalInvoiceNo) {
        this.originalInvoiceNo = originalInvoiceNo;
    }

    public void setPayeeOperator(String payeeOperator) {
        this.payeeOperator = payeeOperator;
    }

    public void setInvoiceTime(Long invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public void setInvoiceFileContent(String invoiceFileContent) {
        this.invoiceFileContent = invoiceFileContent;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    
    
}