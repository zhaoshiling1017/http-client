package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsSkuPriceUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddGoodsSkuPriceUpdateRequest extends PopBaseHttpRequest<PddGoodsSkuPriceUpdateResponse>{

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 待修改的sku价格
     */
    @JsonProperty("sku_price_list")
    private List<SkuPriceListItem> skuPriceList;

    
    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public String getType() {
        return "pdd.goods.sku.price.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSkuPriceUpdateResponse> getResponseClass() {
        return PddGoodsSkuPriceUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        if(skuPriceList != null) {
            paramsMap.put("sku_price_list", skuPriceList.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setSkuPriceList(List<SkuPriceListItem> skuPriceList) {
        this.skuPriceList = skuPriceList;
    }

    
    public static class SkuPriceListItem {

        /**
         * sku上架状态，0-已下架，1-上架中
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * 单独购买价格（单位分）
         */
        @JsonProperty("single_price")
        private Long singlePrice;

        /**
         * 拼团购买价格（单位分）
         */
        @JsonProperty("group_price")
        private Long groupPrice;

        /**
         * sku标识
         */
        @JsonProperty("sku_id")
        private Long skuId;

        
        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        public void setSinglePrice(Long singlePrice) {
            this.singlePrice = singlePrice;
        }

        public void setGroupPrice(Long groupPrice) {
            this.groupPrice = groupPrice;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}