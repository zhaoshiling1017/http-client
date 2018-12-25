package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddPromotionGoodsCouponCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddPromotionGoodsCouponCreateRequest extends PopBaseHttpRequest<PddPromotionGoodsCouponCreateResponse>{

    /**
     * 描述
     */
    @JsonProperty("batch_desc")
    private String batchDesc;

    /**
     * 开始时间，指到格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)的总毫秒数
     */
    @JsonProperty("batch_start_time")
    private Long batchStartTime;

    /**
     * 结束时间，指到格林威治时间 1970 年 01 月 01 日 00 时 00 分 00 秒(北京时间 1970 年 01 月 01 日 08 时 00 分 00 秒)的总毫秒数
     */
    @JsonProperty("batch_end_time")
    private Long batchEndTime;

    /**
     * 优惠金额	单位: 分
     */
    @JsonProperty("discount")
    private Long discount;

    /**
     * 可领取数量
     */
    @JsonProperty("init_quantity")
    private Long initQuantity;

    /**
     * 每个用户限领张数
     */
    @JsonProperty("user_limit")
    private Long userLimit;

    /**
     * 商品ID
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    
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
        return "pdd.promotion.goods.coupon.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionGoodsCouponCreateResponse> getResponseClass() {
        return PddPromotionGoodsCouponCreateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(batchDesc != null) {
            paramsMap.put("batch_desc", batchDesc.toString());
            
        }
        if(batchStartTime != null) {
            paramsMap.put("batch_start_time", batchStartTime.toString());
            
        }
        if(batchEndTime != null) {
            paramsMap.put("batch_end_time", batchEndTime.toString());
            
        }
        if(discount != null) {
            paramsMap.put("discount", discount.toString());
            
        }
        if(initQuantity != null) {
            paramsMap.put("init_quantity", initQuantity.toString());
            
        }
        if(userLimit != null) {
            paramsMap.put("user_limit", userLimit.toString());
            
        }
        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        
        return paramsMap;
    }

    public void setBatchDesc(String batchDesc) {
        this.batchDesc = batchDesc;
    }

    public void setBatchStartTime(Long batchStartTime) {
        this.batchStartTime = batchStartTime;
    }

    public void setBatchEndTime(Long batchEndTime) {
        this.batchEndTime = batchEndTime;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public void setInitQuantity(Long initQuantity) {
        this.initQuantity = initQuantity;
    }

    public void setUserLimit(Long userLimit) {
        this.userLimit = userLimit;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    
    
}