package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdQueryUnitBidHistoryReportResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdQueryUnitBidHistoryReportRequest extends PopBaseHttpRequest<PddAdQueryUnitBidHistoryReportResponse>{

    /**
     * 推广类型  2-展示推广
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 单元id ，分天查询时必填
     */
    @JsonProperty("unit_id")
    private Long unitId;

    /**
     * 计划id
     */
    @JsonProperty("plan_id")
    private Long planId;

    /**
     * 数据聚合方式（1 - 日期，2 - 实体 Id）
     */
    @JsonProperty("group_by")
    private Integer groupBy;

    /**
     * 分天查询时必填
1：通投
2：浏览或购买过店内商品的用户
3：浏览或购买过相似商品的用户
4：近期有推广商品所属叶子类目行为的用户
5：近期对我的店铺的竞品店铺感兴趣的用户
6：近期对我的商品相关属性感兴趣的用户
7：人群包定向
     */
    @JsonProperty("target_type")
    private Integer targetType;

    /**
     * 分天查询时必填 兴趣点ID，targetType不为6/7时，传 0
     */
    @JsonProperty("sub_level_target_id")
    private Long subLevelTargetId;

    /**
     * 汇总报销必填 定向类型列表，表示需要哪些定向类型的数据，多个定向以逗号隔开，例如 "1,2,3,4,5,6,7"
     */
    @JsonProperty("target_types")
    private String targetTypes;

    /**
     * 
     */
    @JsonProperty("page_request")
    private PageRequest pageRequest;

    /**
     * 起始日期 2018-09-28
     */
    @JsonProperty("begin_date")
    private String beginDate;

    /**
     * 结束日期 2018-09-28
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * 排序字段 默认DATE（8）
0 - IMPR_NUM - 曝光量排序、
1 - CLK_NUM - 点击量排序
2 - CLK_RATE - 点击率
3 - CPC - 点击单价排序
4 - SPEND - 消耗排序
5 - PAY_ORDER_NUM - 订单数排序
6 - PAY_GVM - 交易额排序
7 - ROI - 产出比排序
8 - DATE - 日期
9 - CPM - 千次曝光单价
10 - FAV_MALL - 店铺收藏数
     */
    @JsonProperty("order_by")
    private Integer orderBy;

    /**
     * 排序方式 默认降序（0）
0 - DESC - 降序
1 - ASC - 升序
     */
    @JsonProperty("sort_by")
    private Integer sortBy;

    
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
        return "pdd.ad.query.unit.bid.history.report";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdQueryUnitBidHistoryReportResponse> getResponseClass() {
        return PddAdQueryUnitBidHistoryReportResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(unitId != null) {
            paramsMap.put("unit_id", unitId.toString());
            
        }
        if(planId != null) {
            paramsMap.put("plan_id", planId.toString());
            
        }
        if(groupBy != null) {
            paramsMap.put("group_by", groupBy.toString());
            
        }
        if(targetType != null) {
            paramsMap.put("target_type", targetType.toString());
            
        }
        if(subLevelTargetId != null) {
            paramsMap.put("sub_level_target_id", subLevelTargetId.toString());
            
        }
        if(targetTypes != null) {
            paramsMap.put("target_types", targetTypes.toString());
            
        }
        if(pageRequest != null) {
            paramsMap.put("page_request", pageRequest.toString());
            
        }
        if(beginDate != null) {
            paramsMap.put("begin_date", beginDate.toString());
            
        }
        if(endDate != null) {
            paramsMap.put("end_date", endDate.toString());
            
        }
        if(orderBy != null) {
            paramsMap.put("order_by", orderBy.toString());
            
        }
        if(sortBy != null) {
            paramsMap.put("sort_by", sortBy.toString());
            
        }
        
        return paramsMap;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public void setGroupBy(Integer groupBy) {
        this.groupBy = groupBy;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public void setSubLevelTargetId(Long subLevelTargetId) {
        this.subLevelTargetId = subLevelTargetId;
    }

    public void setTargetTypes(String targetTypes) {
        this.targetTypes = targetTypes;
    }

    public void setPageRequest(PageRequest pageRequest) {
        this.pageRequest = pageRequest;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }

    
    public static class PageRequest {

        /**
         * 页码 默认 1
         */
        @JsonProperty("page_number")
        private Integer pageNumber;

        /**
         * 单页记录数 默认 10
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        
        public void setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}