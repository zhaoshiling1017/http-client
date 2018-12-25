package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderNumberListIncrementGetResponse extends PopBaseHttpResponse{

    /**
     * response
     */
    @JsonProperty("order_sn_increment_get_response")
    private OrderSnIncrementGetResponse orderSnIncrementGetResponse;

    
    public OrderSnIncrementGetResponse getOrderSnIncrementGetResponse() {
        return orderSnIncrementGetResponse;
    }

    
    public static class WareSubInfoListItem {

        /**
         * 子货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 子货品数量
         */
        @JsonProperty("ware_quantity")
        private Long wareQuantity;

        /**
         * 子货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 子货品1id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        
        public String getWareSn() {
            return wareSn;
        }

        public Long getWareQuantity() {
            return wareQuantity;
        }

        public String getWareName() {
            return wareName;
        }

        public Long getWareId() {
            return wareId;
        }

        
    }
    public static class ItemListItem {

        /**
         * 商品编号
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品规格编码
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 商家外部编码（sku），注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商家外部编码（商品），注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品销售价格
         */
        @JsonProperty("goods_price")
        private Double goodsPrice;

        /**
         * 商品规格，使用（规格值1,规格值2）组合作为sku的表示，中间以英文逗号隔开
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 商品数量
         */
        @JsonProperty("goods_count")
        private Long goodsCount;

        /**
         * 商品图片
         */
        @JsonProperty("goods_img")
        private String goodsImg;

        
        public Long getGoodsId() {
            return goodsId;
        }

        public Long getSkuId() {
            return skuId;
        }

        public String getOuterId() {
            return outerId;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Double getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public Long getGoodsCount() {
            return goodsCount;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        
    }
    public static class OrderSnIncrementGetResponse {

        /**
         * 返回订单的总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        /**
         * 订单列表对象
         */
        @JsonProperty("order_sn_list")
        private List<OrderSnListItem> orderSnList;

        
        public Integer getTotalCount() {
            return totalCount;
        }

        public List<OrderSnListItem> getOrderSnList() {
            return orderSnList;
        }

        
    }
    public static class OrderSnListItem {

        /**
         * 送货入户并安装费用 单位：元
         */
        @JsonProperty("delivery_install_value")
        private Double deliveryInstallValue;

        /**
         * 送货入户费用 单位：元
         */
        @JsonProperty("delivery_home_value")
        private Double deliveryHomeValue;

        /**
         * 上门安装费用 单位：元
         */
        @JsonProperty("home_install_value")
        private Double homeInstallValue;

        /**
         * 身份证号码
         */
        @JsonProperty("id_card_num")
        private String idCardNum;

        /**
         * 身份证姓名
         */
        @JsonProperty("id_card_name")
        private String idCardName;

        /**
         * 卡号信息列表
         */
        @JsonProperty("card_info_list")
        private List<CardInfoListItem> cardInfoList;

        /**
         * 送货入户并安装服务 0-不支持送货，1-送货入户不安装，2-送货入户并安装
         */
        @JsonProperty("home_delivery_type")
        private Integer homeDeliveryType;

        /**
         * 是否顺丰包邮，1-是 0-否
         */
        @JsonProperty("free_sf")
        private Integer freeSf;

        /**
         * 成团状态：0：拼团中、1：已成团、2：团失败
         */
        @JsonProperty("group_status")
        private Integer groupStatus;

        /**
         * 成交状态：0：未成交、1：已成交、2：已取消
         */
        @JsonProperty("confirm_status")
        private Integer confirmStatus;

        /**
         * 定金订单信息，非定金订单为null
         */
        @JsonProperty("step_order_info")
        private StepOrderInfo stepOrderInfo;

        /**
         * 订单类型：0-普通订单、1-定金订单
         */
        @JsonProperty("trade_type")
        private Integer tradeType;

        /**
         * 仓库信息
         */
        @JsonProperty("order_depot_info")
        private OrderDepotInfo orderDepotInfo;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private String payTime;

        /**
         * 全国联保，1:是，0:否
         */
        @JsonProperty("support_nationwide_warranty")
        private Integer supportNationwideWarranty;

        /**
         * 退货包运费，1:是，0:否
         */
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;

        /**
         * 只换不修，1:是，0:否
         */
        @JsonProperty("only_support_replace")
        private Integer onlySupportReplace;

        /**
         * 售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款， 待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒 绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处 理，退款失败 13：买家逾期，超过有效期 14 : 换货补寄待商家处理 15:换货补寄待用户处理 16:换货补寄成功 17:换货补寄失败 18:换货补寄待用户确认完成
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 是否为预售商品 1表示是 0表示否
         */
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private String preSaleTime;

        /**
         * 发票申请,1代表有 0代表无
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 买家留言信息
         */
        @JsonProperty("buyer_memo")
        private String buyerMemo;

        /**
         * 支付申报订单号
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 商品一级分类
         */
        @JsonProperty("cat_id_1")
        private Long catId1;

        /**
         * 商品二级分类
         */
        @JsonProperty("cat_id_2")
        private Long catId2;

        /**
         * 商品三级分类
         */
        @JsonProperty("cat_id_3")
        private Long catId3;

        /**
         * 商品四级分类
         */
        @JsonProperty("cat_id_4")
        private Long catId4;

        /**
         * 缺货处理状态，-1:无缺货处理 0: 缺货待处理 1缺货已处理
         */
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;

        /**
         * 是否缺货 0-无缺货处理 1： 有缺货处理
         */
        @JsonProperty("is_stock_out")
        private Integer isStockOut;

        /**
         * 国家编码
         */
        @JsonProperty("country_id")
        private Integer countryId;

        /**
         * 省份编码
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 城市编码
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 区县编码
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 确认收货时间
         */
        @JsonProperty("receive_time")
        private String receiveTime;

        /**
         * 团长免单优惠金额，只在团长免单活动中才会返回优惠金额
         */
        @JsonProperty("capital_free_discount")
        private Double capitalFreeDiscount;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 成交时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 收件人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 收件地国家
         */
        @JsonProperty("country")
        private String country;

        /**
         * 收件地省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 收件地城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 收件地区县
         */
        @JsonProperty("town")
        private String town;

        /**
         * 收件详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 收件人电话，仅订单状态为待发货状态下返回明文，其他状态下返回脱敏手机号，例如“1387677****”
         */
        @JsonProperty("receiver_phone")
        private String receiverPhone;

        /**
         * 支付金额（元），支付金额=商品金额-折扣金额+邮费
         */
        @JsonProperty("pay_amount")
        private Double payAmount;

        /**
         * 商品金额（元），商品金额=商品销售价格*商品数量-改价金额（接口暂无该字段）
         */
        @JsonProperty("goods_amount")
        private Double goodsAmount;

        /**
         * 折扣金额（元），折扣金额=平台优惠+商家优惠+团长免单优惠金额
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 邮费
         */
        @JsonProperty("postage")
        private Double postage;

        /**
         * 支付单号
         */
        @JsonProperty("pay_no")
        private String payNo;

        /**
         * 支付方式，枚举值：QQ,WEIXIN,ALIPAY,LIANLIANPAY
         */
        @JsonProperty("pay_type")
        private String payType;

        /**
         * 快递公司编号
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 快递运单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 发货时间
         */
        @JsonProperty("shipping_time")
        private String shippingTime;

        /**
         * 发货状态，枚举值：1：待发货，2：已发货待签收，3：已签收
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 是否抽奖订单，1-非抽奖订单，2-抽奖订单
         */
        @JsonProperty("is_lucky_flag")
        private Integer isLuckyFlag;

        /**
         * 退款状态，枚举值：1：无售后或售后关闭，2：售后处理中，3：退款中，4： 退款成功
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 订单最近一次更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        /**
         * 订单承诺发货时间
         */
        @JsonProperty("last_ship_time")
        private String lastShipTime;

        /**
         * 商家订单备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 商品规格对象
         */
        @JsonProperty("item_list")
        private List<ItemListItem> itemList;

        /**
         * 平台优惠金额
         */
        @JsonProperty("platform_discount")
        private Double platformDiscount;

        /**
         * 店铺优惠金额
         */
        @JsonProperty("seller_discount")
        private Double sellerDiscount;

        
        public Double getDeliveryInstallValue() {
            return deliveryInstallValue;
        }

        public Double getDeliveryHomeValue() {
            return deliveryHomeValue;
        }

        public Double getHomeInstallValue() {
            return homeInstallValue;
        }

        public String getIdCardNum() {
            return idCardNum;
        }

        public String getIdCardName() {
            return idCardName;
        }

        public List<CardInfoListItem> getCardInfoList() {
            return cardInfoList;
        }

        public Integer getHomeDeliveryType() {
            return homeDeliveryType;
        }

        public Integer getFreeSf() {
            return freeSf;
        }

        public Integer getGroupStatus() {
            return groupStatus;
        }

        public Integer getConfirmStatus() {
            return confirmStatus;
        }

        public StepOrderInfo getStepOrderInfo() {
            return stepOrderInfo;
        }

        public Integer getTradeType() {
            return tradeType;
        }

        public OrderDepotInfo getOrderDepotInfo() {
            return orderDepotInfo;
        }

        public String getPayTime() {
            return payTime;
        }

        public Integer getSupportNationwideWarranty() {
            return supportNationwideWarranty;
        }

        public Integer getReturnFreightPayer() {
            return returnFreightPayer;
        }

        public Integer getOnlySupportReplace() {
            return onlySupportReplace;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public Integer getIsPreSale() {
            return isPreSale;
        }

        public String getPreSaleTime() {
            return preSaleTime;
        }

        public Integer getInvoiceStatus() {
            return invoiceStatus;
        }

        public String getBuyerMemo() {
            return buyerMemo;
        }

        public String getInnerTransactionId() {
            return innerTransactionId;
        }

        public Long getCatId1() {
            return catId1;
        }

        public Long getCatId2() {
            return catId2;
        }

        public Long getCatId3() {
            return catId3;
        }

        public Long getCatId4() {
            return catId4;
        }

        public Integer getStockOutHandleStatus() {
            return stockOutHandleStatus;
        }

        public Integer getIsStockOut() {
            return isStockOut;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getTownId() {
            return townId;
        }

        public String getReceiveTime() {
            return receiveTime;
        }

        public Double getCapitalFreeDiscount() {
            return capitalFreeDiscount;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public String getCountry() {
            return country;
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

        public String getAddress() {
            return address;
        }

        public String getReceiverPhone() {
            return receiverPhone;
        }

        public Double getPayAmount() {
            return payAmount;
        }

        public Double getGoodsAmount() {
            return goodsAmount;
        }

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public Double getPostage() {
            return postage;
        }

        public String getPayNo() {
            return payNo;
        }

        public String getPayType() {
            return payType;
        }

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public String getShippingTime() {
            return shippingTime;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public Integer getIsLuckyFlag() {
            return isLuckyFlag;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public String getLastShipTime() {
            return lastShipTime;
        }

        public String getRemark() {
            return remark;
        }

        public List<ItemListItem> getItemList() {
            return itemList;
        }

        public Double getPlatformDiscount() {
            return platformDiscount;
        }

        public Double getSellerDiscount() {
            return sellerDiscount;
        }

        
    }
    public static class CardInfoListItem {

        /**
         * 卡号
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 卡密
         */
        @JsonProperty("mask_password")
        private String maskPassword;

        
        public String getCardNo() {
            return cardNo;
        }

        public String getMaskPassword() {
            return maskPassword;
        }

        
    }
    public static class StepOrderInfo {

        /**
         * 分阶段已付定金 单位：元
         */
        @JsonProperty("advanced_paid_fee")
        private Double advancedPaidFee;

        /**
         * 分阶段已付金额  单位：元
         */
        @JsonProperty("step_paid_fee")
        private Double stepPaidFee;

        /**
         * 膨胀金额  单位：元
         */
        @JsonProperty("step_discount_amount")
        private Double stepDiscountAmount;

        /**
         * 定金订单状态：0-定金未付尾款未付、1-定金已付尾款未付、2-定金已付尾款已付
         */
        @JsonProperty("step_trade_status")
        private Integer stepTradeStatus;

        
        public Double getAdvancedPaidFee() {
            return advancedPaidFee;
        }

        public Double getStepPaidFee() {
            return stepPaidFee;
        }

        public Double getStepDiscountAmount() {
            return stepDiscountAmount;
        }

        public Integer getStepTradeStatus() {
            return stepTradeStatus;
        }

        
    }
    public static class OrderDepotInfo {

        /**
         * 子货品列表（组合货品才会有子货品信息）
         */
        @JsonProperty("ware_sub_info_list")
        private List<WareSubInfoListItem> wareSubInfoList;

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 货品类型（0：普通货品:1：组合货品）
         */
        @JsonProperty("ware_type")
        private Integer wareType;

        /**
         * 货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private String wareId;

        /**
         * 仓库编码
         */
        @JsonProperty("depot_code")
        private String depotCode;

        /**
         * 仓库名称
         */
        @JsonProperty("depot_name")
        private String depotName;

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private String depotId;

        
        public List<WareSubInfoListItem> getWareSubInfoList() {
            return wareSubInfoList;
        }

        public String getWareSn() {
            return wareSn;
        }

        public Integer getWareType() {
            return wareType;
        }

        public String getWareName() {
            return wareName;
        }

        public String getWareId() {
            return wareId;
        }

        public String getDepotCode() {
            return depotCode;
        }

        public String getDepotName() {
            return depotName;
        }

        public String getDepotId() {
            return depotId;
        }

        
    }
    
}