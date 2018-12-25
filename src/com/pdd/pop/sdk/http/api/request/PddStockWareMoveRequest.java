package com.pdd.pop.sdk.http.api.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.response.PddStockWareMoveResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PddStockWareMoveRequest extends PopBaseHttpRequest<PddStockWareMoveResponse>{

    /**
     * 
     */
    @JsonProperty("stock_move_order_action_dto")
    private StockMoveOrderActionDto stockMoveOrderActionDto;

    /**
     * List<JsonObject>的json string, 一次传入StockMoveRecordActionDTO list size不超过30个
     */
    @JsonProperty("stock_move_record_action_dto_list")
    private List<StockMoveRecordActionDtoListItem> stockMoveRecordActionDtoList;

    
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
        return "pdd.stock.ware.move";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareMoveResponse> getResponseClass() {
        return PddStockWareMoveResponse.class;
    }

    @Override
    public Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();

        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());

        if(stockMoveOrderActionDto != null) {
            paramsMap.put("stock_move_order_action_dto", stockMoveOrderActionDto.toString());
            
        }
        if(stockMoveRecordActionDtoList != null) {
            paramsMap.put("stock_move_record_action_dto_list", stockMoveRecordActionDtoList.toString());
            
        }
        
        return paramsMap;
    }

    public void setStockMoveOrderActionDto(StockMoveOrderActionDto stockMoveOrderActionDto) {
        this.stockMoveOrderActionDto = stockMoveOrderActionDto;
    }

    public void setStockMoveRecordActionDtoList(List<StockMoveRecordActionDtoListItem> stockMoveRecordActionDtoList) {
        this.stockMoveRecordActionDtoList = stockMoveRecordActionDtoList;
    }

    
    public static class StockMoveOrderActionDto {

        /**
         * 调整方向。1, "入库"；2, "出库"；3, "库存同步"
         */
        @JsonProperty("move_direction")
        private Integer moveDirection;

        /**
         * 调整单备注
         */
        @JsonProperty("order_note")
        private String orderNote;

        /**
         * 业务类型。1, "采购"；2, "调拨"；3, "退货"；4, "盘点"；5, "发货"；6, "库存同步"
         */
        @JsonProperty("business_type")
        private Integer businessType;

        /**
         * 仓库编码
         */
        @JsonProperty("warehouse_sn")
        private String warehouseSn;

        /**
         * 调整时间
         */
        @JsonProperty("move_time")
        private Long moveTime;

        /**
         * 调整单号
         */
        @JsonProperty("move_order_sn")
        private String moveOrderSn;

        
        public void setMoveDirection(Integer moveDirection) {
            this.moveDirection = moveDirection;
        }

        public void setOrderNote(String orderNote) {
            this.orderNote = orderNote;
        }

        public void setBusinessType(Integer businessType) {
            this.businessType = businessType;
        }

        public void setWarehouseSn(String warehouseSn) {
            this.warehouseSn = warehouseSn;
        }

        public void setMoveTime(Long moveTime) {
            this.moveTime = moveTime;
        }

        public void setMoveOrderSn(String moveOrderSn) {
            this.moveOrderSn = moveOrderSn;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    public static class StockMoveRecordActionDtoListItem {

        /**
         * 备注
         */
        @JsonProperty("note")
        private String note;

        /**
         * 调整数量
         */
        @JsonProperty("move_num")
        private Long moveNum;

        /**
         * 货品sn
         */
        @JsonProperty("ware_sn")
        private String wareSn;

        
        public void setNote(String note) {
            this.note = note;
        }

        public void setMoveNum(Long moveNum) {
            this.moveNum = moveNum;
        }

        public void setWareSn(String wareSn) {
            this.wareSn = wareSn;
        }

        
        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
    
}