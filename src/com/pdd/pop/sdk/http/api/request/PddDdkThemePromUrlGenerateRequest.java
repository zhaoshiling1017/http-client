package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkThemePromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkThemePromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkThemePromUrlGenerateResponse>{

    /**
     * 推广位ID
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 主题ID列表,例如[1,235]
     */
    @JsonProperty("theme_id_list")
    private List<Long> themeIdList;

    /**
     * 是否生成短链接,true-是,false-否
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * 是否生成手机跳转链接。true-是,false-否,默认false
     */
    @JsonProperty("generate_mobile")
    private Boolean generateMobile;

    /**
     * 自定义参数,为链接打上自定义标签。自定义参数最长限制64个字节。
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
        return "pdd.ddk.theme.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkThemePromUrlGenerateResponse> getResponseClass() {
        return PddDdkThemePromUrlGenerateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(themeIdList != null) {
            paramsMap.put("theme_id_list", themeIdList.toString());
            
        }
        if(generateShortUrl != null) {
            paramsMap.put("generate_short_url", generateShortUrl.toString());
            
        }
        if(generateMobile != null) {
            paramsMap.put("generate_mobile", generateMobile.toString());
            
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
        
        return paramsMap;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setThemeIdList(List<Long> themeIdList) {
        this.themeIdList = themeIdList;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setGenerateMobile(Boolean generateMobile) {
        this.generateMobile = generateMobile;
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

    
    
}