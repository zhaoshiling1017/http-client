package com.pdd.pop.sdk.http.api.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOrderListGetResponse extends PopBaseHttpResponse{

    /**
     * 请求response
     */
    @JsonProperty("order_list_get_response")
    private OrderListGetResponse orderListGetResponse;

    
    public OrderListGetResponse getOrderListGetResponse() {
        return orderListGetResponse;
    }

    
    public static class OrderDepotInfo {

        /**
         * 仓库id
         */
        @JsonProperty("depot_id")
        private Long depotId;

        /**
         * 仓库名称
         */
        @JsonProperty("depot_name")
        private String depotName;

        /**
         * 仓库编码
         */
        @JsonProperty("depot_code")
        private String depotCode;

        /**
         * 货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 货品名称
         */
        @JsonProperty("ware_name")
        private String wareName;

        /**
         * 货品类型（0：普通货品:1：组合货品）
         */
        @JsonProperty("ware_type")
        private Integer wareType;

        /**
         * 货品编码
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        /**
         * 子货品列表（组合货品才会有子货品信息）
         */
        @JsonProperty("ware_sub_info_list")
        private List<WareSubInfoListItem> wareSubInfoList;

        
        public Long getDepotId() {
            return depotId;
        }

        public String getDepotName() {
            return depotName;
        }

        public String getDepotCode() {
            return depotCode;
        }

        public Long getWareId() {
            return wareId;
        }

        public String getWareName() {
            return wareName;
        }

        public Integer getWareType() {
            return wareType;
        }

        public String getWareSn() {
            return wareSn;
        }

        public List<WareSubInfoListItem> getWareSubInfoList() {
            return wareSubInfoList;
        }

        
    }
    public static class ItemListItem {

        /**
         * 商品单件 单价：元
         */
        @JsonProperty("goods_price")
        private Double goodsPrice;

        /**
         * 商品名称
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 商品维度外部编码，注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * sku维度商家外部编码，注意：编辑商品后必须等待商品审核通过后方可生效，订单中商品信息为交易快照的商品信息。
         */
        @JsonProperty("outer_id")
        private String outerId;

        /**
         * 商品sku编码
         */
        @JsonProperty("sku_id")
        private String skuId;

        /**
         * 商品编码
         */
        @JsonProperty("goods_id")
        private String goodsId;

        /**
         * 商品数量
         */
        @JsonProperty("goods_count")
        private Integer goodsCount;

        /**
         * 商品规格
         */
        @JsonProperty("goods_spec")
        private String goodsSpec;

        /**
         * 商品图片
         */
        @JsonProperty("goods_img")
        private String goodsImg;

        
        public Double getGoodsPrice() {
            return goodsPrice;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getOuterId() {
            return outerId;
        }

        public String getSkuId() {
            return skuId;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public Integer getGoodsCount() {
            return goodsCount;
        }

        public String getGoodsSpec() {
            return goodsSpec;
        }

        public String getGoodsImg() {
            return goodsImg;
        }

        
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
         * 子货品id
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
    public static class OrderListGetResponse {

        /**
         * 订单信息列表
         */
        @JsonProperty("order_list")
        private List<OrderListItem> orderList;

        /**
         * 订单总数
         */
        @JsonProperty("total_count")
        private Integer totalCount;

        
        public List<OrderListItem> getOrderList() {
            return orderList;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        
    }
    public static class OrderListItem {

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
         * 卡号信息列表
         */
        @JsonProperty("card_info_list")
        private List<CardInfoListItem> cardInfoList;

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
         * 是否顺丰包邮，1-是 0-否
         */
        @JsonProperty("free_sf")
        private Integer freeSf;

        /**
         * 成交状态：0：未成交、1：已成交、2：已取消
         */
        @JsonProperty("confirm_status")
        private Integer confirmStatus;

        /**
         * 成团状态：0：拼团中、1：已成团、2：团失败
         */
        @JsonProperty("group_status")
        private Integer groupStatus;

        /**
         * 退货包运费，1:是，0:否
         */
        @JsonProperty("return_freight_payer")
        private Integer returnFreightPayer;

        /**
         * 送货入户并安装服务 0-不支持送货，1-送货入户不安装，2-送货入户并安装
         */
        @JsonProperty("home_delivery_type")
        private Integer homeDeliveryType;

        /**
         * {                 "step_discount_amount":4,                 "advanced_paid_fee":1,                 "step_paid_fee":1.1,                 "step_trade_status":2             }
         */
        @JsonProperty("step_order_info")
        private StepOrderInfo stepOrderInfo;

        /**
         * 订单类型 0-普通订单 ，1- 定金订单
         */
        @JsonProperty("trade_type")
        private Integer tradeType;

        /**
         * 订单编号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 团长免单金额，单位：元
         */
        @JsonProperty("capital_free_discount")
        private Double capitalFreeDiscount;

        /**
         * 商家优惠金额，单位：元
         */
        @JsonProperty("seller_discount")
        private Double sellerDiscount;

        /**
         * 平台优惠金额，单位：元
         */
        @JsonProperty("platform_discount")
        private Double platformDiscount;

        /**
         * 订单商品列表
         */
        @JsonProperty("item_list")
        private List<ItemListItem> itemList;

        /**
         * 订单备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * 订单承诺发货时间
         */
        @JsonProperty("last_ship_time")
        private String lastShipTime;

        /**
         * 订单的更新时间
         */
        @JsonProperty("updated_at")
        private String updatedAt;

        /**
         * 售后状态
         */
        @JsonProperty("refund_status")
        private Integer refundStatus;

        /**
         * 是否是抽奖订单，1-非抽奖订单，2-抽奖订单
         */
        @JsonProperty("is_lucky_flag")
        private Integer isLuckyFlag;

        /**
         * 订单状态
         */
        @JsonProperty("order_status")
        private Integer orderStatus;

        /**
         * 发货时间
         */
        @JsonProperty("shipping_time")
        private String shippingTime;

        /**
         * 快递单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        /**
         * 快递公司在拼多多的代码
         */
        @JsonProperty("logistics_id")
        private Long logisticsId;

        /**
         * 支付方式，枚举值：QQ,WEIXIN,ALIPAY,LIANLIANPAY
         */
        @JsonProperty("pay_type")
        private String payType;

        /**
         * 支付单号
         */
        @JsonProperty("pay_no")
        private String payNo;

        /**
         * 邮费，单位：元
         */
        @JsonProperty("postage")
        private Double postage;

        /**
         * 折扣金额，单位：元，折扣金额=平台优惠+商家优惠+团长免单优惠金额
         */
        @JsonProperty("discount_amount")
        private Double discountAmount;

        /**
         * 商品金额，单位：元，商品金额=商品销售价格*商品数量-改价金额（接口暂无该字段）
         */
        @JsonProperty("goods_amount")
        private Double goodsAmount;

        /**
         * 支付金额，单位：元，支付金额=商品金额-折扣金额+邮费
         */
        @JsonProperty("pay_amount")
        private Double payAmount;

        /**
         * 收件人电话，仅订单状态=待发货状态下返回明文，其他状态下返回脱敏手机号，例如“1387677****”
         */
        @JsonProperty("receiver_phone")
        private String receiverPhone;

        /**
         * 详细地址
         */
        @JsonProperty("address")
        private String address;

        /**
         * 区，乡镇
         */
        @JsonProperty("town")
        private String town;

        /**
         * 城市
         */
        @JsonProperty("city")
        private String city;

        /**
         * 省份
         */
        @JsonProperty("province")
        private String province;

        /**
         * 国家
         */
        @JsonProperty("country")
        private String country;

        /**
         * 订单创建时间
         */
        @JsonProperty("created_time")
        private String createdTime;

        /**
         * 收件人姓名
         */
        @JsonProperty("receiver_name")
        private String receiverName;

        /**
         * 成交时间
         */
        @JsonProperty("confirm_time")
        private String confirmTime;

        /**
         * 确认收货时间
         */
        @JsonProperty("receive_time")
        private String receiveTime;

        /**
         * 区县编码
         */
        @JsonProperty("town_id")
        private Integer townId;

        /**
         * 城市编码
         */
        @JsonProperty("city_id")
        private Integer cityId;

        /**
         * 省份编码
         */
        @JsonProperty("province_id")
        private Integer provinceId;

        /**
         * 国家编码
         */
        @JsonProperty("country_id")
        private Integer countryId;

        /**
         * 是否缺货 0-无缺货处理 1： 有缺货处理
         */
        @JsonProperty("is_stock_out")
        private Integer isStockOut;

        /**
         * 缺货处理状态 -1:无缺货处理 0: 缺货待处理 1缺货已处理
         */
        @JsonProperty("stock_out_handle_status")
        private Integer stockOutHandleStatus;

        /**
         * 商品四级分类
         */
        @JsonProperty("cat_id_4")
        private Long catId4;

        /**
         * 商品三级分类
         */
        @JsonProperty("cat_id_3")
        private Long catId3;

        /**
         * 商品二级分类
         */
        @JsonProperty("cat_id_2")
        private Long catId2;

        /**
         * 商品一级分类
         */
        @JsonProperty("cat_id_1")
        private Long catId1;

        /**
         * 支付申报订单号
         */
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;

        /**
         * 买家留言信息
         */
        @JsonProperty("buyer_memo")
        private String buyerMemo;

        /**
         * 发票申请,1代表有 0代表无
         */
        @JsonProperty("invoice_status")
        private Integer invoiceStatus;

        /**
         * 预售时间
         */
        @JsonProperty("pre_sale_time")
        private String preSaleTime;

        /**
         * 是否为预售商品 1表示是 0表示否
         */
        @JsonProperty("is_pre_sale")
        private Integer isPreSale;

        /**
         * 售后状态 0：无售后 2：买家申请退款，待商家处理 3：退货退款，待商家处理 4：商家同意退款，退款中 5：平台同意退款，退款中 6：驳回退款， 待买家处理 7：已同意退货退款,待用户发货 8：平台处理中 9：平台拒 绝退款，退款关闭 10：退款成功 11：买家撤销 12：买家逾期未处 理，退款失败 13：买家逾期，超过有效期 14 : 换货补寄待商家处理 15:换货补寄待用户处理 16:换货补寄成功 17:换货补寄失败 18:换货补寄待用户确认完成
         */
        @JsonProperty("after_sales_status")
        private Integer afterSalesStatus;

        /**
         * 只换不修，1:是，0:否
         */
        @JsonProperty("only_support_replace")
        private Integer onlySupportReplace;

        /**
         * 全国联保，1:是，0:否
         */
        @JsonProperty("support_nationwide_warranty")
        private Integer supportNationwideWarranty;

        /**
         * 支付时间
         */
        @JsonProperty("pay_time")
        private String payTime;

        /**
         * 仓库信息
         */
        @JsonProperty("order_depot_info")
        private OrderDepotInfo orderDepotInfo;

        
        public Double getDeliveryInstallValue() {
            return deliveryInstallValue;
        }

        public Double getDeliveryHomeValue() {
            return deliveryHomeValue;
        }

        public Double getHomeInstallValue() {
            return homeInstallValue;
        }

        public List<CardInfoListItem> getCardInfoList() {
            return cardInfoList;
        }

        public String getIdCardNum() {
            return idCardNum;
        }

        public String getIdCardName() {
            return idCardName;
        }

        public Integer getFreeSf() {
            return freeSf;
        }

        public Integer getConfirmStatus() {
            return confirmStatus;
        }

        public Integer getGroupStatus() {
            return groupStatus;
        }

        public Integer getReturnFreightPayer() {
            return returnFreightPayer;
        }

        public Integer getHomeDeliveryType() {
            return homeDeliveryType;
        }

        public StepOrderInfo getStepOrderInfo() {
            return stepOrderInfo;
        }

        public Integer getTradeType() {
            return tradeType;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public Double getCapitalFreeDiscount() {
            return capitalFreeDiscount;
        }

        public Double getSellerDiscount() {
            return sellerDiscount;
        }

        public Double getPlatformDiscount() {
            return platformDiscount;
        }

        public List<ItemListItem> getItemList() {
            return itemList;
        }

        public String getRemark() {
            return remark;
        }

        public String getLastShipTime() {
            return lastShipTime;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public Integer getRefundStatus() {
            return refundStatus;
        }

        public Integer getIsLuckyFlag() {
            return isLuckyFlag;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public String getShippingTime() {
            return shippingTime;
        }

        public String getTrackingNumber() {
            return trackingNumber;
        }

        public Long getLogisticsId() {
            return logisticsId;
        }

        public String getPayType() {
            return payType;
        }

        public String getPayNo() {
            return payNo;
        }

        public Double getPostage() {
            return postage;
        }

        public Double getDiscountAmount() {
            return discountAmount;
        }

        public Double getGoodsAmount() {
            return goodsAmount;
        }

        public Double getPayAmount() {
            return payAmount;
        }

        public String getReceiverPhone() {
            return receiverPhone;
        }

        public String getAddress() {
            return address;
        }

        public String getTown() {
            return town;
        }

        public String getCity() {
            return city;
        }

        public String getProvince() {
            return province;
        }

        public String getCountry() {
            return country;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public String getReceiverName() {
            return receiverName;
        }

        public String getConfirmTime() {
            return confirmTime;
        }

        public String getReceiveTime() {
            return receiveTime;
        }

        public Integer getTownId() {
            return townId;
        }

        public Integer getCityId() {
            return cityId;
        }

        public Integer getProvinceId() {
            return provinceId;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public Integer getIsStockOut() {
            return isStockOut;
        }

        public Integer getStockOutHandleStatus() {
            return stockOutHandleStatus;
        }

        public Long getCatId4() {
            return catId4;
        }

        public Long getCatId3() {
            return catId3;
        }

        public Long getCatId2() {
            return catId2;
        }

        public Long getCatId1() {
            return catId1;
        }

        public String getInnerTransactionId() {
            return innerTransactionId;
        }

        public String getBuyerMemo() {
            return buyerMemo;
        }

        public Integer getInvoiceStatus() {
            return invoiceStatus;
        }

        public String getPreSaleTime() {
            return preSaleTime;
        }

        public Integer getIsPreSale() {
            return isPreSale;
        }

        public Integer getAfterSalesStatus() {
            return afterSalesStatus;
        }

        public Integer getOnlySupportReplace() {
            return onlySupportReplace;
        }

        public Integer getSupportNationwideWarranty() {
            return supportNationwideWarranty;
        }

        public String getPayTime() {
            return payTime;
        }

        public OrderDepotInfo getOrderDepotInfo() {
            return orderDepotInfo;
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
         * 定金订单状态：step_trade_status 枚举：0-定金未付尾款未付、1-定金已付尾款未付、2-定金已付尾款已付
         */
        @JsonProperty("step_trade_status")
        private Integer stepTradeStatus;

        /**
         * 分阶段已付金额  单位：元
         */
        @JsonProperty("step_paid_fee")
        private Double stepPaidFee;

        /**
         * 已付定金 单位：元
         */
        @JsonProperty("advanced_paid_fee")
        private Double advancedPaidFee;

        /**
         * 膨胀金额 单位：元
         */
        @JsonProperty("step_discount_amount")
        private Double stepDiscountAmount;

        
        public Integer getStepTradeStatus() {
            return stepTradeStatus;
        }

        public Double getStepPaidFee() {
            return stepPaidFee;
        }

        public Double getAdvancedPaidFee() {
            return advancedPaidFee;
        }

        public Double getStepDiscountAmount() {
            return stepDiscountAmount;
        }

        
    }
    
}