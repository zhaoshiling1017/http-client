package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkMallGoodsListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkMallGoodsListGetRequest extends PopBaseHttpRequest<PddDdkMallGoodsListGetResponse>{

    /**
     * 店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 分页数
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 每页商品数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    
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
        return "pdd.ddk.mall.goods.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkMallGoodsListGetResponse> getResponseClass() {
        return PddDdkMallGoodsListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(mallId != null) {
            paramsMap.put("mall_id", mallId.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        
        return paramsMap;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    
    
}