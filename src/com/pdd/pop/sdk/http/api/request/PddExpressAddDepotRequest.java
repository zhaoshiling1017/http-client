package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddExpressAddDepotResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;


import java.util.Map;
import java.util.TreeMap;

public class PddExpressAddDepotRequest extends PopBaseHttpRequest<PddExpressAddDepotResponse>{

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
     * 别名
     */
    @JsonProperty("depot_alias")
    private String depotAlias;

    /**
     * 所在省id
     */
    @JsonProperty("depot_province_id")
    private Integer depotProvinceId;

    /**
     * 所在市id
     */
    @JsonProperty("depot_city_id")
    private Integer depotCityId;

    /**
     * 所在区id
     */
    @JsonProperty("depot_district_id")
    private Integer depotDistrictId;

    /**
     * 仓库详细地址5-20字
     */
    @JsonProperty("depot_address")
    private String depotAddress;

    /**
     * 邮编
     */
    @JsonProperty("zip_code")
    private String zipCode;

    /**
     * 联系人姓名
     */
    @JsonProperty("contact_name")
    private String contactName;

    /**
     * 联系人电话
     */
    @JsonProperty("telephone")
    private String telephone;

    /**
     * 仓库区域（ 省->市->区id列表）例如：{"34":{"396":[3383]}}Map<Integer, Map<Integer, List<Integer>>>
{
1:{
  2:[3,4]
  }
}
     */
    @JsonProperty("depot_region")
    private Map<Object, Object> depotRegion;

    
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
        return "pdd.express.add.depot";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressAddDepotResponse> getResponseClass() {
        return PddExpressAddDepotResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(depotCode != null) {
            paramsMap.put("depot_code", depotCode.toString());
            
        }
        if(depotName != null) {
            paramsMap.put("depot_name", depotName.toString());
            
        }
        if(depotAlias != null) {
            paramsMap.put("depot_alias", depotAlias.toString());
            
        }
        if(depotProvinceId != null) {
            paramsMap.put("depot_province_id", depotProvinceId.toString());
            
        }
        if(depotCityId != null) {
            paramsMap.put("depot_city_id", depotCityId.toString());
            
        }
        if(depotDistrictId != null) {
            paramsMap.put("depot_district_id", depotDistrictId.toString());
            
        }
        if(depotAddress != null) {
            paramsMap.put("depot_address", depotAddress.toString());
            
        }
        if(zipCode != null) {
            paramsMap.put("zip_code", zipCode.toString());
            
        }
        if(contactName != null) {
            paramsMap.put("contact_name", contactName.toString());
            
        }
        if(telephone != null) {
            paramsMap.put("telephone", telephone.toString());
            
        }
        if(depotRegion != null) {
            paramsMap.put("depot_region", depotRegion.toString());
            
        }
        
        return paramsMap;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public void setDepotAlias(String depotAlias) {
        this.depotAlias = depotAlias;
    }

    public void setDepotProvinceId(Integer depotProvinceId) {
        this.depotProvinceId = depotProvinceId;
    }

    public void setDepotCityId(Integer depotCityId) {
        this.depotCityId = depotCityId;
    }

    public void setDepotDistrictId(Integer depotDistrictId) {
        this.depotDistrictId = depotDistrictId;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDepotRegion(Map<Object, Object> depotRegion) {
        this.depotRegion = depotRegion;
    }

    
    
}