package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkGoodsSearchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkGoodsSearchRequest extends PopBaseHttpRequest<PddDdkGoodsSearchResponse>{

    /**
     * 商品关键词，与opt_id字段选填一个或全部填写
     */
    @JsonProperty("keyword")
    private String keyword;

    /**
     * 商品标签类目ID，使用pdd.goods.opt.get获取
     */
    @JsonProperty("opt_id")
    private Long optId;

    /**
     * 默认值1，商品分页数
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 默认100，每页商品数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 排序方式:0-综合排序;1-按佣金比率升序;2-按佣金比例降序;3-按价格升序;4-按价格降序;5-按销量升序;6-按销量降序;7-优惠券金额排序升序;8-优惠券金额排序降序;9-券后价升序排序;10-券后价降序排序;11-按照加入多多进宝时间升序;12-按照加入多多进宝时间降序;13-按佣金金额升序排序;14-按佣金金额降序排序;15-店铺描述评分升序;16-店铺描述评分降序;17-店铺物流评分升序;18-店铺物流评分降序;19-店铺服务评分升序;20-店铺服务评分降序;27-描述评分击败同类店铺百分比升序，28-描述评分击败同类店铺百分比降序，29-物流评分击败同类店铺百分比升序，30-物流评分击败同类店铺百分比降序，31-服务评分击败同类店铺百分比升序，32-服务评分击败同类店铺百分比降序
     */
    @JsonProperty("sort_type")
    private Integer sortType;

    /**
     * 是否只返回优惠券的商品，false返回所有商品，true只返回有优惠券的商品
     */
    @JsonProperty("with_coupon")
    private Boolean withCoupon;

    /**
     * 范围列表，可选值：[{"range_id":0,"range_from":1,"range_to":1500},{"range_id":1,"range_from":1,"range_to":1500}]
     */
    @JsonProperty("range_list")
    private String rangeList;

    /**
     * 商品类目ID，使用pdd.goods.cats.get接口获取
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 商品ID列表。例如：[123456,123]，当入参带有goods_id_list字段，将不会以opt_id、 cat_id、keyword维度筛选商品
     */
    @JsonProperty("goods_id_list")
    private List<Long> goodsIdList;

    /**
     * 招商多多客ID
     */
    @JsonProperty("zs_duo_id")
    private Long zsDuoId;

    /**
     * 店铺类型，1-个人，2-企业，3-旗舰店，4-专卖店，5-专营店，6-普通店（未传为全部）
     */
    @JsonProperty("merchant_type")
    private Integer merchantType;

    /**
     * 推广位id
     */
    @JsonProperty("pid")
    private String pid;

    /**
     * 自定义参数
     */
    @JsonProperty("custom_parameters")
    private String customParameters;

    
    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public String getType() {
        return "pdd.ddk.goods.search";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsSearchResponse> getResponseClass() {
        return PddDdkGoodsSearchResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(keyword != null) {
            paramsMap.put("keyword", keyword.toString());
            
        }
        if(optId != null) {
            paramsMap.put("opt_id", optId.toString());
            
        }
        if(page != null) {
            paramsMap.put("page", page.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(sortType != null) {
            paramsMap.put("sort_type", sortType.toString());
            
        }
        if(withCoupon != null) {
            paramsMap.put("with_coupon", withCoupon.toString());
            
        }
        if(rangeList != null) {
            paramsMap.put("range_list", rangeList.toString());
            
        }
        if(catId != null) {
            paramsMap.put("cat_id", catId.toString());
            
        }
        if(goodsIdList != null) {
            paramsMap.put("goods_id_list", goodsIdList.toString());
            
        }
        if(zsDuoId != null) {
            paramsMap.put("zs_duo_id", zsDuoId.toString());
            
        }
        if(merchantType != null) {
            paramsMap.put("merchant_type", merchantType.toString());
            
        }
        if(pid != null) {
            paramsMap.put("pid", pid.toString());
            
        }
        if(customParameters != null) {
            paramsMap.put("custom_parameters", customParameters.toString());
            
        }
        
        return paramsMap;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public void setWithCoupon(Boolean withCoupon) {
        this.withCoupon = withCoupon;
    }

    public void setRangeList(String rangeList) {
        this.rangeList = rangeList;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public void setZsDuoId(Long zsDuoId) {
        this.zsDuoId = zsDuoId;
    }

    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setCustomParameters(String customParameters) {
        this.customParameters = customParameters;
    }

    
    
}