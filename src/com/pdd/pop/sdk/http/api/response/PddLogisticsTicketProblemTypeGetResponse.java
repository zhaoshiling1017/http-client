package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsTicketProblemTypeGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("logistics_problem_type_get_response")
    private LogisticsProblemTypeGetResponse logisticsProblemTypeGetResponse;

    
    public LogisticsProblemTypeGetResponse getLogisticsProblemTypeGetResponse() {
        return logisticsProblemTypeGetResponse;
    }

    
    public static class LogisticsProblemTypeGetResponse {

        /**
         * 问题类型list
         */
        @JsonProperty("logistics_problem_type_list")
        private List<LogisticsProblemTypeListItem> logisticsProblemTypeList;

        
        public List<LogisticsProblemTypeListItem> getLogisticsProblemTypeList() {
            return logisticsProblemTypeList;
        }

        
    }
    public static class LogisticsProblemTypeListItem {

        /**
         * 问题类型描述
         */
        @JsonProperty("type_desc")
        private String typeDesc;

        /**
         * 问题类型id
         */
        @JsonProperty("id")
        private Long id;

        
        public String getTypeDesc() {
            return typeDesc;
        }

        public Long getId() {
            return id;
        }

        
    }
    
}