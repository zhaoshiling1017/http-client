package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsDetailResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsDetailRequest extends PopBaseHttpRequest<PddDdkGoodsDetailResponse>{

    /**
     * 商品ID，仅支持单个查询。例如：[123456]
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 自定义参数
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    
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
        return "pdd.ddk.goods.detail";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsDetailResponse> getResponseClass() {
        return PddDdkGoodsDetailResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(goodsIdList != null) {
            paramsMap.put("goods_id_list", goodsIdList.toString());
            
        }
        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    
    
}