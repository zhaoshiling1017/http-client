package com.pdd.pop.sdk.http;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;

public class PopBaseHttpResponse {

    @JsonProperty("error_response")
    private ErrorResponse errorResponse;

    public static class ErrorResponse {

        @JsonProperty("error_code")
        private Integer errorCode;

        @JsonProperty("error_msg")
        private String errorMsg;

        public Integer getErrorCode () {
            return errorCode;
        }

        public String getErrorMsg () {
            return errorMsg;
        }
    }

    public ErrorResponse getErrorResponse () {
        return errorResponse;
    }
}
