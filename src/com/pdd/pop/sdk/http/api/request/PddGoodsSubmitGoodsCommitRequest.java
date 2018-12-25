package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsSubmitGoodsCommitResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddGoodsSubmitGoodsCommitRequest extends PopBaseHttpRequest<PddGoodsSubmitGoodsCommitResponse>{

    /**
     * 1213414
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 商品标题，例如，新疆特产 红满疆枣夹核桃500g
     */
    @JsonProperty("goods_name")
    private String goodsName;

    /**
     * 1-国内普通商品，2-进口，3-国外海淘，4-直邮 ,5-流量,6-话费,7,优惠券;8-QQ充值,9-加油卡 暂时支持1-普通商品的上架
     */
    @JsonProperty("goods_type")
    private Integer goodsType;

    /**
     * 商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
     */
    @JsonProperty("goods_desc")
    private String goodsDesc;

    /**
     * 叶子类目ID
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 国家ID，0-中国，暂时只传0（普通商品）
     */
    @JsonProperty("country_id")
    private Integer countryId;

    /**
     * 保税仓，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * 海关名称，只在goods_type为直供商品时有效（现阶段暂不支持）
     */
    @JsonProperty("customs")
    private String customs;

    /**
     * 是否需要上报海关，现阶段入参默认false，入参true会失败
     */
    @JsonProperty("is_customs")
    private Boolean isCustoms;

    /**
     * 市场价格，单位为分
     */
    @JsonProperty("market_price")
    private Long marketPrice;

    /**
     * 是否预售,true-预售商品，false-非预售商品
     */
    @JsonProperty("is_pre_sale")
    private Boolean isPreSale;

    /**
     * 预售时间，is_pre_sale为1时必传，UNIX时间戳
     */
    @JsonProperty("pre_sale_time")
    private Long preSaleTime;

    /**
     * 承诺发货时间（ 秒），48小时或24小时，is_pre_sale为1时不必传
     */
    @JsonProperty("shipment_limit_second")
    private Long shipmentLimitSecond;

    /**
     * 物流运费模板ID，可使用pdd.logistics.template.get获取
     */
    @JsonProperty("cost_template_id")
    private Long costTemplateId;

    /**
     * 团购人数
     */
    @JsonProperty("customer_num")
    private Long customerNum;

    /**
     * 单次限量
     */
    @JsonProperty("buy_limit")
    private Long buyLimit;

    /**
     * 限购次数
     */
    @JsonProperty("order_limit")
    private Long orderLimit;

    /**
     * 是否7天无理由退换货，true-支持，false-不支持
     */
    @JsonProperty("is_refundable")
    private Boolean isRefundable;

    /**
     * 是否二手商品，true -二手商品 ，false-全新商品
     */
    @JsonProperty("second_hand")
    private Boolean secondHand;

    /**
     * 是否支持假一赔十，false-不支持，true-支持
     */
    @JsonProperty("is_folt")
    private Boolean isFolt;

    /**
     * 服饰面料，fabirc枚举如下：
     */
    @JsonProperty("fabric")
    private Integer fabric;

    /**
     * 成分含量
     */
    @JsonProperty("fabric_content")
    private Integer fabricContent;

    /**
     * 水果类目温馨提示，只在水果类目商品才生效， 字数限制：商品描述goods_desc+温馨提示总计不超过500字。
     */
    @JsonProperty("warm_tips")
    private String warmTips;

    /**
     * sku对象列表
     */
    @JsonProperty("sku_list")
    private List<SkuListItem> skuList;

    /**
     * 商品goods外部编码
     */
    @JsonProperty("out_goods_id")
    private String outGoodsId;

    /**
     * 高清缩略图，上传轮播图首图，尺寸400*400，图片格式仅支持JPG,PNG格式
     */
    @JsonProperty("hd_thumb_url")
    private String hdThumbUrl;

    /**
     * 普通缩略图，上传轮播图首图，尺寸200*200，图片格式仅支持JPG,PNG格式
     */
    @JsonProperty("thumb_url")
    private String thumbUrl;

    /**
     * 商品主图，请参考拼多多首页大图，如果商品参加部分活动则必填，否则无法参加活动
a. 尺寸750 x 352px
b. 大小100k以内
c. 图片格式仅支持JPG,PNG格式
d. 图片背景应以纯白为主, 商品图案居中显示
e. 图片不可以添加任何品牌相关文字或logo
     */
    @JsonProperty("image_url")
    private String imageUrl;

    /**
     * 商品轮播图，按次序上传，图片格式支持JPEG/JPG/PNG， 图片尺寸长宽比1：1且尺寸不低于480px，图片大小最高1MB
     */
    @JsonProperty("carousel_gallery")
    private List<String> carouselGallery;

    /**
     * 商品详情图：
a. 尺寸要求宽度处于480~1200px之间，高度0-1500px之间
b. 大小1M以内
c. 数量限制在20张之间
d. 图片格式仅支持JPG,PNG格式
e. 点击上传时，支持批量上传详情图
     */
    @JsonProperty("detail_gallery")
    private List<String> detailGallery;

    /**
     * 是否支持正品发票
     */
    @JsonProperty("invoice_status")
    private Integer invoiceStatus;

    /**
     * 草稿id
     */
    @JsonProperty("goods_commit_id")
    private Long goodsCommitId;

    /**
     * 商品属性列表
     */
    @JsonProperty("goods_properties")
    private List<GoodsPropertiesItem> goodsProperties;

    /**
     * 0：不支持全国联保；1：支持全国联保
     */
    @JsonProperty("quan_guo_lian_bao")
    private Integer quanGuoLianBao;

    /**
     * 只换不修的天数，目前只支持0和365
     */
    @JsonProperty("zhi_huan_bu_xiu")
    private Integer zhiHuanBuXiu;

    
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
        return "pdd.goods.submit.goods.commit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSubmitGoodsCommitResponse> getResponseClass() {
        return PddGoodsSubmitGoodsCommitResponse.class;
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
        if(goodsName != null) {
            paramsMap.put("goods_name", goodsName.toString());
            
        }
        if(goodsType != null) {
            paramsMap.put("goods_type", goodsType.toString());
            
        }
        if(goodsDesc != null) {
            paramsMap.put("goods_desc", goodsDesc.toString());
            
        }
        if(catId != null) {
            paramsMap.put("cat_id", catId.toString());
            
        }
        if(countryId != null) {
            paramsMap.put("country_id", countryId.toString());
            
        }
        if(warehouse != null) {
            paramsMap.put("warehouse", warehouse.toString());
            
        }
        if(customs != null) {
            paramsMap.put("customs", customs.toString());
            
        }
        if(isCustoms != null) {
            paramsMap.put("is_customs", isCustoms.toString());
            
        }
        if(marketPrice != null) {
            paramsMap.put("market_price", marketPrice.toString());
            
        }
        if(isPreSale != null) {
            paramsMap.put("is_pre_sale", isPreSale.toString());
            
        }
        if(preSaleTime != null) {
            paramsMap.put("pre_sale_time", preSaleTime.toString());
            
        }
        if(shipmentLimitSecond != null) {
            paramsMap.put("shipment_limit_second", shipmentLimitSecond.toString());
            
        }
        if(costTemplateId != null) {
            paramsMap.put("cost_template_id", costTemplateId.toString());
            
        }
        if(customerNum != null) {
            paramsMap.put("customer_num", customerNum.toString());
            
        }
        if(buyLimit != null) {
            paramsMap.put("buy_limit", buyLimit.toString());
            
        }
        if(orderLimit != null) {
            paramsMap.put("order_limit", orderLimit.toString());
            
        }
        if(isRefundable != null) {
            paramsMap.put("is_refundable", isRefundable.toString());
            
        }
        if(secondHand != null) {
            paramsMap.put("second_hand", secondHand.toString());
            
        }
        if(isFolt != null) {
            paramsMap.put("is_folt", isFolt.toString());
            
        }
        if(fabric != null) {
            paramsMap.put("fabric", fabric.toString());
            
        }
        if(fabricContent != null) {
            paramsMap.put("fabric_content", fabricContent.toString());
            
        }
        if(warmTips != null) {
            paramsMap.put("warm_tips", warmTips.toString());
            
        }
        if(skuList != null) {
            paramsMap.put("sku_list", skuList.toString());
            
        }
        if(outGoodsId != null) {
            paramsMap.put("out_goods_id", outGoodsId.toString());
            
        }
        if(hdThumbUrl != null) {
            paramsMap.put("hd_thumb_url", hdThumbUrl.toString());
            
        }
        if(thumbUrl != null) {
            paramsMap.put("thumb_url", thumbUrl.toString());
            
        }
        if(imageUrl != null) {
            paramsMap.put("image_url", imageUrl.toString());
            
        }
        if(carouselGallery != null) {
            paramsMap.put("carousel_gallery", JsonUtil.transferToJson(carouselGallery));
            
        }
        if(detailGallery != null) {
            paramsMap.put("detail_gallery", JsonUtil.transferToJson(detailGallery));
            
        }
        if(invoiceStatus != null) {
            paramsMap.put("invoice_status", invoiceStatus.toString());
            
        }
        if(goodsCommitId != null) {
            paramsMap.put("goods_commit_id", goodsCommitId.toString());
            
        }
        if(goodsProperties != null) {
            paramsMap.put("goods_properties", goodsProperties.toString());
            
        }
        if(quanGuoLianBao != null) {
            paramsMap.put("quan_guo_lian_bao", quanGuoLianBao.toString());
            
        }
        if(zhiHuanBuXiu != null) {
            paramsMap.put("zhi_huan_bu_xiu", zhiHuanBuXiu.toString());
            
        }
        
        return paramsMap;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setCustoms(String customs) {
        this.customs = customs;
    }

    public void setIsCustoms(Boolean isCustoms) {
        this.isCustoms = isCustoms;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setIsPreSale(Boolean isPreSale) {
        this.isPreSale = isPreSale;
    }

    public void setPreSaleTime(Long preSaleTime) {
        this.preSaleTime = preSaleTime;
    }

    public void setShipmentLimitSecond(Long shipmentLimitSecond) {
        this.shipmentLimitSecond = shipmentLimitSecond;
    }

    public void setCostTemplateId(Long costTemplateId) {
        this.costTemplateId = costTemplateId;
    }

    public void setCustomerNum(Long customerNum) {
        this.customerNum = customerNum;
    }

    public void setBuyLimit(Long buyLimit) {
        this.buyLimit = buyLimit;
    }

    public void setOrderLimit(Long orderLimit) {
        this.orderLimit = orderLimit;
    }

    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    public void setSecondHand(Boolean secondHand) {
        this.secondHand = secondHand;
    }

    public void setIsFolt(Boolean isFolt) {
        this.isFolt = isFolt;
    }

    public void setFabric(Integer fabric) {
        this.fabric = fabric;
    }

    public void setFabricContent(Integer fabricContent) {
        this.fabricContent = fabricContent;
    }

    public void setWarmTips(String warmTips) {
        this.warmTips = warmTips;
    }

    public void setSkuList(List<SkuListItem> skuList) {
        this.skuList = skuList;
    }

    public void setOutGoodsId(String outGoodsId) {
        this.outGoodsId = outGoodsId;
    }

    public void setHdThumbUrl(String hdThumbUrl) {
        this.hdThumbUrl = hdThumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setCarouselGallery(List<String> carouselGallery) {
        this.carouselGallery = carouselGallery;
    }

    public void setDetailGallery(List<String> detailGallery) {
        this.detailGallery = detailGallery;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setGoodsCommitId(Long goodsCommitId) {
        this.goodsCommitId = goodsCommitId;
    }

    public void setGoodsProperties(List<GoodsPropertiesItem> goodsProperties) {
        this.goodsProperties = goodsProperties;
    }

    public void setQuanGuoLianBao(Integer quanGuoLianBao) {
        this.quanGuoLianBao = quanGuoLianBao;
    }

    public void setZhiHuanBuXiu(Integer zhiHuanBuXiu) {
        this.zhiHuanBuXiu = zhiHuanBuXiu;
    }

    
    public static class SkuListItem {

        /**
         * 商品规格列表，根据pdd.goods.spec.id.get生成的规格属性id，例如：颜色规格下商家新增白色和黑色，大小规格下商家新增L和XL，则由4种spec组合，入参一种组合即可，在skulist中需要有4个spec组合的sku
         */
        @JsonProperty("spec_id_list")
        private String specIdList;

        /**
         * 重量，单位为g
         */
        @JsonProperty("weight")
        private Long weight;

        /**
         * 商品sku库存初始数量，后续库存update只使用stocks.update接口进行调用
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 商品sku外部编码
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        /**
         * sku预览图，预览图尺寸：等宽高，且高度不低于480px，现已支持1M大小，越清晰越好卖，SKU预览图格式：仅支持JPG,PNG格式
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 商品团购价格
         */
        @JsonProperty("multi_price")
        private Long multiPrice;

        /**
         * 商品单买价格
         */
        @JsonProperty("price")
        private Long price;

        /**
         * sku购买限制，只入参999
         */
        @JsonProperty("limit_quantity")
        private Long limitQuantity;

        /**
         * sku上架状态，0-已下架，1-上架中
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        
        public void setSpecIdList(String specIdList) {
            this.specIdList = specIdList;
        }

        public void setWeight(Long weight) {
            this.weight = weight;
        }

        public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public void setOutSkuSn(String outSkuSn) {
            this.outSkuSn = outSkuSn;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public void setMultiPrice(Long multiPrice) {
            this.multiPrice = multiPrice;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public void setLimitQuantity(Long limitQuantity) {
            this.limitQuantity = limitQuantity;
        }

        public void setIsOnsale(Integer isOnsale) {
            this.isOnsale = isOnsale;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class GoodsPropertiesItem {

        /**
         * 模板模块Id
         */
        @JsonProperty("template_module_id")
        private Long templateModuleId;

        /**
         * 父属性id，非销售属性不用传
         */
        @JsonProperty("parent_spec_id")
        private Long parentSpecId;

        /**
         * 属性id，非销售属性不用传
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 备注，非销售属性不用传
         */
        @JsonProperty("note")
        private String note;

        /**
         * 图片url，非销售属性不用传
         */
        @JsonProperty("img_url")
        private String imgUrl;

        /**
         * 组id，非销售属性不用传
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 模板属性id
         */
        @JsonProperty("template_pid")
        private Long templatePid;

        /**
         * 属性id
         */
        @JsonProperty("pid")
        private Long pid;

        /**
         * 属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 属性单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        
        public void setTemplateModuleId(Long templateModuleId) {
            this.templateModuleId = templateModuleId;
        }

        public void setParentSpecId(Long parentSpecId) {
            this.parentSpecId = parentSpecId;
        }

        public void setSpecId(Long specId) {
            this.specId = specId;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public void setGroupId(Integer groupId) {
            this.groupId = groupId;
        }

        public void setTemplatePid(Long templatePid) {
            this.templatePid = templatePid;
        }

        public void setPid(Long pid) {
            this.pid = pid;
        }

        public void setVid(Long vid) {
            this.vid = vid;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setValueUnit(String valueUnit) {
            this.valueUnit = valueUnit;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}