package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddVoucherVoucherComplainResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddVoucherVoucherComplainRequest extends PopBaseHttpRequest<PddVoucherVoucherComplainResponse>{

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
     * 投诉人
     */
    @JsonProperty("complain_user")
    private String complainUser;

    /**
     * 投诉人电话
     */
    @JsonProperty("complain_user_mobile")
    private String complainUserMobile;

    /**
     * 投诉内容
     */
    @JsonProperty("complain_content")
    private String complainContent;

    /**
     * ["http://testimg.yangkeduo.com/pdd_oms/2018-01-16/411068e948835ae053a86c13f8ebb5ee.jpg"]
     */
    @JsonProperty("complain_attachment_list")
    private List<String> complainAttachmentList;

    /**
     * 枚举值1、大闸蟹死蟹或者少蟹 ；2、大闸蟹重量不符；3、大闸蟹公母数量不符；4、大闸蟹产地不符；5、欺诈发货（收到的产品非大闸蟹）；6、蟹券无法提货
7、其他质量问题
     */
    @JsonProperty("complain_type")
    private Integer complainType;

    
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
        return "pdd.voucher.voucher.complain";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherVoucherComplainResponse> getResponseClass() {
        return PddVoucherVoucherComplainResponse.class;
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
        if(complainUser != null) {
            paramsMap.put("complain_user", complainUser.toString());
            
        }
        if(complainUserMobile != null) {
            paramsMap.put("complain_user_mobile", complainUserMobile.toString());
            
        }
        if(complainContent != null) {
            paramsMap.put("complain_content", complainContent.toString());
            
        }
        if(complainAttachmentList != null) {
            paramsMap.put("complain_attachment_list", JsonUtil.transferToJson(complainAttachmentList));
            
        }
        if(complainType != null) {
            paramsMap.put("complain_type", complainType.toString());
            
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

    public void setComplainUser(String complainUser) {
        this.complainUser = complainUser;
    }

    public void setComplainUserMobile(String complainUserMobile) {
        this.complainUserMobile = complainUserMobile;
    }

    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent;
    }

    public void setComplainAttachmentList(List<String> complainAttachmentList) {
        this.complainAttachmentList = complainAttachmentList;
    }

    public void setComplainType(Integer complainType) {
        this.complainType = complainType;
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