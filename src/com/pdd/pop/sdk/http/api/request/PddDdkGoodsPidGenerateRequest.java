package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsPidGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsPidGenerateRequest extends PopBaseHttpRequest<PddDdkGoodsPidGenerateResponse>{

    /**
     * 要生成的推广位数量，默认为10，范围为：1~100
     */
    @JsonProperty("number")
    private Long number;

    /**
     * 推广位名称，例如["1","2"]
     */
    @JsonProperty("p_id_name_list")
    private List<String> pIdNameList;

    
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
        return "pdd.ddk.goods.pid.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPidGenerateResponse> getResponseClass() {
        return PddDdkGoodsPidGenerateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(number != null) {
            paramsMap.put("number", number.toString());
            
        }
        if(pIdNameList != null) {
            paramsMap.put("p_id_name_list", JsonUtil.transferToJson(pIdNameList));
            
        }
        
        return paramsMap;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setPIdNameList(List<String> pIdNameList) {
        this.pIdNameList = pIdNameList;
    }

    
    
}