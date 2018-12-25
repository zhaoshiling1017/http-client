package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdBidQueryProfileResponse extends PopBaseHttpResponse{

    /**
     * 开平返回
     */
    @JsonProperty("open_api_response")
    private List<OpenApiResponseItem> openApiResponse;

    
    public List<OpenApiResponseItem> getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponseItem {

        /**
         * 兴趣点信息
         */
        @JsonProperty("features")
        private List<FeaturesItem> features;

        /**
         * 用户数量
         */
        @JsonProperty("uv")
        private Long uv;

        /**
         * 定向类型， 2：访客重定向 3：相似商品定向 4：叶子类目定向 5：相似店铺定向 6：近期对我的商品相关属性感兴趣的用户
         */
        @JsonProperty("target_type")
        private Integer targetType;

        
        public List<FeaturesItem> getFeatures() {
            return features;
        }

        public Long getUv() {
            return uv;
        }

        public Integer getTargetType() {
            return targetType;
        }

        
    }
    public static class FeaturesItem {

        /**
         * 用户数量
         */
        @JsonProperty("uv")
        private Long uv;

        /**
         * 兴趣点名称
         */
        @JsonProperty("sub_level_target_name")
        private String subLevelTargetName;

        /**
         * 兴趣点ID
         */
        @JsonProperty("sub_level_target_id")
        private Long subLevelTargetId;

        
        public Long getUv() {
            return uv;
        }

        public String getSubLevelTargetName() {
            return subLevelTargetName;
        }

        public Long getSubLevelTargetId() {
            return subLevelTargetId;
        }

        
    }
    
}