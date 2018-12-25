package com.pdd.pop.sdk.common.exception;


import com.pdd.pop.sdk.http.ClientErrorCode;

public class PopClientException extends RuntimeException{

    public PopClientException(ClientErrorCode errorCode) {
        super(errorCode.getMessage());
    }

}
