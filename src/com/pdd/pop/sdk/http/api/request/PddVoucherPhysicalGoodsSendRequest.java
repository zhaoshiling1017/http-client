package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddVoucherPhysicalGoodsSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddVoucherPhysicalGoodsSendRequest extends PopBaseHttpRequest<PddVoucherPhysicalGoodsSendResponse>{

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 外部流水号
     */
    @JsonProperty("out_biz_no")
    private String outBizNo;

    /**
     * 优惠券信息列表,例子[{"voucher_id":"test voucher_id","voucher_no":"test voucher_no"}]
     */
    @JsonProperty("voucher_list")
    private List<VoucherListItem> voucherList;

    /**
     * 物流方式  1  物流发货   2 自提
     */
    @JsonProperty("logistics_type")
    private Integer logisticsType;

    /**
     * 收件人
     */
    @JsonProperty("recipient")
    private String recipient;

    /**
     * 收件人电话
     */
    @JsonProperty("recipient_mobile")
    private String recipientMobile;

    /**
     * 收件人地址
     */
    @JsonProperty("recipient_address")
    private String recipientAddress;

    /**
     * 物流单号
     */
    @JsonProperty("logistics_no")
    private String logisticsNo;

    /**
     * 物流公司编号
     */
    @JsonProperty("logistics_company_id")
    private String logisticsCompanyId;

    /**
     * 物流公司名称
     */
    @JsonProperty("logistics_company")
    private String logisticsCompany;

    
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
        return "pdd.voucher.physical.goods.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherPhysicalGoodsSendResponse> getResponseClass() {
        return PddVoucherPhysicalGoodsSendResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(orderSn != null) {
            paramsMap.put("order_sn", orderSn.toString());
            
        }
        if(outBizNo != null) {
            paramsMap.put("out_biz_no", outBizNo.toString());
            
        }
        if(voucherList != null) {
            paramsMap.put("voucher_list", voucherList.toString());
            
        }
        if(logisticsType != null) {
            paramsMap.put("logistics_type", logisticsType.toString());
            
        }
        if(recipient != null) {
            paramsMap.put("recipient", recipient.toString());
            
        }
        if(recipientMobile != null) {
            paramsMap.put("recipient_mobile", recipientMobile.toString());
            
        }
        if(recipientAddress != null) {
            paramsMap.put("recipient_address", recipientAddress.toString());
            
        }
        if(logisticsNo != null) {
            paramsMap.put("logistics_no", logisticsNo.toString());
            
        }
        if(logisticsCompanyId != null) {
            paramsMap.put("logistics_company_id", logisticsCompanyId.toString());
            
        }
        if(logisticsCompany != null) {
            paramsMap.put("logistics_company", logisticsCompany.toString());
            
        }
        
        return paramsMap;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public void setVoucherList(List<VoucherListItem> voucherList) {
        this.voucherList = voucherList;
    }

    public void setLogisticsType(Integer logisticsType) {
        this.logisticsType = logisticsType;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setRecipientMobile(String recipientMobile) {
        this.recipientMobile = recipientMobile;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public void setLogisticsCompanyId(String logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    
    public static class VoucherListItem {

        /**
         * 卡券ID
         */
        @JsonProperty("voucher_id")
        private String voucherId;

        /**
         * 卡券号
         */
        @JsonProperty("voucher_no")
        private String voucherNo;

        
        public void setVoucherId(String voucherId) {
            this.voucherId = voucherId;
        }

        public void setVoucherNo(String voucherNo) {
            this.voucherNo = voucherNo;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}