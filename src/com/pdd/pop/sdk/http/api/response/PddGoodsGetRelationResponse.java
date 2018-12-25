package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsGetRelationResponse extends PopBaseHttpResponse{

    /**
     * 映射关系查询返回对象列表
     */
    @JsonProperty("query_goods_relation_response")
    private List<QueryGoodsRelationResponseItem> queryGoodsRelationResponse;

    
    public List<QueryGoodsRelationResponseItem> getQueryGoodsRelationResponse() {
        return queryGoodsRelationResponse;
    }

    
    public static class QueryGoodsRelationResponseItem {

        /**
         * 拼多多商品id
         */
        @JsonProperty("pdd_goods_id")
        private Long pddGoodsId;

        /**
         * 外部平台枚举值， 淘宝/天猫 0，京东1，1688 2，唯品会3，苏宁4，亚马逊,5，网易6，其他7
         */
        @JsonProperty("out_goods_platform")
        private Integer outGoodsPlatform;

        /**
         * 外部平台商品id
         */
        @JsonProperty("out_goods_id")
        private String outGoodsId;

        
        public Long getPddGoodsId() {
            return pddGoodsId;
        }

        public Integer getOutGoodsPlatform() {
            return outGoodsPlatform;
        }

        public String getOutGoodsId() {
            return outGoodsId;
        }

        
    }
    
}