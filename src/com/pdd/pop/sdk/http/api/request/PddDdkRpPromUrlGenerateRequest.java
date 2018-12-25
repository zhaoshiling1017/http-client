package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkRpPromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkRpPromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkRpPromUrlGenerateResponse>{

    /**
     * 是否生成短链接。true-是，false-否，默认false
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * 推广位列表，例如：["60005_612"]
     */
    @JsonProperty("p_id_list")
    private List<String> pIdList;

    /**
     * 自定义参数，为链接打上自定义标签。自定义参数最长限制64个字节。
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否唤起微信客户端， 默认false 否，true 是
     */
    @JsonProperty("generate_weapp_webview")
    private Boolean generateWeappWebview;

    /**
     * 唤起微信app推广短链接
     */
    @JsonProperty("we_app_web_view_short_url")
    private Boolean weAppWebViewShortUrl;

    /**
     * 唤起微信app推广链接
     */
    @JsonProperty("we_app_web_wiew_url")
    private Boolean weAppWebWiewUrl;

    /**
     * 是否生成小程序推广
     */
    @JsonProperty("generate_we_app")
    private Boolean generateWeApp;

    
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
        return "pdd.ddk.rp.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkRpPromUrlGenerateResponse> getResponseClass() {
        return PddDdkRpPromUrlGenerateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(generateShortUrl != null) {
            paramsMap.put("generate_short_url", generateShortUrl.toString());
            
        }
        if(pIdList != null) {
            paramsMap.put("p_id_list", JsonUtil.transferToJson(pIdList));
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        if(generateWeappWebview != null) {
            paramsMap.put("generate_weapp_webview", generateWeappWebview.toString());
            
        }
        if(weAppWebViewShortUrl != null) {
            paramsMap.put("we_app_web_view_short_url", weAppWebViewShortUrl.toString());
            
        }
        if(weAppWebWiewUrl != null) {
            paramsMap.put("we_app_web_wiew_url", weAppWebWiewUrl.toString());
            
        }
        if(generateWeApp != null) {
            paramsMap.put("generate_we_app", generateWeApp.toString());
            
        }
        
        return paramsMap;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setPIdList(List<String> pIdList) {
        this.pIdList = pIdList;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    public void setGenerateWeappWebview(Boolean generateWeappWebview) {
        this.generateWeappWebview = generateWeappWebview;
    }

    public void setWeAppWebViewShortUrl(Boolean weAppWebViewShortUrl) {
        this.weAppWebViewShortUrl = weAppWebViewShortUrl;
    }

    public void setWeAppWebWiewUrl(Boolean weAppWebWiewUrl) {
        this.weAppWebWiewUrl = weAppWebWiewUrl;
    }

    public void setGenerateWeApp(Boolean generateWeApp) {
        this.generateWeApp = generateWeApp;
    }

    
    
}