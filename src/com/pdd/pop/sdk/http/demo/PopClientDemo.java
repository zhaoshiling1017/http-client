package com.pdd.pop.sdk.http.demo;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.api.request.PddOrderListGetRequest;
import com.pdd.pop.sdk.http.api.response.PddOrderListGetResponse;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.token.AccessTokenResponse;

public class PopClientDemo {
    
    public static void main(String[] args) {
        String clientId = "your app clientId";
        String clientSecret = "your app clientSecret";
        String accessToken = "your app accessToken";
        
        PopHttpClient client = new PopHttpClient(clientId, clientSecret);
        PddOrderListGetRequest request = new PddOrderListGetRequest();
        request.setRefundStatus(1);
        request.setOrderStatus(1);
        request.setStartConfirmAt(1538040111L);
        request.setEndConfirmAt(1538050447L);
        request.setPage(1);
        request.setPageSize(1);
        
        try {
            // API call
            PddOrderListGetResponse response = client.syncInvoke(request, accessToken);
            System.out.println(JsonUtil.transferToJson(response));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
