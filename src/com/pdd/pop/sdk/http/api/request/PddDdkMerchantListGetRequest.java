package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddDdkMerchantListGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddDdkMerchantListGetRequest extends PopBaseHttpRequest<PddDdkMerchantListGetResponse>{

    /**
     * 店铺id
     */
    @JsonProperty("mall_id_list")
    private List<Long> mallIdList;

    /**
     * 店铺类型
     */
    @JsonProperty("merchant_type_list")
    private List<Integer> merchantTypeList;

    /**
     * 查询范围0----商品拼团价格区间；1----商品券后价价格区间；2----佣金比例区间；3----优惠券金额区间；4----加入多多进宝时间区间；5----销量区间；6----佣金金额区间
     */
    @JsonProperty("query_range_str")
    private Integer queryRangeStr;

    /**
     * 商品类目ID，使用pdd.goods.cats.get接口获取
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 是否有优惠券 （0 所有；1 必须有券。）
     */
    @JsonProperty("has_coupon")
    private Integer hasCoupon;

    /**
     * 每页数量
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页数
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 筛选范围
     */
    @JsonProperty("range_vo_list")
    private String rangeVoList;

    
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
        return "pdd.ddk.merchant.list.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkMerchantListGetResponse> getResponseClass() {
        return PddDdkMerchantListGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(mallIdList != null) {
            paramsMap.put("mall_id_list", mallIdList.toString());
            
        }
        if(merchantTypeList != null) {
            paramsMap.put("merchant_type_list", merchantTypeList.toString());
            
        }
        if(queryRangeStr != null) {
            paramsMap.put("query_range_str", queryRangeStr.toString());
            
        }
        if(catId != null) {
            paramsMap.put("cat_id", catId.toString());
            
        }
        if(hasCoupon != null) {
            paramsMap.put("has_coupon", hasCoupon.toString());
            
        }
        if(pageNumber != null) {
            paramsMap.put("page_number", pageNumber.toString());
            
        }
        if(pageSize != null) {
            paramsMap.put("page_size", pageSize.toString());
            
        }
        if(rangeVoList != null) {
            paramsMap.put("range_vo_list", rangeVoList.toString());
            
        }
        
        return paramsMap;
    }

    public void setMallIdList(List<Long> mallIdList) {
        this.mallIdList = mallIdList;
    }

    public void setMerchantTypeList(List<Integer> merchantTypeList) {
        this.merchantTypeList = merchantTypeList;
    }

    public void setQueryRangeStr(Integer queryRangeStr) {
        this.queryRangeStr = queryRangeStr;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setHasCoupon(Integer hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setRangeVoList(String rangeVoList) {
        this.rangeVoList = rangeVoList;
    }

    
    
}