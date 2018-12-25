package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddMallInfoVerifyApplicationAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddMallInfoVerifyApplicationAddRequest extends PopBaseHttpRequest<PddMallInfoVerifyApplicationAddResponse>{

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 第三方软件账号id
     */
    @JsonProperty("user_id")
    private String userId;

    /**
     * 店主名称
     */
    @JsonProperty("ww_name")
    private String wwName;

    
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
        return "pdd.mall.info.verify.application.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoVerifyApplicationAddResponse> getResponseClass() {
        return PddMallInfoVerifyApplicationAddResponse.class;
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
        if(userId != null) {
            paramsMap.put("user_id", userId.toString());
            
        }
        if(wwName != null) {
            paramsMap.put("ww_name", wwName.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setWwName(String wwName) {
        this.wwName = wwName;
    }

    
    
}