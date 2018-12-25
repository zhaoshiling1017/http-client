package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsCsHistoryMessageGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_cs_history_message_get_response")
    private LogisticsCsHistoryMessageGetResponse logisticsCsHistoryMessageGetResponse;

    
    public LogisticsCsHistoryMessageGetResponse getLogisticsCsHistoryMessageGetResponse() {
        return logisticsCsHistoryMessageGetResponse;
    }

    
    public static class LogisticsCsHistoryMessageGetResponse {

        /**
         * 消息列表
         */
        @JsonProperty("message_infos")
        private List<MessageInfosItem> messageInfos;

        
        public List<MessageInfosItem> getMessageInfos() {
            return messageInfos;
        }

        
    }
    public static class MessageInfosItem {

        /**
         * 消息id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 消息时间戳,样式YYYY-MM-DD HH:MM:SS
         */
        @JsonProperty("msg_ts")
        private String msgTs;

        /**
         * 0为用户 1为机器人
         */
        @JsonProperty("from_type")
        private Integer fromType;

        /**
         * 聊天内容，如果是图片的话，则是图片的url
         */
        @JsonProperty("text")
        private String text;

        
        public Long getId() {
            return id;
        }

        public String getMsgTs() {
            return msgTs;
        }

        public Integer getFromType() {
            return fromType;
        }

        public String getText() {
            return text;
        }

        
    }
    
}