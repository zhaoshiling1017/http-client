package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddGoodsLogisticsTemplateCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddGoodsLogisticsTemplateCreateRequest extends PopBaseHttpRequest<PddGoodsLogisticsTemplateCreateResponse>{

    /**
     * 非包邮模版列表
     */
    @JsonProperty("cost_template_list")
    private List<CostTemplateListItem> costTemplateList;

    /**
     * 包邮地区
     */
    @JsonProperty("free_province_list")
    private List<FreeProvinceListItem> freeProvinceList;

    /**
     * 送货入户区域
     */
    @JsonProperty("free_deliver_house_area_list")
    private List<FreeDeliverHouseAreaListItem> freeDeliverHouseAreaList;

    /**
     * 计费方式，0-按件计费，1-按重量计费
     */
    @JsonProperty("cost_type")
    private Integer costType;

    /**
     * 是否送货入户
     */
    @JsonProperty("free_deliver_house")
    private Boolean freeDeliverHouse;

    /**
     * 运费模板名称
     */
    @JsonProperty("template_name")
    private String templateName;

    
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
        return "pdd.goods.logistics.template.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsLogisticsTemplateCreateResponse> getResponseClass() {
        return PddGoodsLogisticsTemplateCreateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(costTemplateList != null) {
            paramsMap.put("cost_template_list", costTemplateList.toString());
            
        }
        if(freeProvinceList != null) {
            paramsMap.put("free_province_list", freeProvinceList.toString());
            
        }
        if(freeDeliverHouseAreaList != null) {
            paramsMap.put("free_deliver_house_area_list", freeDeliverHouseAreaList.toString());
            
        }
        if(costType != null) {
            paramsMap.put("cost_type", costType.toString());
            
        }
        if(freeDeliverHouse != null) {
            paramsMap.put("free_deliver_house", freeDeliverHouse.toString());
            
        }
        if(templateName != null) {
            paramsMap.put("template_name", templateName.toString());
            
        }
        
        return paramsMap;
    }

    public void setCostTemplateList(List<CostTemplateListItem> costTemplateList) {
        this.costTemplateList = costTemplateList;
    }

    public void setFreeProvinceList(List<FreeProvinceListItem> freeProvinceList) {
        this.freeProvinceList = freeProvinceList;
    }

    public void setFreeDeliverHouseAreaList(List<FreeDeliverHouseAreaListItem> freeDeliverHouseAreaList) {
        this.freeDeliverHouseAreaList = freeDeliverHouseAreaList;
    }

    public void setCostType(Integer costType) {
        this.costType = costType;
    }

    public void setFreeDeliverHouse(Boolean freeDeliverHouse) {
        this.freeDeliverHouse = freeDeliverHouse;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    
    public static class CostProvinceListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        
        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class CostTemplateListItem {

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
        private Integer haveFreeMinCount;

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

        /**
         * 省份列表
         */
        @JsonProperty("cost_province_list")
        private List<CostProvinceListItem> costProvinceList;

        
        public void setFirstStandard(Long firstStandard) {
            this.firstStandard = firstStandard;
        }

        public void setFirstCost(Long firstCost) {
            this.firstCost = firstCost;
        }

        public void setAddStandard(Long addStandard) {
            this.addStandard = addStandard;
        }

        public void setAddCost(Long addCost) {
            this.addCost = addCost;
        }

        public void setIsHaveFreeMinCount(Boolean isHaveFreeMinCount) {
            this.isHaveFreeMinCount = isHaveFreeMinCount;
        }

        public void setHaveFreeMinCount(Integer haveFreeMinCount) {
            this.haveFreeMinCount = haveFreeMinCount;
        }

        public void setIsHaveFreeMinAmount(Boolean isHaveFreeMinAmount) {
            this.isHaveFreeMinAmount = isHaveFreeMinAmount;
        }

        public void setHaveFreeMinAmount(Long haveFreeMinAmount) {
            this.haveFreeMinAmount = haveFreeMinAmount;
        }

        public void setCostProvinceList(List<CostProvinceListItem> costProvinceList) {
            this.costProvinceList = costProvinceList;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class FreeProvinceListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        
        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class FreeDeliverHouseAreaListItem {

        /**
         * 省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 城区ID
         */
        @JsonProperty("town_id")
        private Integer townId;

        
        public void setProvinceId(Integer provinceId) {
            this.provinceId = provinceId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public void setTownId(Integer townId) {
            this.townId = townId;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}