package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddAdBalanceGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("ad_balance_get_response")
    private AdBalanceGetResponse adBalanceGetResponse;

    
    public AdBalanceGetResponse getAdBalanceGetResponse() {
        return adBalanceGetResponse;
    }

    
    public static class AdBalanceGetResponse {

        /**
         * 账户列表
         */
        @JsonProperty("accounts_balance")
        private List<AccountsBalanceItem> accountsBalance;

        /**
         * 总余额，单位厘
         */
        @JsonProperty("advertiser_balance")
        private Long advertiserBalance;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        
        public List<AccountsBalanceItem> getAccountsBalance() {
            return accountsBalance;
        }

        public Long getAdvertiserBalance() {
            return advertiserBalance;
        }

        public Long getMallId() {
            return mallId;
        }

        
    }
    public static class AccountsBalanceItem {

        /**
         * 1 - 现金 2 - 红包
         */
        @JsonProperty("account_type")
        private Integer accountType;

        /**
         * 余额
         */
        @JsonProperty("balance")
        private Long balance;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        
        public Integer getAccountType() {
            return accountType;
        }

        public Long getBalance() {
            return balance;
        }

        public Long getMallId() {
            return mallId;
        }

        
    }
    
}