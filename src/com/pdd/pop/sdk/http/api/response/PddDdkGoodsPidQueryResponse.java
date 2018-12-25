package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsPidQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("p_id_query_response")
    private PIdQueryResponse pIdQueryResponse;

    
    public PIdQueryResponse getPIdQueryResponse() {
        return pIdQueryResponse;
    }

    
    public static class PIdQueryResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("p_id_list")
        private List<PIdListItem> pIdList;

        /**
         * 返回推广位总数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        
        public List<PIdListItem> getPIdList() {
            return pIdList;
        }

        public Long getTotalCount() {
            return totalCount;
        }

        
    }
    public static class PIdListItem {

        /**
         * 推广位生成时间
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        
        public Long getCreateTime() {
            return createTime;
        }

        public String getPId() {
            return pId;
        }

        
    }
    
}