package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddAdHistoryReportGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddAdHistoryReportGetRequest extends PopBaseHttpRequest<PddAdHistoryReportGetResponse>{

    /**
     * 开始时间：2018-05-01（周期不超过一个月，记录保存最近30天）
     */
    @JsonProperty("begin_date")
    private String beginDate;

    /**
     * 结束时间：2018-05-02（周期不超过一个月，记录保存最近30天）
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * 0--搜索广告,1--明星店铺,2--定向广告,3--首页Banner广告（目前只支持0，暂不支持1、2、3）
     */
    @JsonProperty("scene_type")
    private Integer sceneType;

    /**
     * 0--曝光量排序,1--点击量排序,2--点击率,3--点击单价排序,4--消耗排序,5--订单数排序,6--交易额排序,7--产出比排序,8--日期;默认8
     */
    @JsonProperty("order_by")
    private Integer orderBy;

    /**
     * 0--降序,1--升序;默认0
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
        return "pdd.ad.history.report.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddAdHistoryReportGetResponse> getResponseClass() {
        return PddAdHistoryReportGetResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(beginDate != null) {
            paramsMap.put("begin_date", beginDate.toString());
            
        }
        if(endDate != null) {
            paramsMap.put("end_date", endDate.toString());
            
        }
        if(sceneType != null) {
            paramsMap.put("scene_type", sceneType.toString());
            
        }
        if(orderBy != null) {
            paramsMap.put("order_by", orderBy.toString());
            
        }
        if(sortBy != null) {
            paramsMap.put("sort_by", sortBy.toString());
            
        }
        
        return paramsMap;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public void setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
    }

    
    
}