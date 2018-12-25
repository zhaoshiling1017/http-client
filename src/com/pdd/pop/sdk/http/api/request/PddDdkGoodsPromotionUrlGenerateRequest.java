package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsPromotionUrlGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsPromotionUrlGenerateRequest extends PopBaseHttpRequest<PddDdkGoodsPromotionUrlGenerateResponse>{

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
     * 自定义参数，为链接打上自定义标签。自定义参数最长限制64个字节。
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    /**
     * 是否开启订单拉新，true表示开启（订单拉新奖励特权仅支持白名单，请联系工作人员开通）
     */
    @JsonProperty("pull_new")
    private Boolean pullNew;

    /**
     * 是否生成唤起微信客户端链接，true-是，false-否，默认false
     */
    @JsonProperty("generate_weapp_webview")
    private Boolean generateWeappWebview;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

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
        return "pdd.ddk.goods.promotion.url.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPromotionUrlGenerateResponse> getResponseClass() {
        return PddDdkGoodsPromotionUrlGenerateResponse.class;
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
        if(generateShortUrl != null) {
            paramsMap.put("generate_short_url", generateShortUrl.toString());
            
        }
        if(multiGroup != null) {
            paramsMap.put("multi_group", multiGroup.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        if(pullNew != null) {
            paramsMap.put("pull_new", pullNew.toString());
            
        }
        if(generateWeappWebview != null) {
            paramsMap.put("generate_weapp_webview", generateWeappWebview.toString());
            
        }
        if(zsDuoId != null) {
            paramsMap.put("zs_duo_id", zsDuoId.toString());
            
        }
        if(generateWeApp != null) {
            paramsMap.put("generate_we_app", generateWeApp.toString());
            
        }
        
        return paramsMap;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
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

    public void setPullNew(Boolean pullNew) {
        this.pullNew = pullNew;
    }

    public void setGenerateWeappWebview(Boolean generateWeappWebview) {
        this.generateWeappWebview = generateWeappWebview;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public void setGenerateWeApp(Boolean generateWeApp) {
        this.generateWeApp = generateWeApp;
    }

    
    
}