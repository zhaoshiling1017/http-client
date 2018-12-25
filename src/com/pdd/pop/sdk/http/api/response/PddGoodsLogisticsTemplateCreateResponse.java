package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsLogisticsTemplateCreateResponse extends PopBaseHttpResponse{

    /**
     * 返回resposne
     */
    @JsonProperty("goods_logistics_template_create_response")
    private GoodsLogisticsTemplateCreateResponse goodsLogisticsTemplateCreateResponse;

    
    public GoodsLogisticsTemplateCreateResponse getGoodsLogisticsTemplateCreateResponse() {
        return goodsLogisticsTemplateCreateResponse;
    }

    
    public static class GoodsLogisticsTemplateCreateResponse {

        /**
         * 模版id
         */
        @JsonProperty("template_id")
        private Long templateId;

        
        public Long getTemplateId() {
            return templateId;
        }

        
    }
    
}