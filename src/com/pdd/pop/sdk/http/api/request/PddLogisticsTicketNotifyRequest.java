package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddLogisticsTicketNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddLogisticsTicketNotifyRequest extends PopBaseHttpRequest<PddLogisticsTicketNotifyResponse>{

    /**
     * 附件url,示例：["http://testimg.yangkeduo.com/pdd_oms/2018-01-16/411068e948835ae053a86c13f8ebb5ee.jpg"]
     */
    @JsonProperty("attach_path_list")
    private List<String> attachPathList;

    /**
     * 工单id
     */
    @JsonProperty("ticket_id")
    private Long ticketId;

    /**
     * 运单号
     */
    @JsonProperty("waybill_no")
    private String waybillNo;

    /**
     * 处理结果
     */
    @JsonProperty("handle_result")
    private String handleResult;

    /**
     * 签收状态，0:默认,1:未签收,2:已签收
     */
    @JsonProperty("sign_state")
    private Integer signState;

    /**
     * 是否赔付，0:默认,1:未赔付,2:已赔付
     */
    @JsonProperty("compensate_state")
    private Integer compensateState;

    /**
     * 赔付金额(单位:分)
     */
    @JsonProperty("compensate_amount")
    private Long compensateAmount;

    /**
     * 责任方，0:默认, 1:消费者,2:商家,3:快递公司,4:其他
     */
    @JsonProperty("duty")
    private Integer duty;

    /**
     * 处理人
     */
    @JsonProperty("express_dealer")
    private String expressDealer;

    /**
     * 处理人联系方式
     */
    @JsonProperty("express_dealer_contact")
    private String expressDealerContact;

    
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
        return "pdd.logistics.ticket.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsTicketNotifyResponse> getResponseClass() {
        return PddLogisticsTicketNotifyResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(attachPathList != null) {
            paramsMap.put("attach_path_list", JsonUtil.transferToJson(attachPathList));
            
        }
        if(ticketId != null) {
            paramsMap.put("ticket_id", ticketId.toString());
            
        }
        if(waybillNo != null) {
            paramsMap.put("waybill_no", waybillNo.toString());
            
        }
        if(handleResult != null) {
            paramsMap.put("handle_result", handleResult.toString());
            
        }
        if(signState != null) {
            paramsMap.put("sign_state", signState.toString());
            
        }
        if(compensateState != null) {
            paramsMap.put("compensate_state", compensateState.toString());
            
        }
        if(compensateAmount != null) {
            paramsMap.put("compensate_amount", compensateAmount.toString());
            
        }
        if(duty != null) {
            paramsMap.put("duty", duty.toString());
            
        }
        if(expressDealer != null) {
            paramsMap.put("express_dealer", expressDealer.toString());
            
        }
        if(expressDealerContact != null) {
            paramsMap.put("express_dealer_contact", expressDealerContact.toString());
            
        }
        
        return paramsMap;
    }

    public void setAttachPathList(List<String> attachPathList) {
        this.attachPathList = attachPathList;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }

    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    public void setSignState(Integer signState) {
        this.signState = signState;
    }

    public void setCompensateState(Integer compensateState) {
        this.compensateState = compensateState;
    }

    public void setCompensateAmount(Long compensateAmount) {
        this.compensateAmount = compensateAmount;
    }

    public void setDuty(Integer duty) {
        this.duty = duty;
    }

    public void setExpressDealer(String expressDealer) {
        this.expressDealer = expressDealer;
    }

    public void setExpressDealerContact(String expressDealerContact) {
        this.expressDealerContact = expressDealerContact;
    }

    
    
}