package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsLogisticsTemplateGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_logistics_template_get_response")
    private GoodsLogisticsTemplateGetResponse goodsLogisticsTemplateGetResponse;

    
    public GoodsLogisticsTemplateGetResponse getGoodsLogisticsTemplateGetResponse() {
        return goodsLogisticsTemplateGetResponse;
    }

    
    public static class GoodsLogisticsTemplateGetResponse {

        /**
         * 返回的运费模板总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 商家运费模板对象列表
         */
        @JsonProperty("logistics_template_list")
        private List<LogisticsTemplateListItem> logisticsTemplateList;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<LogisticsTemplateListItem> getLogisticsTemplateList() {
            return logisticsTemplateList;
        }

        
    }
    public static class LogisticsTemplateListItem {

        /**
         * 送货入户并安装服务
         */
        @JsonProperty("additional_service_type")
        private Integer additionalServiceType;

        /**
         * 是否顺丰包邮，1-是 0-否
         */
        @JsonProperty("sf_free_type")
        private Integer sfFreeType;

        /**
         * 不包邮区域/需要买家付邮费区域
         */
        @JsonProperty("cost_template_list")
        private List<CostTemplateListItem> costTemplateList;

        /**
         * 模板id
         */
        @JsonProperty("template_id")
        private Long templateId;

        /**
         * 运费模板名称
         */
        @JsonProperty("template_name")
        private String templateName;

        /**
         * 计费方式，0-按件计费，1-按重量计费
         */
        @JsonProperty("cost_type")
        private Integer costType;

        /**
         * 是否送货上门，对于包邮地区：true-商品包邮且送货上门，false-商品包邮但不送货上门
         */
        @JsonProperty("free_deliver_house")
        private Boolean freeDeliverHouse;

        /**
         * 送货上门地区列表
         */
        @JsonProperty("free_deliver_house_area_list")
        private List<FreeDeliverHouseAreaListItem> freeDeliverHouseAreaList;

        /**
         * 包邮省份对象
         */
        @JsonProperty("free_province_list")
        private List<FreeProvinceListItem> freeProvinceList;

        
        public Integer getAdditionalServiceType() {
            return additionalServiceType;
        }

        public Integer getSfFreeType() {
            return sfFreeType;
        }

        public List<CostTemplateListItem> getCostTemplateList() {
            return costTemplateList;
        }

        public Long getTemplateId() {
            return templateId;
        }

        public String getTemplateName() {
            return templateName;
        }

        public Integer getCostType() {
            return costType;
        }

        public Boolean getFreeDeliverHouse() {
            return freeDeliverHouse;
        }

        public List<FreeDeliverHouseAreaListItem> getFreeDeliverHouseAreaList() {
            return freeDeliverHouseAreaList;
        }

        public List<FreeProvinceListItem> getFreeProvinceList() {
            return freeProvinceList;
        }

        
    }
    public static class CostTemplateListItem {

        /**
         * 不包邮的区域
         */
        @JsonProperty("cost_province_list")
        private List<CostProvinceListItem> costProvinceList;

        /**
         * 首件
         */
        @JsonProperty("first_standard")
        private Long firstStandard;

        /**
         * 首件或首重价格，单位为分
         */
        @JsonProperty("first_cost")
        private Long firstCost;

        /**
         * 续重或续件
         */
        @JsonProperty("add_standard")
        private Long addStandard;

        /**
         * 续件或续重价格，单位为分
         */
        @JsonProperty("add_cost")
        private Long addCost;

        /**
         * 对不包邮地区，true-若要包邮须满足件数包邮，false-不开启满足件数包邮
         */
        @JsonProperty("is_have_free_min_count")
        private Boolean isHaveFreeMinCount;

        /**
         * 对不包邮地区，满足指定件数包邮，该值为商家设置的指定件数，若为-1则商家没有开启满足件数包邮
         */
        @JsonProperty("have_free_min_count")
        private Long haveFreeMinCount;

        /**
         * 对不包邮地区，true-若要包邮须满足指定价格则可以包邮，false-不开启满足指定价格包邮
         */
        @JsonProperty("is_have_free_min_amount")
        private Boolean isHaveFreeMinAmount;

        /**
         * 对不包邮地区，满足指定价格包邮，该值为商家设置的指定订单金额，若为-1则商家没有开启满足指定价格包邮，注意，单位为分
         */
        @JsonProperty("have_free_min_amount")
        private Long haveFreeMinAmount;

        
        public List<CostProvinceListItem> getCostProvinceList() {
            return costProvinceList;
        }

        public Long getFirstStandard() {
            return firstStandard;
        }

        public Long getFirstCost() {
            return firstCost;
        }

        public Long getAddStandard() {
            return addStandard;
        }

        public Long getAddCost() {
            return addCost;
        }

        public Boolean getIsHaveFreeMinCount() {
            return isHaveFreeMinCount;
        }

        public Long getHaveFreeMinCount() {
            return haveFreeMinCount;
        }

        public Boolean getIsHaveFreeMinAmount() {
            return isHaveFreeMinAmount;
        }

        public Long getHaveFreeMinAmount() {
            return haveFreeMinAmount;
        }

        
    }
    public static class FreeDeliverHouseAreaListItem {

        /**
         * 包邮送货上门的城区ID
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 包邮送货上门的城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 包邮送货上门的省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 包邮送货上门的省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 包邮送货上门的城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 包邮送货上门的城区
         */
        @JsonProperty("town")
        private String town;

        
        public Integer getTownId() {
            return townId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getProvince() {
            return province;
        }

        public String getCity() {
            return city;
        }

        public String getTown() {
            return town;
        }

        
    }
    public static class FreeProvinceListItem {

        /**
         * 省份id
         */
        @JsonProperty("province_id")
        private Long provinceId;

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        
        public Long getProvinceId() {
            return provinceId;
        }

        public String getProvince() {
            return province;
        }

        
    }
    public static class CostProvinceListItem {

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 不包邮区域的ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        
        public String getProvince() {
            return province;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        
    }
    
}