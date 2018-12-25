package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddRefundAddressListGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("refund_address_list_get_response")
    private RefundAddressListGetResponse refundAddressListGetResponse;

    
    public RefundAddressListGetResponse getRefundAddressListGetResponse() {
        return refundAddressListGetResponse;
    }

    
    public static class RefundAddressListGetResponse {

        /**
         * 退货地址列表
         */
        @JsonProperty("refund_address_list")
        private List<RefundAddressListItem> refundAddressList;

        
        public List<RefundAddressListItem> getRefundAddressList() {
            return refundAddressList;
        }

        
    }
    public static class RefundAddressListItem {

        /**
         * refund_address_id
         */
        @JsonProperty("refund_address_id")
        private String refundAddressId;

        /**
         * refund_id
         */
        @JsonProperty("refund_id")
        private String refundId;

        /**
         * 退货地址ID
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 退货地址
         */
        @JsonProperty("refund_address")
        private String refundAddress;

        /**
         * 退货收件人名字
         */
        @JsonProperty("refund_name")
        private String refundName;

        /**
         * 退货收件人手机号
         */
        @JsonProperty("refund_phone")
        private String refundPhone;

        /**
         * 店铺ID
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 是否为默认退货地址
         */
        @JsonProperty("is_default")
        private String isDefault;

        /**
         * 退货收件人固定电话
         */
        @JsonProperty("refund_tel")
        private String refundTel;

        /**
         * 退货地址所在省份ID
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 退货地址所在省份名字
         */
        @JsonProperty("province_name")
        private String provinceName;

        /**
         * 退货地址所在城市ID
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 退货地址所在城市名字
         */
        @JsonProperty("city_name")
        private String cityName;

        /**
         * 退货地址所在区ID
         */
        @JsonProperty("district_id")
        private Integer districtId;

        /**
         * 退货地址所在区名字
         */
        @JsonProperty("district_name")
        private String districtName;

        /**
         * 退货地址是否合法
         */
        @JsonProperty("is_legal")
        private Boolean isLegal;

        /**
         * 退货地址是否有效
         */
        @JsonProperty("is_validated")
        private Boolean isValidated;

        
        public String getRefundAddressId() {
            return refundAddressId;
        }

        public String getRefundId() {
            return refundId;
        }

        public Long getId() {
            return id;
        }

        public String getRefundAddress() {
            return refundAddress;
        }

        public String getRefundName() {
            return refundName;
        }

        public String getRefundPhone() {
            return refundPhone;
        }

        public Long getMallId() {
            return mallId;
        }

        public String getIsDefault() {
            return isDefault;
        }

        public String getRefundTel() {
            return refundTel;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public Integer getCityId() {
            return cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public Integer getDistrictId() {
            return districtId;
        }

        public String getDistrictName() {
            return districtName;
        }

        public Boolean getIsLegal() {
            return isLegal;
        }

        public Boolean getIsValidated() {
            return isValidated;
        }

        
    }
    
}