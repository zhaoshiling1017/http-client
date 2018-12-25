package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkOauthMallUrlGenResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddDdkOauthMallUrlGenRequest extends PopBaseHttpRequest<PddDdkOauthMallUrlGenResponse>{

    /**
     * 店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 推广位
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 是否生成唤起微信客户端链接，true-是，false-否，默认false
     */
    @JsonProperty("generate_weapp_webview")
    private Boolean generateWeappWebview;

    /**
     * 是否生成短链接，true-是，false-否
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * true--生成多人团推广链接 false--生成单人团推广链接（默认false）1、单人团推广链接：用户访问单人团推广链接，可直接购买商品无需拼团。2、多人团推广链接：用户访问双人团推广链接开团，若用户分享给他人参团，则开团者和参团者的佣金均结算给推手
     */
    @JsonProperty("multi_group")
    private Boolean multiGroup;

    /**
     * 自定义参数，为链接打上自定义标签。自定义参数最长限制64个字节
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
        return "pdd.ddk.oauth.mall.url.gen";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkOauthMallUrlGenResponse> getResponseClass() {
        return PddDdkOauthMallUrlGenResponse.class;
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
        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(generateWeappWebview != null) {
            paramsMap.put("generate_weapp_webview", generateWeappWebview.toString());
            
        }
        if(generateShortUrl != null) {
            paramsMap.put("generate_short_url", generateShortUrl.toString());
            
        }
        if(multiGroup != null) {
            paramsMap.put("multi_group", multiGroup.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        
        return paramsMap;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setGenerateWeappWebview(Boolean generateWeappWebview) {
        this.generateWeappWebview = generateWeappWebview;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setMultiGroup(Boolean multiGroup) {
        this.multiGroup = multiGroup;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    
    
}