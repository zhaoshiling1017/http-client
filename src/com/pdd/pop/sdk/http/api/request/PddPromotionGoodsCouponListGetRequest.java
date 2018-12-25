package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddPromotionGoodsCouponListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddPromotionGoodsCouponListGetRequest extends PopBaseHttpRequest<PddPromotionGoodsCouponListGetResponse>{

    /**
     * 页码，默认1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页数量，默认100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 商品ID
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 查询范围	0 全部，1 多多进宝券，2 无门槛商品券；默认1
     */
    @JsonProperty("query_range")
    private Integer queryRange;

    /**
     * 批次状态	1 领取中，2 已领完，3 已结束，4 已暂停
     */
    @JsonProperty("batch_status")
    private Integer batchStatus;

    /**
     * 排序	1 创建时间正序，2 创建时间倒序，3 开始时间正序，4 开始时间倒序，5 初始数量正序， 6 初始数量倒序，7 领取数量正序，8 领取数量倒序；默认2
     */
    @JsonProperty("sort_by")
    private Integer sortBy;

    
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
        return "pdd.promotion.goods.coupon.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPromotionGoodsCouponListGetResponse> getResponseClass() {
        return PddPromotionGoodsCouponListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(goodsId != null) {
            paramsMap.put("goods_id", goodsId.toString());
            
        }
        if(queryRange != null) {
            paramsMap.put("query_range", queryRange.toString());
            
        }
        if(batchStatus != null) {
            paramsMap.put("batch_status", batchStatus.toString());
            
        }
        if(sortBy != null) {
            paramsMap.put("sort_by", sortBy.toString());
            
        }
        
        return paramsMap;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setQueryRange(Integer queryRange) {
        this.queryRange = queryRange;
    }

    public void setBatchStatus(Integer batchStatus) {
        this.batchStatus = batchStatus;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }

    
    
}