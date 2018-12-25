package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdKeywordRelevanceGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("ad_keyword_relevance_list_response")
    private AdKeywordRelevanceListResponse adKeywordRelevanceListResponse;

    
    public AdKeywordRelevanceListResponse getAdKeywordRelevanceListResponse() {
        return adKeywordRelevanceListResponse;
    }

    
    public static class AdKeywordRelevanceListResponse {

        /**
         * 关键词相关新列表
         */
        @JsonProperty("keyword_relevance_list")
        private List<KeywordRelevanceListItem> keywordRelevanceList;

        
        public List<KeywordRelevanceListItem> getKeywordRelevanceList() {
            return keywordRelevanceList;
        }

        
    }
    public static class KeywordRelevanceListItem {

        /**
         * 相关性
         */
        @JsonProperty("relevance")
        private String relevance;

        /**
         * 关键词
         */
        @JsonProperty("word")
        private String word;

        
        public String getRelevance() {
            return relevance;
        }

        public String getWord() {
            return word;
        }

        
    }
    
}