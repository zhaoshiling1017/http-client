package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdKeywordRcommendedGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_recommended_keyword_list_response")
    private AdRecommendedKeywordListResponse adRecommendedKeywordListResponse;

    
    public AdRecommendedKeywordListResponse getAdRecommendedKeywordListResponse() {
        return adRecommendedKeywordListResponse;
    }

    
    public static class AdRecommendedKeywordListResponse {

        /**
         * 推荐关键字列表
         */
        @JsonProperty("recommended_keyword_list")
        private List<RecommendedKeywordListItem> recommendedKeywordList;

        
        public List<RecommendedKeywordListItem> getRecommendedKeywordList() {
            return recommendedKeywordList;
        }

        
    }
    public static class RecommendedKeywordListItem {

        /**
         * 分数
         */
        @JsonProperty("score")
        private Double score;

        /**
         * 热度
         */
        @JsonProperty("heat")
        private Double heat;

        /**
         * 趋势
         */
        @JsonProperty("trend")
        private Double trend;

        /**
         * 竞争力
         */
        @JsonProperty("compete")
        private Double compete;

        /**
         * 平均出价
         */
        @JsonProperty("avg_bid")
        private Double avgBid;

        /**
         * 相关性
         */
        @JsonProperty("relevance")
        private Integer relevance;

        /**
         * 关键词
         */
        @JsonProperty("word")
        private String word;

        
        public Double getScore() {
            return score;
        }

        public Double getHeat() {
            return heat;
        }

        public Double getTrend() {
            return trend;
        }

        public Double getCompete() {
            return compete;
        }

        public Double getAvgBid() {
            return avgBid;
        }

        public Integer getRelevance() {
            return relevance;
        }

        public String getWord() {
            return word;
        }

        
    }
    
}