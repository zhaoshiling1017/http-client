package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddExchangeThirdFieldResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddExchangeThirdFieldRequest extends PopBaseHttpRequest<PddExchangeThirdFieldResponse>{

    /**
     * 第三方平台商品的商品ID
     */
    @JsonProperty("num_iid")
    private String numIid;

    /**
     * 第三方平台商品的商品标题，例如“马克杯”
     */
    @JsonProperty("title")
    private String title;

    /**
     * 第三方平台商品所属的叶子类目id，例如“162653”
     */
    @JsonProperty("cid")
    private String cid;

    /**
     * 第三方平台商品描述，例如“马克杯，高16.cm，白色，http://testimg.yangkeduo.com/pdd_oms/2018-07-13/06b79325f5235b9d420201414ca57488.jpeg"
     */
    @JsonProperty("desc")
    private String desc;

    /**
     * 第三方平台商品主图片地址，例如“http://testimg.yangkeduo.com/pdd_oms/2018-07-13/06b79325f5235b9d420201414ca57488.jpeg"
     */
    @JsonProperty("pic_url")
    private String picUrl;

    /**
     * 第三方平台商品新旧程度，全新new，闲置unused，二手second
     */
    @JsonProperty("stuff_status")
    private String stuffStatus;

    /**
     * 第三方平台商品的商家外部编码，可与商家外部系统对应，例如“34143554352“
     */
    @JsonProperty("outer_id")
    private String outerId;

    /**
     * 拼多多的物流运费模板ID，可使用pdd.logistics.template.get获取
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

    /**
     * 第三方平台商品轮播图地址（包括主图)，最多传5张，例如：
“http://testimg.yangkeduo.com/pdd_oms/2018-07-13/06b79325f5235b9d420201414ca57488.jpeg”
     */
    @JsonProperty("item_imgs_url")
    private String itemImgsUrl;

    /**
     * 第三方

平台商品的sku内容，包括：sku的销售属性组合字符串properties_name（必填，当您上传的商品是单品时可以不传），sku对应的商品数量quantity（必填），sku应的商品价格price（必填），sku的商家外部outer_id（选填），例如：[{"outer_id":"1","price":51, "properties_name":"1627207:28332:颜色:浅灰色","quantity":11}]
     */
    @JsonProperty("skus")
    private String skus;

    /**
     * 拼多多商品分类id，传入的第三方cid无法对应的情况下，可以选择传此id
     */
    @JsonProperty("pdd_cid")
    private String pddCid;

    
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
        return "pdd.exchange.third.field";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExchangeThirdFieldResponse> getResponseClass() {
        return PddExchangeThirdFieldResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(numIid != null) {
            paramsMap.put("num_iid", numIid.toString());
            
        }
        if(title != null) {
            paramsMap.put("title", title.toString());
            
        }
        if(cid != null) {
            paramsMap.put("cid", cid.toString());
            
        }
        if(desc != null) {
            paramsMap.put("desc", desc.toString());
            
        }
        if(picUrl != null) {
            paramsMap.put("pic_url", picUrl.toString());
            
        }
        if(stuffStatus != null) {
            paramsMap.put("stuff_status", stuffStatus.toString());
            
        }
        if(outerId != null) {
            paramsMap.put("outer_id", outerId.toString());
            
        }
        if(costTemplateId != null) {
            paramsMap.put("cost_template_id", costTemplateId.toString());
            
        }
        if(itemImgsUrl != null) {
            paramsMap.put("item_imgs_url", itemImgsUrl.toString());
            
        }
        if(skus != null) {
            paramsMap.put("skus", skus.toString());
            
        }
        if(pddCid != null) {
            paramsMap.put("pdd_cid", pddCid.toString());
            
        }
        
        return paramsMap;
    }

    public void setNumIid(String numIid) {
        this.numIid = numIid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setStuffStatus(String stuffStatus) {
        this.stuffStatus = stuffStatus;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setItemImgsUrl(String itemImgsUrl) {
        this.itemImgsUrl = itemImgsUrl;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public void setPddCid(String pddCid) {
        this.pddCid = pddCid;
    }

    
    
}