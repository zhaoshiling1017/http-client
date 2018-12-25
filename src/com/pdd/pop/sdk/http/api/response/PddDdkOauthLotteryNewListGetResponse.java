package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthLotteryNewListGetResponse extends PopBaseHttpResponse{

    /**
     * lottery_new_show_bill_response
     */
    @JsonProperty("lottery_new_show_bill_response")
    private LotteryNewShowBillResponse lotteryNewShowBillResponse;

    
    public LotteryNewShowBillResponse getLotteryNewShowBillResponse() {
        return lotteryNewShowBillResponse;
    }

    
    public static class ListItem {

        /**
         * 推广位
         */
        @JsonProperty("pid")
        private String pid;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 商品缩略图
         */
        @JsonProperty("goods_thumb_url")
        private String goodsThumbUrl;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private String payTime;

        /**
         * 最后更新时间
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        /**
         * 审核时间
         */
        @JsonProperty("verify_time")
        private String verifyTime;

        /**
         * 订单状态： -1 未支付; 0-已支付；1-已成团；2-确认收货；3-审核成功；4-审核失败（不可提现）；5-已经结算；8-非多多进宝商品（无佣金订单）;10-已处罚
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 自定义参数，标志订单来源于哪个自定义参数
         */
        @JsonProperty("custom_parameters")
        private String customParameters;

        
        public String getPid() {
            return pid;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getGoodsThumbUrl() {
            return goodsThumbUrl;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getPayTime() {
            return payTime;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }

        public String getVerifyTime() {
            return verifyTime;
        }

        public Integer getStatus() {
            return status;
        }

        public String getCustomParameters() {
            return customParameters;
        }

        
    }
    public static class LotteryNewShowBillResponse {

        /**
         * 返回列表
         */
        @JsonProperty("list")
        private List<ListItem> list;

        /**
         * 每页数量
         */
        @JsonProperty("page_num")
        private Integer pageNum;

        /**
         * 分页数
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        /**
         * 13
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        
        public List<ListItem> getList() {
            return list;
        }

        public Integer getPageNum() {
            return pageNum;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        
    }
    
}