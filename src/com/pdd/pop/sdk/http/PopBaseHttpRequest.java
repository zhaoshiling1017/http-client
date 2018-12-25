package com.pdd.pop.sdk.http;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public abstract class PopBaseHttpRequest<T> {

    private Long timestamp;

    private Map<String, String> headers;

    public Long getTimestamp () {
        if(timestamp==null){
            timestamp = System.currentTimeMillis()/1000;
        }
        return timestamp;
    }

    public abstract String getVersion ();

    public abstract String getDataType ();

    public abstract String getType ();

    public abstract HttpMethod getHttpMethod ();

    public Map<String,String> getHeaders () {
        return headers;
    }

    public void setHeaders (Map<String,String> headers) {
        this.headers = headers;
    }

    public abstract Class<T> getResponseClass();

    public abstract Map<String, String> getParamsMap();

}
