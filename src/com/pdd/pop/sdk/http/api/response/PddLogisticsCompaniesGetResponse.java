package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsCompaniesGetResponse extends PopBaseHttpResponse{

    /**
     * 返回的快递公司列表对象
     */
    @JsonProperty("logistics_companies_get_response")
    private LogisticsCompaniesGetResponse logisticsCompaniesGetResponse;

    
    public LogisticsCompaniesGetResponse getLogisticsCompaniesGetResponse() {
        return logisticsCompaniesGetResponse;
    }

    
    public static class LogisticsCompaniesItem {

        /**
         * 是否有效，0-当前不支持的快递公司，1-支持的快递公司，注意：发货时必须入参支持的快递公司id，否则会报错
         */
        @JsonProperty("available")
        private Integer available;

        /**
         * 快递公司编码
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 快递公司名称
         */
        @JsonProperty("logistics_company")
        private String logisticsCompany;

        
        public Integer getAvailable() {
            return available;
        }

        public Long getId() {
            return id;
        }

        public String getLogisticsCompany() {
            return logisticsCompany;
        }

        
    }
    public static class LogisticsCompaniesGetResponse {

        /**
         * 快递公司列表对象
         */
        @JsonProperty("logistics_companies")
        private List<LogisticsCompaniesItem> logisticsCompanies;

        
        public List<LogisticsCompaniesItem> getLogisticsCompanies() {
            return logisticsCompanies;
        }

        
    }
    
}