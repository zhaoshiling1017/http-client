package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;


import java.util.Map;

public class PddExpressSearchDepotResponse extends PopBaseHttpResponse{

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
         * 数量
         */
        @JsonProperty("count")
        private Long count;

        /**
         * 仓库列表
         */
        @JsonProperty("depot_list")
        private List<DepotListItem> depotList;

        
        public Long getCount() {
            return count;
        }

        public List<DepotListItem> getDepotList() {
            return depotList;
        }

        
    }
    public static class DepotListItem {

        /**
         * 仓库id（string）
         */
        @JsonProperty("id_str")
        private String idStr;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        /**
         * 仓库编码
         */
        @JsonProperty("code")
        private String code;

        /**
         * 仓库名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 仓库别名
         */
        @JsonProperty("alias")
        private String alias;

        /**
         * 仓库类型，暂时只有1
         */
        @JsonProperty("type")
        private Integer type;

        /**
         * 仓库地址（省编号）
         */
        @JsonProperty("province")
        private Integer province;

        /**
         * 仓库地址（市编号）
         */
        @JsonProperty("city")
        private Integer city;

        /**
         * 仓库地址（区编号）
         */
        @JsonProperty("district")
        private Integer district;

        /**
         * 详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 邮编
         */
        @JsonProperty("zip")
        private String zip;

        /**
         * 联系人姓名
         */
        @JsonProperty("contact_name")
        private String contactName;

        /**
         * 联系人电话
         */
        @JsonProperty("contact_tel")
        private String contactTel;

        /**
         * 覆盖信息，省：全覆盖
         */
        @JsonProperty("province_map")
        private Map<Object, Object> provinceMap;

        
        public String getIdStr() {
            return idStr;
        }

        public Long getDepotId() {
            return depotId;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getAlias() {
            return alias;
        }

        public Integer getType() {
            return type;
        }

        public Integer getProvince() {
            return province;
        }

        public Integer getCity() {
            return city;
        }

        public Integer getDistrict() {
            return district;
        }

        public String getAddress() {
            return address;
        }

        public String getZip() {
            return zip;
        }

        public String getContactName() {
            return contactName;
        }

        public String getContactTel() {
            return contactTel;
        }

        public Map<Object, Object> getProvinceMap() {
            return provinceMap;
        }

        
    }
    
}