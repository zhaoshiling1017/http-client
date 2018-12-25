package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCountryGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("goods_country_get_response")
    private GoodsCountryGetResponse goodsCountryGetResponse;

    
    public GoodsCountryGetResponse getGoodsCountryGetResponse() {
        return goodsCountryGetResponse;
    }

    
    public static class GoodsCountryGetResponse {

        /**
         * 国家或地区对象列表
         */
        @JsonProperty("country_list")
        private List<CountryListItem> countryList;

        
        public List<CountryListItem> getCountryList() {
            return countryList;
        }

        
    }
    public static class CountryListItem {

        /**
         * 国家或地区对应的ID
         */
        @JsonProperty("country_id")
        private Long countryId;

        /**
         * 对应ID下的国家或地区名称
         */
        @JsonProperty("country_name")
        private String countryName;

        
        public Long getCountryId() {
            return countryId;
        }

        public String getCountryName() {
            return countryName;
        }

        
    }
    
}