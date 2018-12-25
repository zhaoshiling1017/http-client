package com.pdd.pop.sdk.http;

public enum ClientErrorCode {

    SUC("0", "成功"),

    FAIL("1000", "失败"),
    ILLEGAL_HTTP_METHOD("1001", "非法Http方法"),
    HTTP_STATUS_FAIL("1002", "HTTP返回码失败"),
    ILLEGAL_PARAMETERS("1003", "非法参数"),

    TRANSFET_ERROR("1004","对象转化失败"),
    DESTROY_CLIENT_ERROR("1005", "关闭客户端失败"),

    ;
    private final String code;
    private final String message;

    ClientErrorCode (String code,String message) {
        this.message = message;
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage () {
        return message;
    }

}
