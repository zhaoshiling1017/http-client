package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkCmsPromUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkCmsPromUrlGenerateRequest extends PopBaseHttpRequest<PddDdkCmsPromUrlGenerateResponse>{

    /**
     * 是否生成短链接，true-是，false-否
     */
    @JsonProperty("generate_short_url")
    private Boolean generateShortUrl;

    /**
     * 推广位列表，例如：["60005_612"]
     */
    @JsonProperty("p_id_list")
    private List<String> pIdList;

    /**
     * 是否生成手机跳转链接。true-是，false-否，默认false
     */
    @JsonProperty("generate_mobile")
    private Boolean generateMobile;

    /**
     * 单人团多人团标志。true-多人团，false-单人团 默认false
     */
    @JsonProperty("multi_group")
    private Boolean multiGroup;

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
    @JsonProperty("we_app_web_view_url")
    private Boolean weAppWebViewUrl;

    /**
     * 0, "1.9包邮"；1, "今日爆款"； 2, "品牌清仓"； 4,"PC端专属商城"；5，“赚多多币兑现金”；不传值为默认商城；
     */
    @JsonProperty("channel_type")
    private Integer channelType;

    
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
        return "pdd.ddk.cms.prom.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkCmsPromUrlGenerateResponse> getResponseClass() {
        return PddDdkCmsPromUrlGenerateResponse.class;
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
        if(generateMobile != null) {
            paramsMap.put("generate_mobile", generateMobile.toString());
            
        }
        if(multiGroup != null) {
            paramsMap.put("multi_group", multiGroup.toString());
            
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
        if(weAppWebViewUrl != null) {
            paramsMap.put("we_app_web_view_url", weAppWebViewUrl.toString());
            
        }
        if(channelType != null) {
            paramsMap.put("channel_type", channelType.toString());
            
        }
        
        return paramsMap;
    }

    public void setGenerateShortUrl(Boolean generateShortUrl) {
        this.generateShortUrl = generateShortUrl;
    }

    public void setPIdList(List<String> pIdList) {
        this.pIdList = pIdList;
    }

    public void setGenerateMobile(Boolean generateMobile) {
        this.generateMobile = generateMobile;
    }

    public void setMultiGroup(Boolean multiGroup) {
        this.multiGroup = multiGroup;
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

    public void setWeAppWebViewUrl(Boolean weAppWebViewUrl) {
        this.weAppWebViewUrl = weAppWebViewUrl;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    
    
}