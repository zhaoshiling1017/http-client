package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkWeappQrcodeUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkWeappQrcodeUrlGenRequest extends PopBaseHttpRequest<PddDdkWeappQrcodeUrlGenResponse>{

    /**
     * 推广位ID
     */
    @JsonProperty("p_id")
    private String pId;

    /**
     * 商品ID，仅支持单个查询
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 自定义参数，为链接打上自定义标签。自定义参数最长限制64个字节。
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

    
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
        return "pdd.ddk.weapp.qrcode.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkWeappQrcodeUrlGenResponse> getResponseClass() {
        return PddDdkWeappQrcodeUrlGenResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pId != null) {
            paramsMap.put("p_id", pId.toString());
            
        }
        if(goodsIdList != null) {
            paramsMap.put("goods_id_list", goodsIdList.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        if(zsDuoId != null) {
            paramsMap.put("zs_duo_id", zsDuoId.toString());
            
        }
        
        return paramsMap;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    
    
}