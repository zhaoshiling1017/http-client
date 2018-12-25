package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddStockWareDetailQueryResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class OpenApiResponse {

        /**
         * 货品id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 货品类型.0:单独货品  1:组合货品
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 组合货品中子货品的关联关系
         */
        @JsonProperty("ware_infos")
        private List<WareInfosItem> wareInfos;

        /**
         * 货品sku信息
         */
        @JsonProperty("ware_skus")
        private List<WareSkusItem> wareSkus;

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 备注
         */
        @JsonProperty("note")
        private String note;

        /**
         * 高低值服务，0低，1高
         */
        @JsonProperty("service_quality")
        private Integer serviceQuality;

        /**
         * 体积：立方厘米，精确到一位小数
         */
        @JsonProperty("volume")
        private Integer volume;

        /**
         * 长：厘米，精确到一位小数
         */
        @JsonProperty("length")
        private Integer length;

        /**
         * 宽：厘米，精确到一位小数
         */
        @JsonProperty("width")
        private Integer width;

        /**
         * 高：厘米，精确到一位小数
         */
        @JsonProperty("height")
        private Integer height;

        /**
         * 重量：kg，精确到两位小数
         */
        @JsonProperty("weight")
        private Integer weight;

        /**
         * 毛重：kg，精确到两位小数
         */
        @JsonProperty("gross_weight")
        private Integer grossWeight;

        /**
         * 净重：kg，精确到两位小数
         */
        @JsonProperty("net_weight")
        private Integer netWeight;

        /**
         * 皮重：kg，精确到两位小数
         */
        @JsonProperty("tare_weight")
        private Integer tareWeight;

        /**
         * 单价：元，精确到一位小数
         */
        @JsonProperty("price")
        private Integer price;

        /**
         * 颜色
         */
        @JsonProperty("color")
        private String color;

        /**
         * 包材
         */
        @JsonProperty("packing")
        private String packing;

        /**
         * 库存
         */
        @JsonProperty("quantity")
        private Long quantity;

        /**
         * 创建时间（毫秒）
         */
        @JsonProperty("created_at")
        private Long createdAt;

        /**
         * 更新时间毫秒）
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        
        public Long getId() {
            return id;
        }

        public Integer getType() {
            return type;
        }

        public List<WareInfosItem> getWareInfos() {
            return wareInfos;
        }

        public List<WareSkusItem> getWareSkus() {
            return wareSkus;
        }

        public String getWareSn() {
            return wareSn;
        }

        public String getWareName() {
            return wareName;
        }

        public String getNote() {
            return note;
        }

        public Integer getServiceQuality() {
            return serviceQuality;
        }

        public Integer getVolume() {
            return volume;
        }

        public Integer getLength() {
            return length;
        }

        public Integer getWidth() {
            return width;
        }

        public Integer getHeight() {
            return height;
        }

        public Integer getWeight() {
            return weight;
        }

        public Integer getGrossWeight() {
            return grossWeight;
        }

        public Integer getNetWeight() {
            return netWeight;
        }

        public Integer getTareWeight() {
            return tareWeight;
        }

        public Integer getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getPacking() {
            return packing;
        }

        public Long getQuantity() {
            return quantity;
        }

        public Long getCreatedAt() {
            return createdAt;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        
    }
    public static class SpecsItem {

        /**
         * 规格id
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 规格名称
         */
        @JsonProperty("spec_key")
        private String specKey;

        /**
         * 规格值
         */
        @JsonProperty("spec_value")
        private String specValue;

        
        public Long getSpecId() {
            return specId;
        }

        public String getSpecKey() {
            return specKey;
        }

        public String getSpecValue() {
            return specValue;
        }

        
    }
    public static class WareInfosItem {

        /**
         * 子货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 子货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 子货品数量
         */
        @JsonProperty("ware_quantity")
        private Long wareQuantity;

        /**
         * 子货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        
        public String getWareSn() {
            return wareSn;
        }

        public String getWareName() {
            return wareName;
        }

        public Long getWareQuantity() {
            return wareQuantity;
        }

        public Long getWareId() {
            return wareId;
        }

        
    }
    public static class WareSkusItem {

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * skuid
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 是否已经绑定货品false/true
         */
        @JsonProperty("exist_ware")
        private Boolean existWare;

        /**
         * 上下架状态，true表示上架
         */
        @JsonProperty("is_onsale")
        private Boolean isOnsale;

        /**
         * 规格信息
         */
        @JsonProperty("specs")
        private List<SpecsItem> specs;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public Long getWareId() {
            return wareId;
        }

        public Boolean getExistWare() {
            return existWare;
        }

        public Boolean getIsOnsale() {
            return isOnsale;
        }

        public List<SpecsItem> getSpecs() {
            return specs;
        }

        
    }
    
}