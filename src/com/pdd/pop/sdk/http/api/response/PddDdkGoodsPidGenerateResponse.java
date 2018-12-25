package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkGoodsPidGenerateResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("p_id_generate_response")
    private PIdGenerateResponse pIdGenerateResponse;

    
    public PIdGenerateResponse getPIdGenerateResponse() {
        return pIdGenerateResponse;
    }

    
    public static class PIdGenerateResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("p_id_list")
        private List<PIdListItem> pIdList;

        
        public List<PIdListItem> getPIdList() {
            return pIdList;
        }

        
    }
    public static class PIdListItem {

        /**
         * 推广位名称
         */
        @JsonProperty("p_id_name")
        private String pIdName;

        /**
         * 调用方推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        
        public String getPIdName() {
            return pIdName;
        }

        public String getPId() {
            return pId;
        }

        
    }
    
}