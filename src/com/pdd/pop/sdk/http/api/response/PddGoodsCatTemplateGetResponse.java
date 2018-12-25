package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCatTemplateGetResponse extends PopBaseHttpResponse{

    /**
     * 属性信息
     */
    @JsonProperty("open_api_response")
    private OpenApiResponse openApiResponse;

    
    public OpenApiResponse getOpenApiResponse() {
        return openApiResponse;
    }

    
    public static class Group {

        /**
         * 组id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 组名称
         */
        @JsonProperty("name")
        private String name;

        
        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        
    }
    public static class OpenApiResponse {

        /**
         * 模板允许的最大的自定义规格数量
         */
        @JsonProperty("input_max_spec_num")
        private Long inputMaxSpecNum;

        /**
         * 限定规格不支持部分选取，为true时限定规格要么全选要么全不选
         */
        @JsonProperty("choose_all_qualify_spec")
        private Boolean chooseAllQualifySpec;

        /**
         * 单个自定义规格值上限
         */
        @JsonProperty("single_spec_value_num")
        private Long singleSpecValueNum;

        /**
         * 最大sku数目上限
         */
        @JsonProperty("max_sku_num")
        private Long maxSkuNum;

        /**
         * 属性信息
         */
        @JsonProperty("properties")
        private List<PropertiesItem> properties;

        
        public Long getInputMaxSpecNum() {
            return inputMaxSpecNum;
        }

        public Boolean getChooseAllQualifySpec() {
            return chooseAllQualifySpec;
        }

        public Long getSingleSpecValueNum() {
            return singleSpecValueNum;
        }

        public Long getMaxSkuNum() {
            return maxSkuNum;
        }

        public List<PropertiesItem> getProperties() {
            return properties;
        }

        
    }
    public static class ValuesItem {

        /**
         * 基础属性值id
         */
        @JsonProperty("vid")
        private Long vid;

        /**
         * 属性值
         */
        @JsonProperty("value")
        private String value;

        /**
         * 分组信息，非销售属性为null
         */
        @JsonProperty("group")
        private Group group;

        /**
         * 扩展信息，颜色的话色号在这里,ARGB，非销售属性为null
         */
        @JsonProperty("extend_info")
        private String extendInfo;

        /**
         * 规格id,非销售属性为null
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 是否父属性值
         */
        @JsonProperty("is_parent")
        private Boolean isParent;

        /**
         * 对应的父属性值id
         */
        @JsonProperty("parent_vids")
        private List<Long> parentVids;

        
        public Long getVid() {
            return vid;
        }

        public String getValue() {
            return value;
        }

        public Group getGroup() {
            return group;
        }

        public String getExtendInfo() {
            return extendInfo;
        }

        public Long getSpecId() {
            return specId;
        }

        public Boolean getIsParent() {
            return isParent;
        }

        public List<Long> getParentVids() {
            return parentVids;
        }

        
    }
    public static class PropertiesItem {

        /**
         * 模板属性id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 属性别名
         */
        @JsonProperty("name_alias")
        private String nameAlias;

        /**
         * 属性名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性值单位
         */
        @JsonProperty("value_unit")
        private String valueUnit;

        /**
         * 小数点允许最大精度,为0时代表不允许输入小数
         */
        @JsonProperty("value_precision")
        private Integer valuePrecision;

        /**
         * 输入最大值：文本类型代表文本最长长度、 数值类型代表数字最大值、时间类型代表时间最大值
         */
        @JsonProperty("max_value")
        private String maxValue;

        /**
         * 输入最小值：文本类型代表文本最小长度、数值类型代表数字最小值、时间类型代表时间最小值
         */
        @JsonProperty("min_value")
        private String minValue;

        /**
         * 是否必填
         */
        @JsonProperty("required")
        private Boolean required;

        /**
         * 控件类型（0-可输入、1-可勾选、3-可输入又可勾选、5-单项时间选择器-年月日、6-双项时间选择器-年月日、7-单项时间选择器-年月、8-双项时间选择器-年月）9-调色盘、10-尺码选择器、11-输入数值范围、12-输入数值乘积-2维、13-输入数值乘积-3维
         */
        @JsonProperty("control_type")
        private Integer controlType;

        /**
         * 属性值类型（0-文本、1-数值、4-绝对时间、5-相对时间）
         */
        @JsonProperty("value_type")
        private Integer valueType;

        /**
         * 最大可勾选数目,为0时代表不限
         */
        @JsonProperty("choose_max_num")
        private Integer chooseMaxNum;

        /**
         * 最大可输入数目,为0时代表不可输入，非销售属性为null
         */
        @JsonProperty("input_max_num")
        private Integer inputMaxNum;

        /**
         * 父属性id
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 是否销售属性
         */
        @JsonProperty("is_sale")
        private Boolean isSale;

        /**
         * 是否允许填写备注
         */
        @JsonProperty("can_note")
        private Boolean canNote;

        /**
         * 销售属性规格id，非销售属性为null
         */
        @JsonProperty("spec_id")
        private Long specId;

        /**
         * 属性特性:0普通，1颜色，2尺码
         */
        @JsonProperty("feature")
        private Integer feature;

        /**
         * 是否父属性
         */
        @JsonProperty("is_parent")
        private Boolean isParent;

        /**
         * 引用属性id
         */
        @JsonProperty("ref_pid")
        private Long refPid;

        /**
         * 属性值列表
         */
        @JsonProperty("values")
        private List<ValuesItem> values;

        /**
         * 是否按条件展示
         */
        @JsonProperty("is_condition_show")
        private Boolean isConditionShow;

        /**
         * 若属性按条件展示,则只有show_vids中的值被选择时属性才可使用
         */
        @JsonProperty("show_vids")
        private List<Long> showVids;

        
        public Long getId() {
            return id;
        }

        public String getNameAlias() {
            return nameAlias;
        }

        public String getName() {
            return name;
        }

        public String getValueUnit() {
            return valueUnit;
        }

        public Integer getValuePrecision() {
            return valuePrecision;
        }

        public String getMaxValue() {
            return maxValue;
        }

        public String getMinValue() {
            return minValue;
        }

        public Boolean getRequired() {
            return required;
        }

        public Integer getControlType() {
            return controlType;
        }

        public Integer getValueType() {
            return valueType;
        }

        public Integer getChooseMaxNum() {
            return chooseMaxNum;
        }

        public Integer getInputMaxNum() {
            return inputMaxNum;
        }

        public Long getParentId() {
            return parentId;
        }

        public Boolean getIsSale() {
            return isSale;
        }

        public Boolean getCanNote() {
            return canNote;
        }

        public Long getSpecId() {
            return specId;
        }

        public Integer getFeature() {
            return feature;
        }

        public Boolean getIsParent() {
            return isParent;
        }

        public Long getRefPid() {
            return refPid;
        }

        public List<ValuesItem> getValues() {
            return values;
        }

        public Boolean getIsConditionShow() {
            return isConditionShow;
        }

        public List<Long> getShowVids() {
            return showVids;
        }

        
    }
    
}