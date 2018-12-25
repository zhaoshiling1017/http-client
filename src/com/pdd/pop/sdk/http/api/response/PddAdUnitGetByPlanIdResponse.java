package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdUnitGetByPlanIdResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_unit_base_info_List_response")
    private AdUnitBaseInfoListResponse adUnitBaseInfoListResponse;

    
    public AdUnitBaseInfoListResponse getAdUnitBaseInfoListResponse() {
        return adUnitBaseInfoListResponse;
    }

    
    public static class UnitBaseInfoListItem {

        /**
         * 关键词个数
         */
        @JsonProperty("keyword_count")
        private Long keywordCount;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 单元状态：1 - 已启用 2 - 已暂停
         */
        @JsonProperty("unit_status")
        private Integer unitStatus;

        /**
         * 单元id
         */
        @JsonProperty("unit_id")
        private Long unitId;

        
        public Long getKeywordCount() {
            return keywordCount;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Integer getUnitStatus() {
            return unitStatus;
        }

        public Long getUnitId() {
            return unitId;
        }

        
    }
    public static class AdUnitBaseInfoListResponse {

        /**
         * 推广单元基本信息
         */
        @JsonProperty("unit_base_info_list")
        private List<UnitBaseInfoListItem> unitBaseInfoList;

        
        public List<UnitBaseInfoListItem> getUnitBaseInfoList() {
            return unitBaseInfoList;
        }

        
    }
    
}