package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsTicketGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_ticket_get_response")
    private LogisticsTicketGetResponse logisticsTicketGetResponse;

    
    public LogisticsTicketGetResponse getLogisticsTicketGetResponse() {
        return logisticsTicketGetResponse;
    }

    
    public static class LogisticsTicketGetResponse {

        /**
         * 列表总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 工单列表
         */
        @JsonProperty("logistics_ticket_list")
        private List<LogisticsTicketListItem> logisticsTicketList;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<LogisticsTicketListItem> getLogisticsTicketList() {
            return logisticsTicketList;
        }

        
    }
    public static class LogisticsTicketListItem {

        /**
         * send_address
         */
        @JsonProperty("send_address")
        private String sendAddress;

        /**
         * create_type
         */
        @JsonProperty("create_type")
        private Integer createType;

        /**
         * duty
         */
        @JsonProperty("duty")
        private Integer duty;

        /**
         * receive_address
         */
        @JsonProperty("receive_address")
        private String receiveAddress;

        /**
         * 订单号生成的物流单号
         */
        @JsonProperty("pre_delivery_id")
        private String preDeliveryId;

        /**
         * 物流商处理结果
         */
        @JsonProperty("handle_result")
        private String handleResult;

        /**
         * 物流商快递编码
         */
        @JsonProperty("express_company_id")
        private Long expressCompanyId;

        /**
         * 赔付状态 0:默认,1:未赔付,2:已赔付
         */
        @JsonProperty("compensate_state")
        private Integer compensateState;

        /**
         * 赔付金额(单位:分)
         */
        @JsonProperty("compensate_amount")
        private Long compensateAmount;

        /**
         * 物流商回传凭证
         */
        @JsonProperty("express_attachment")
        private List<String> expressAttachment;

        /**
         * 0:默认,1:未签收,2:已签收
         */
        @JsonProperty("sign_state")
        private Integer signState;

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

        /**
         * 工单退回次数
         */
        @JsonProperty("retreat_count")
        private Long retreatCount;

        /**
         * 联系人姓名
         */
        @JsonProperty("receive_name")
        private String receiveName;

        /**
         * 联系人电话
         */
        @JsonProperty("receive_contact")
        private String receiveContact;

        /**
         * 工单创建时间戳
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 工单最后更新时间戳
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        /**
         * 问题描述
         */
        @JsonProperty("title")
        private String title;

        /**
         * 备注
         */
        @JsonProperty("description")
        private String description;

        /**
         * 问题来源，	0:买家,1:卖家
         */
        @JsonProperty("source")
        private Integer source;

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
         * 紧急度，0:中,1:紧急
         */
        @JsonProperty("urgent_type")
        private Integer urgentType;

        /**
         * 问题类型id
         */
        @JsonProperty("type_id")
        private Long typeId;

        /**
         * 附件列表
         */
        @JsonProperty("attach_url")
        private List<String> attachUrl;

        /**
         * 工单状态， 0:待确认,1:跟进中,2:待回访,3:已完结
         */
        @JsonProperty("status")
        private Integer status;

        
        public String getSendAddress() {
            return sendAddress;
        }

        public Integer getCreateType() {
            return createType;
        }

        public Integer getDuty() {
            return duty;
        }

        public String getReceiveAddress() {
            return receiveAddress;
        }

        public String getPreDeliveryId() {
            return preDeliveryId;
        }

        public String getHandleResult() {
            return handleResult;
        }

        public Long getExpressCompanyId() {
            return expressCompanyId;
        }

        public Integer getCompensateState() {
            return compensateState;
        }

        public Long getCompensateAmount() {
            return compensateAmount;
        }

        public List<String> getExpressAttachment() {
            return expressAttachment;
        }

        public Integer getSignState() {
            return signState;
        }

        public String getExpressDealer() {
            return expressDealer;
        }

        public String getExpressDealerContact() {
            return expressDealerContact;
        }

        public Long getRetreatCount() {
            return retreatCount;
        }

        public String getReceiveName() {
            return receiveName;
        }

        public String getReceiveContact() {
            return receiveContact;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public Integer getSource() {
            return source;
        }

        public Long getTicketId() {
            return ticketId;
        }

        public String getWaybillNo() {
            return waybillNo;
        }

        public Integer getUrgentType() {
            return urgentType;
        }

        public Long getTypeId() {
            return typeId;
        }

        public List<String> getAttachUrl() {
            return attachUrl;
        }

        public Integer getStatus() {
            return status;
        }

        
    }
    
}