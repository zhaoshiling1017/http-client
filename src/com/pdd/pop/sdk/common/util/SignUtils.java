package com.pdd.pop.sdk.common.util;


import com.pdd.pop.sdk.common.constant.Constants;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author xuanli
 * @Description: 签名工具类
 * @date 2018/12/2 17:12
 */
public final class SignUtils {
    
    
    /**
     * 构建签名原字符串
     * 当requestParams为null 或者 空，则原串为空字符串
     *
     * @param requestParams : 请求参数
     * @param clientSecret  : 签名秘钥
     * @return
     */
    public static String buildSignSource(Map<String, String> requestParams, String clientSecret) {
        if (null == requestParams || requestParams.isEmpty()) {
            return "";
        }
        
        Map<String, String> signSrcMap = requestParams;
        // 如果不是 TreeMap 则变成TreeMap 主要是为了key排序
        if (!(requestParams instanceof TreeMap)) {
            signSrcMap = new TreeMap<String, String>();
            signSrcMap.putAll(requestParams);
        }
        StringBuilder signSrcBuilder = new StringBuilder().append(clientSecret);
        for (Map.Entry<String, String> entry : signSrcMap.entrySet()) {
            signSrcBuilder.append(entry.getKey()).append(entry.getValue());
        }
        signSrcBuilder.append(clientSecret);
        
        return signSrcBuilder.toString();
    }
    
    
    /**
     * 构建签名
     *
     * @param requestParams : 请求参数
     * @param clientSecret  : 签名秘钥
     * @return
     */
    public static String sign(Map<String, String> requestParams, String clientSecret) {
        return sign(requestParams, clientSecret, Constants.MD5);
    }
    
    /**
     * 构建签名
     *
     * @param requestParams : 请求参数
     * @param clientSecret  : 签名秘钥
     * @param signMethod    : 签名方法，默认是MD5
     * @return
     */
    public static String sign(Map<String, String> requestParams, String clientSecret, String signMethod) {
        String signSrc = buildSignSource(requestParams, clientSecret);
        return sign(signSrc, signMethod);
    }
    
    /**
     * 构建签名
     *
     * @param signSrc    : 请求参数
     * @param signMethod : 签名方法，默认是MD5
     * @return
     */
    public static String sign(String signSrc, String signMethod) {
        if (Constants.MD5.equals(signMethod)) {
            return DigestUtil.md5(signSrc).toUpperCase();
        }
        throw new RuntimeException("Not Support signMethod:" + signMethod);
    }
    
}
