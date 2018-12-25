package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddSmsCustomTemplateQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("sms_custom_template_list_query_response")
    private SmsCustomTemplateListQueryResponse smsCustomTemplateListQueryResponse;

    
    public SmsCustomTemplateListQueryResponse getSmsCustomTemplateListQueryResponse() {
        return smsCustomTemplateListQueryResponse;
    }

    
    public static class ContentItem {

        /**
         * 类型
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * id
         */
        @JsonProperty("id")
        private Integer id;

        
        public Integer getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        public Integer getId() {
            return id;
        }

        
    }
    public static class SmsCustomTemplateListQueryResponse {

        /**
         * 总数量
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
         * 模板id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 模板名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 更新时间
         */
        @JsonProperty("updated_time")
        private Long updatedTime;

        /**
         * 内容
         */
        @JsonProperty("content")
        private List<ContentItem> content;

        /**
         * 状态
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 原因
         */
        @JsonProperty("reason")
        private String reason;

        
        public Long getId() {
            return id;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getName() {
            return name;
        }

        public Long getUpdatedTime() {
            return updatedTime;
        }

        public List<ContentItem> getContent() {
            return content;
        }

        public Integer getStatus() {
            return status;
        }

        public String getReason() {
            return reason;
        }

        
    }
    
}