package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCommitDetailGetResponse extends PopBaseHttpResponse{

    /**
     * 返回response
     */
    @JsonProperty("goods_commit_detail_response")
    private GoodsCommitDetailResponse goodsCommitDetailResponse;

    
    public GoodsCommitDetailResponse getGoodsCommitDetailResponse() {
        return goodsCommitDetailResponse;
    }

    
    public static class SkuListItem {

        /**
         * sku编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 上下架状态 1：上架 0 ：下架
         */
        @JsonProperty("is_onsale")
        private Integer isOnsale;

        /**
         * sku购买限制
         */
        @JsonProperty("limit_quantity")
        private Long limitQuantity;

        /**
         * 商品团购价格 单位分
         */
        @JsonProperty("multi_price")
        private Long multiPrice;

        /**
         * 商品单买价格 单位分
         */
        @JsonProperty("price")
        private Long price;

        /**
         * 库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 重量，单位为g
         */
        @JsonProperty("weight")
        private Long weight;

        /**
         * sku预览图
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 商品规格列表
         */
        @JsonProperty("spec")
        private List<SpecItem> spec;

        /**
         * 商家编码（sku维度），同其他接口中的outer_id 、out_id、out_sku_sn、outer_sku_sn、out_sku_id、outer_sku_id 都为商家编码（sku维度）
         */
        @JsonProperty("out_sku_sn")
        private String outSkuSn;

        
        public Long getSkuId() {
            return skuId;
        }

        public Integer getIsOnsale() {
            return isOnsale;
        }

        public Long getLimitQuantity() {
            return limitQuantity;
        }

        public Long getMultiPrice() {
            return multiPrice;
        }

        public Long getPrice() {
            return price;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getWeight() {
            return weight;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public List<SpecItem> getSpec() {
            return spec;
        }

        public String getOutSkuSn() {
            return outSkuSn;
        }

        
    }
    public static class GoodsCommitDetailResponse {

        /**
         * 是否支持正品发票；0-不支持、1-支持
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 商品属性列表
         */
        @JsonProperty("goods_property_list")
        private List<GoodsPropertyListItem> goodsPropertyList;

        /**
         * 只换不修的天数，目前只支持0和365
         */
        @JsonProperty("zhi_huan_bu_xiu")
        private Integer zhiHuanBuXiu;

        /**
         * 0：不支持全国联保；1：支持全国联保
         */
        @JsonProperty("quan_guo_lian_bao")
        private Integer quanGuoLianBao;

        /**
         * 提交申请的序列ID
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 商品状态，枚举：0-编辑中，1-待审核，2-审核通过，3-审核驳回
         */
        @JsonProperty("goods_status")
        private Integer goodsStatus;

        /**
         * 驳回原因，仅在status=2时返回，其余状态返回空值
         */
        @JsonProperty("commit_message")
        private String commitMessage;

        /**
         * 是否删除
         */
        @JsonProperty("deleted")
        private Integer deleted;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 购买数量限制
         */
        @JsonProperty("buy_limit")
        private Long buyLimit;

        /**
         * 商品轮播图列表
         */
        @JsonProperty("carousel_gallery_list")
        private List<String> carouselGalleryList;

        /**
         * 类目id
         */
        @JsonProperty("cat_id")
        private Long catId;

        /**
         * 运费模版id
         */
        @JsonProperty("cost_template_id")
        private Long costTemplateId;

        /**
         * 国家id
         */
        @JsonProperty("country_id")
        private Long countryId;

        /**
         * 团购人数
         */
        @JsonProperty("customer_num")
        private Long customerNum;

        /**
         * 商品类型：1-国内普通商品，2-进口，3-国外海淘，4-直邮 ,5-流量,6-话费,7,优惠券;8-QQ充值,9-加油卡 暂时支持1-普通商品的上架
         */
        @JsonProperty("goods_type")
        private Integer goodsType;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品描述， 字数限制：20-500，例如，新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
         */
        @JsonProperty("goods_desc")
        private String goodsDesc;

        /**
         * 新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁。
         */
        @JsonProperty("tiny_name")
        private String tinyName;

        /**
         * 保税仓
         */
        @JsonProperty("warehouse")
        private String warehouse;

        /**
         * 是否需要上报海关 0:否 1:是
         */
        @JsonProperty("is_customs")
        private Integer isCustoms;

        /**
         * 海关名称
         */
        @JsonProperty("customs")
        private String customs;

        /**
         * 市场价格，单位为分
         */
        @JsonProperty("market_price")
        private Long marketPrice;

        /**
         * 是否预售,true-预售商品，false-非预售商品
         */
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private Long preSaleTime;

        /**
         * 承诺发货时间（ 秒）
         */
        @JsonProperty("shipment_limit_second")
        private Long shipmentLimitSecond;

        /**
         * 限购次数
         */
        @JsonProperty("order_limit")
        private Long orderLimit;

        /**
         * 是否7天无理由退换货，1-支持，0-不支持
         */
        @JsonProperty("is_refundable")
        private Integer isRefundable;

        /**
         * 是否支持假一赔十，0-不支持，1-支持
         */
        @JsonProperty("is_folt")
        private Integer isFolt;

        /**
         * 水果类目温馨提示
         */
        @JsonProperty("warm_tips")
        private String warmTips;

        /**
         * sku列表
         */
        @JsonProperty("sku_list")
        private List<SkuListItem> skuList;

        /**
         * 普通缩略图，上传轮播图首图，尺寸200*200，图片格式仅支持JPG,PNG格式
         */
        @JsonProperty("thumb_url")
        private String thumbUrl;

        /**
         * 普通缩略图
         */
        @JsonProperty("hd_thumb_url")
        private String hdThumbUrl;

        /**
         * 商品主图
         */
        @JsonProperty("image_url")
        private String imageUrl;

        /**
         * 商品详情图
         */
        @JsonProperty("detail_gallery_list")
        private List<String> detailGalleryList;

        /**
         * 商家编码（商品维度），同其他接口中的outer_goods_id 、out_goods_id、out_goods_sn、outer_goods_sn 都为商家编码（goods维度）
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 是否二手
         */
        @JsonProperty("second_hand")
        private Integer secondHand;

        /**
         * 仅在cat_id=983（卷筒纸）类目下入参，每包或者卷的净含量，计量单位是g，范围是1~999的整数
         */
        @JsonProperty("paper_net_weight")
        private Long paperNetWeight;

        /**
         * 仅在cat_id=983（卷筒纸）类目下入参，每段/节纸品的长度，单位是mm，范围是1~999的整数
         */
        @JsonProperty("paper_length")
        private Long paperLength;

        /**
         * 仅在cat_id=983（卷筒纸）类目下入参，每段/节的宽度，单位是mm，范围是1~999的整数
         */
        @JsonProperty("paper_width")
        private Long paperWidth;

        /**
         * 仅在cat_id=983（卷筒纸）类目下入参，纸张的层数，单位是层，范围是1~9的整数
         */
        @JsonProperty("paper_plies_num")
        private Long paperPliesNum;

        
        public Integer getInvoiceStatus() {
            return invoiceStatus;
        }

        public List<GoodsPropertyListItem> getGoodsPropertyList() {
            return goodsPropertyList;
        }

        public Integer getZhiHuanBuXiu() {
            return zhiHuanBuXiu;
        }

        public Integer getQuanGuoLianBao() {
            return quanGuoLianBao;
        }

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public Integer getGoodsStatus() {
            return goodsStatus;
        }

        public String getCommitMessage() {
            return commitMessage;
        }

        public Integer getDeleted() {
            return deleted;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Long getBuyLimit() {
            return buyLimit;
        }

        public List<String> getCarouselGalleryList() {
            return carouselGalleryList;
        }

        public Long getCatId() {
            return catId;
        }

        public Long getCostTemplateId() {
            return costTemplateId;
        }

        public Long getCountryId() {
            return countryId;
        }

        public Long getCustomerNum() {
            return customerNum;
        }

        public Integer getGoodsType() {
            return goodsType;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getGoodsDesc() {
            return goodsDesc;
        }

        public String getTinyName() {
            return tinyName;
        }

        public String getWarehouse() {
            return warehouse;
        }

        public Integer getIsCustoms() {
            return isCustoms;
        }

        public String getCustoms() {
            return customs;
        }

        public Long getMarketPrice() {
            return marketPrice;
        }

        public Integer getIsPreSale() {
            return isPreSale;
        }

        public Long getPreSaleTime() {
            return preSaleTime;
        }

        public Long getShipmentLimitSecond() {
            return shipmentLimitSecond;
        }

        public Long getOrderLimit() {
            return orderLimit;
        }

        public Integer getIsRefundable() {
            return isRefundable;
        }

        public Integer getIsFolt() {
            return isFolt;
        }

        public String getWarmTips() {
            return warmTips;
        }

        public List<SkuListItem> getSkuList() {
            return skuList;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public String getHdThumbUrl() {
            return hdThumbUrl;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public List<String> getDetailGalleryList() {
            return detailGalleryList;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public Integer getSecondHand() {
            return secondHand;
        }

        public Long getPaperNetWeight() {
            return paperNetWeight;
        }

        public Long getPaperLength() {
            return paperLength;
        }

        public Long getPaperWidth() {
            return paperWidth;
        }

        public Long getPaperPliesNum() {
            return paperPliesNum;
        }

        
    }
    public static class GoodsPropertyListItem {

        /**
         * 属性单位
         */
        @JsonProperty("punit")
        private String punit;

        /**
         * 基础属性值Id
         */
        @JsonProperty("vid")
        private Long vid;

        /**
         * 基础属性值
         */
        @JsonProperty("vvalue")
        private String vvalue;

        /**
         * 模板属性Id
         */
        @JsonProperty("template_pid")
        private Long templatePid;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        
        public String getPunit() {
            return punit;
        }

        public Long getVid() {
            return vid;
        }

        public String getVvalue() {
            return vvalue;
        }

        public Long getTemplatePid() {
            return templatePid;
        }

        public Long getRefPid() {
            return refPid;
        }

        
    }
    public static class SpecItem {

        /**
         * 商品规格对应的ID
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 商品规格ID对应的规格名称
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 生成的自定义规格ID
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 商家编辑的规格值，如颜色规格下设置白色属性
         */
        @JsonProperty("spec_name")
        private String specName;

        
        public Long getParentId() {
            return parentId;
        }

        public String getParentName() {
            return parentName;
        }

        public Long getSpecId() {
            return specId;
        }

        public String getSpecName() {
            return specName;
        }

        
    }
    
}