package com.unicss;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopAccessTokenClient;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.api.request.PddOrderNumberListIncrementGetRequest;
import com.pdd.pop.sdk.http.api.response.PddOrderNumberListIncrementGetResponse;
import com.pdd.pop.sdk.http.token.AccessTokenResponse;
import com.unicss.util.DateUtil;
import com.unicss.util.StringUtil;

public class Test {
	
	public static void main(String[] args) {
		// getAccessToken();
		getIncrementOrder("2018-12-25 12:00", "2018-12-25 12:30");
	}
	
	public static void getIncrementOrder(String startTime, String endTime) {
		String clientId = "23b22598a53e4a38b2f4f18532cbaf85";
        String clientSecret = "078fccbb98b94c17480de1b467f26f8f8cd9ca56";
        String accessToken = "475ecdcc88b04ee4bba41c97432a05a7331fca60";
        PopClient client = new PopHttpClient(clientId, clientSecret);
        
        PddOrderNumberListIncrementGetRequest request = new PddOrderNumberListIncrementGetRequest();
        request.setIsLuckyFlag(0);
        request.setOrderStatus(1);
        request.setStartUpdatedAt(DateUtil.getDate(startTime, DateUtil.SHORT_TIME_PATTERN).getTime() / 1000);
        request.setEndUpdatedAt(DateUtil.getDate(endTime, DateUtil.SHORT_TIME_PATTERN).getTime() / 1000);
        request.setPageSize(100);
        request.setPage(1);
        request.setRefundStatus(5);
        request.setTradeType(0);

        PddOrderNumberListIncrementGetResponse response;
		try {
			response = client.syncInvoke(request, accessToken);
			System.out.println(JsonUtil.transferToJson(response));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getAccessToken() {
		PopAccessTokenClient accessTokenClient = new PopAccessTokenClient("23b22598a53e4a38b2f4f18532cbaf85", "078fccbb98b94c17480de1b467f26f8f8cd9ca56");
		try {
			AccessTokenResponse response = accessTokenClient.refresh("46011e79f3ce401c9b4610a143e2d67413e19d6f");
			if (null != response && !StringUtil.isBlank(response.getAccessToken())) {
				System.out.println(response.getAccessToken());
				// accessToken = response.getAccessToken();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
