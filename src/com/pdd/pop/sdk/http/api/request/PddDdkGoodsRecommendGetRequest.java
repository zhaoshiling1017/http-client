package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsRecommendGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsRecommendGetRequest extends PopBaseHttpRequest<PddDdkGoodsRecommendGetResponse>{

    /**
     * 从多少位置开始请求；默认值 ： 0
     */
    @JsonProperty("offset")
    private Integer offset;

    /**
     * 请求数量；默认值 ： 400
     */
    @JsonProperty("limit")
    private Integer limit;

    /**
     * 频道类型；0, "1.9包邮", 1, "今日爆款", 2, "品牌清仓", 3, "默认商城", 非必填 ,默认是1
     */
    @JsonProperty("channel_type")
    private Integer channelType;

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
        return "pdd.ddk.goods.recommend.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsRecommendGetResponse> getResponseClass() {
        return PddDdkGoodsRecommendGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(offset != null) {
            paramsMap.put("offset", offset.toString());
            
        }
        if(limit != null) {
            paramsMap.put("limit", limit.toString());
            
        }
        if(channelType != null) {
            paramsMap.put("channel_type", channelType.toString());
            
        }
        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        
        return paramsMap;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    
    
}