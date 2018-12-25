package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddSmsSellRecordListQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_sell_record_list_query_response")
    private SmsSellRecordListQueryResponse smsSellRecordListQueryResponse;

    
    public SmsSellRecordListQueryResponse getSmsSellRecordListQueryResponse() {
        return smsSellRecordListQueryResponse;
    }

    
    public static class SmsSellRecordListQueryResponse {

        /**
         * 总量
         */
        @JsonProperty("total")
        private Integer total;

        /**
         * 结果
         */
        @JsonProperty("result")
        private Result result;

        
        public Integer getTotal() {
            return total;
        }

        public Result getResult() {
            return result;
        }

        
    }
    public static class Result {

        /**
         * 删除用的id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 任务名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 短信类型
         */
        @JsonProperty("scene")
        private Integer scene;

        /**
         * 计划时间
         */
        @JsonProperty("send_time")
        private Long sendTime;

        /**
         * 发送状态
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 发送总数
         */
        @JsonProperty("send_num")
        private Integer sendNum;

        /**
         * 发送失败总数
         */
        @JsonProperty("send_failed_num")
        private Integer sendFailedNum;

        /**
         * 是否开启
         */
        @JsonProperty("open")
        private Integer open;

        
        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Integer getScene() {
            return scene;
        }

        public Long getSendTime() {
            return sendTime;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getSendNum() {
            return sendNum;
        }

        public Integer getSendFailedNum() {
            return sendFailedNum;
        }

        public Integer getOpen() {
            return open;
        }

        
    }
    
}