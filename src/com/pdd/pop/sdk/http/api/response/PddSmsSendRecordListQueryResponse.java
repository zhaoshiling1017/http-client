package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsSendRecordListQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_send_record_list_query_response")
    private SmsSendRecordListQueryResponse smsSendRecordListQueryResponse;

    
    public SmsSendRecordListQueryResponse getSmsSendRecordListQueryResponse() {
        return smsSendRecordListQueryResponse;
    }

    
    public static class SmsSendRecordListQueryResponse {

        /**
         * 总量
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 结果
         */
        @JsonProperty("result")
        private List<ResultItem> result;

        
        public Integer getTotal() {
            return total;
        }

        public List<ResultItem> getResult() {
            return result;
        }

        
    }
    public static class ResultItem {

        /**
         * 收件人
         */
        @JsonProperty("receiver")
        private String receiver;

        /**
         * 手机号
         */
        @JsonProperty("phone")
        private String phone;

        /**
         * 发送时间
         */
        @JsonProperty("send_time")
        private Long sendTime;

        /**
         * 短信内容
         */
        @JsonProperty("content")
        private String content;

        /**
         * 条数
         */
        @JsonProperty("items_num")
        private Long itemsNum;

        /**
         * 字数
         */
        @JsonProperty("words_num")
        private Long wordsNum;

        /**
         * 发送状态
         */
        @JsonProperty("status")
        private Integer status;

        
        public String getReceiver() {
            return receiver;
        }

        public String getPhone() {
            return phone;
        }

        public Long getSendTime() {
            return sendTime;
        }

        public String getContent() {
            return content;
        }

        public Long getItemsNum() {
            return itemsNum;
        }

        public Long getWordsNum() {
            return wordsNum;
        }

        public Integer getStatus() {
            return status;
        }

        
    }
    
}