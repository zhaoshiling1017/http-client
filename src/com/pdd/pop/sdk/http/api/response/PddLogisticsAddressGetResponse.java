package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsAddressGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("logistics_address_get_response")
    private LogisticsAddressGetResponse logisticsAddressGetResponse;

    
    public LogisticsAddressGetResponse getLogisticsAddressGetResponse() {
        return logisticsAddressGetResponse;
    }

    
    public static class LogisticsAddressGetResponse {

        /**
         * 地址对象列表
         */
        @JsonProperty("logistics_address_list")
        private List<LogisticsAddressListItem> logisticsAddressList;

        
        public List<LogisticsAddressListItem> getLogisticsAddressList() {
            return logisticsAddressList;
        }

        
    }
    public static class LogisticsAddressListItem {

        /**
         * 是否有效，0-无效，1-有效
         */
        @JsonProperty("is_enabled")
        private Integer isEnabled;

        /**
         * 地区邮编
         */
        @JsonProperty("national_code")
        private String nationalCode;

        /**
         * 地区层级，1-省份，2-市级，3-区级
         */
        @JsonProperty("region_type")
        private Integer regionType;

        /**
         * 地区名称
         */
        @JsonProperty("region_name")
        private String regionName;

        /**
         * 父地区ID，顶点id为0
         */
        @JsonProperty("parent_id")
        private Long parentId;

        /**
         * 地区ID
         */
        @JsonProperty("id")
        private Long id;

        
        public Integer getIsEnabled() {
            return isEnabled;
        }

        public String getNationalCode() {
            return nationalCode;
        }

        public Integer getRegionType() {
            return regionType;
        }

        public String getRegionName() {
            return regionName;
        }

        public Long getParentId() {
            return parentId;
        }

        public Long getId() {
            return id;
        }

        
    }
    
}