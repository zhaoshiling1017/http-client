package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddGoodsImageUploadResponse extends PopBaseHttpResponse{

    /**
     * 商品图片上传响应对象
     */
    @JsonProperty("goods_image_upload_response")
    private GoodsImageUploadResponse goodsImageUploadResponse;

    
    public GoodsImageUploadResponse getGoodsImageUploadResponse() {
        return goodsImageUploadResponse;
    }

    
    public static class GoodsImageUploadResponse {

        /**
         * 返回图片url
         */
        @JsonProperty("image_url")
        private String imageUrl;

        
        public String getImageUrl() {
            return imageUrl;
        }

        
    }
    
}