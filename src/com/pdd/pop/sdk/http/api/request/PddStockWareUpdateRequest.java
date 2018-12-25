package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockWareUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddStockWareUpdateRequest extends PopBaseHttpRequest<PddStockWareUpdateResponse>{

    /**
     * 货品id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 类型 0:单独货品。1:组合货品
     */
    @JsonProperty("ware_type")
    private Integer wareType;

    /**
     * 组合货品中子货品的关联关系, ware_type为1时必填；
     */
    @JsonProperty("ware_infos")
    private List<WareInfosItem> wareInfos;

    /**
     * 货品编码
     */
    @JsonProperty("ware_sn")
    private String wareSn;

    /**
     * 货品名称
     */
    @JsonProperty("ware_name")
    private String wareName;

    /**
     * 备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 高低值服务
     */
    @JsonProperty("service_quality")
    private Integer serviceQuality;

    /**
     * 体积：立方毫米，只精确到100（即：最末两位为0）
     */
    @JsonProperty("volume")
    private Integer volume;

    /**
     * 长：毫米，精确到1
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽：毫米，精确到1
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高：毫米，精确到1
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 重量：g，精确到10（即：末位为0）
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 毛重：g，精确到10（即：末位为0）
     */
    @JsonProperty("gross_weight")
    private Integer grossWeight;

    /**
     * 净重：g，精确到10（即：末位为0）
     */
    @JsonProperty("net_weight")
    private Integer netWeight;

    /**
     * 皮重：g，精确到10（即：末位为0）
     */
    @JsonProperty("tare_weight")
    private Integer tareWeight;

    /**
     * 单价：分，精确到10（即：末位为0）
     */
    @JsonProperty("price")
    private Integer price;

    /**
     * 颜色
     */
    @JsonProperty("color")
    private String color;

    /**
     * 包材
     */
    @JsonProperty("packing")
    private String packing;

    
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
        return "pdd.stock.ware.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareUpdateResponse> getResponseClass() {
        return PddStockWareUpdateResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(id != null) {
            paramsMap.put("id", id.toString());
            
        }
        if(wareType != null) {
            paramsMap.put("ware_type", wareType.toString());
            
        }
        if(wareInfos != null) {
            paramsMap.put("ware_infos", wareInfos.toString());
            
        }
        if(wareSn != null) {
            paramsMap.put("ware_sn", wareSn.toString());
            
        }
        if(wareName != null) {
            paramsMap.put("ware_name", wareName.toString());
            
        }
        if(note != null) {
            paramsMap.put("note", note.toString());
            
        }
        if(serviceQuality != null) {
            paramsMap.put("service_quality", serviceQuality.toString());
            
        }
        if(volume != null) {
            paramsMap.put("volume", volume.toString());
            
        }
        if(length != null) {
            paramsMap.put("length", length.toString());
            
        }
        if(width != null) {
            paramsMap.put("width", width.toString());
            
        }
        if(height != null) {
            paramsMap.put("height", height.toString());
            
        }
        if(weight != null) {
            paramsMap.put("weight", weight.toString());
            
        }
        if(grossWeight != null) {
            paramsMap.put("gross_weight", grossWeight.toString());
            
        }
        if(netWeight != null) {
            paramsMap.put("net_weight", netWeight.toString());
            
        }
        if(tareWeight != null) {
            paramsMap.put("tare_weight", tareWeight.toString());
            
        }
        if(price != null) {
            paramsMap.put("price", price.toString());
            
        }
        if(color != null) {
            paramsMap.put("color", color.toString());
            
        }
        if(packing != null) {
            paramsMap.put("packing", packing.toString());
            
        }
        
        return paramsMap;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWareType(Integer wareType) {
        this.wareType = wareType;
    }

    public void setWareInfos(List<WareInfosItem> wareInfos) {
        this.wareInfos = wareInfos;
    }

    public void setWareSn(String wareSn) {
        this.wareSn = wareSn;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setServiceQuality(Integer serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setGrossWeight(Integer grossWeight) {
        this.grossWeight = grossWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public void setTareWeight(Integer tareWeight) {
        this.tareWeight = tareWeight;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    
    public static class WareInfosItem {

        /**
         * 子货品id
         */
        @JsonProperty("ware_id")
        private Long wareId;

        /**
         * 子货品数量
         */
        @JsonProperty("ware_quantity")
        private Integer wareQuantity;

        
        public void setWareId(Long wareId) {
            this.wareId = wareId;
        }

        public void setWareQuantity(Integer wareQuantity) {
            this.wareQuantity = wareQuantity;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}