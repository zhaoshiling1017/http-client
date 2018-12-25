package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddVoucherAppointmentInfoSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddVoucherAppointmentInfoSendRequest extends PopBaseHttpRequest<PddVoucherAppointmentInfoSendResponse>{

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
     * 预约时间, 距离格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)起至现在的总毫秒数
     */
    @JsonProperty("appointment_time")
    private Long appointmentTime;

    
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
        return "pdd.voucher.appointment.info.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherAppointmentInfoSendResponse> getResponseClass() {
        return PddVoucherAppointmentInfoSendResponse.class;
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
        if(appointmentTime != null) {
            paramsMap.put("appointment_time", appointmentTime.toString());
            
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

    public void setAppointmentTime(Long appointmentTime) {
        this.appointmentTime = appointmentTime;
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