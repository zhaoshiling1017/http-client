package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddPromotionGoodsCouponCreateResponse extends PopBaseHttpResponse{

    /**
     * 创建无门槛商品劵批次对象
     */
    @JsonProperty("goods_coupon_batch_create_response")
    private GoodsCouponBatchCreateResponse goodsCouponBatchCreateResponse;

    
    public GoodsCouponBatchCreateResponse getGoodsCouponBatchCreateResponse() {
        return goodsCouponBatchCreateResponse;
    }

    
    public static class GoodsCouponBatchCreateResponse {

        /**
         * 创建的无门槛商品劵批次id
         */
        @JsonProperty("batch_id")
        private Long batchId;

        
        public Long getBatchId() {
            return batchId;
        }

        
    }
    
}