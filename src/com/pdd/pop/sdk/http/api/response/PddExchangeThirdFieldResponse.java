package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;





public class PddExchangeThirdFieldResponse extends PopBaseHttpResponse{

    /**
     * 商品ID
     */
    @JsonProperty("goods_id")
    private String goodsId;

    /**
     * 商品草稿ID
     */
    @JsonProperty("goods_commit_id")
    private String goodsCommitId;

    
    public String getGoodsId() {
        return goodsId;
    }

    public String getGoodsCommitId() {
        return goodsCommitId;
    }

    
    
}