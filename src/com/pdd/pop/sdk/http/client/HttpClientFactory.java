package com.pdd.pop.sdk.http.client;

import com.pdd.pop.sdk.http.HttpClientConfig;
import com.pdd.pop.ext.apache.http.client.config.RequestConfig;
import com.pdd.pop.ext.apache.http.config.RegistryBuilder;
import com.pdd.pop.ext.apache.http.conn.HttpClientConnectionManager;
import com.pdd.pop.ext.apache.http.conn.socket.ConnectionSocketFactory;
import com.pdd.pop.ext.apache.http.conn.socket.PlainConnectionSocketFactory;
import com.pdd.pop.ext.apache.http.conn.ssl.NoopHostnameVerifier;
import com.pdd.pop.ext.apache.http.conn.ssl.SSLConnectionSocketFactory;
import com.pdd.pop.ext.apache.http.conn.ssl.TrustStrategy;
import com.pdd.pop.ext.apache.http.impl.client.CloseableHttpClient;
import com.pdd.pop.ext.apache.http.impl.client.HttpClientBuilder;
import com.pdd.pop.ext.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import com.pdd.pop.ext.apache.http.ssl.SSLContextBuilder;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author xuanli
 * @Description: ConnectionManagerFactory
 * @date 2018/12/4 17:57
 */
public class HttpClientFactory {
    
    /**
     * 构造 HttpClientConnectionManager
     * @return
     */
    public static HttpClientConnectionManager getConnectionManager(int maxTotal, int maxPerRoute) {
        
        SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
        SSLContext sslContext;
        
        try {
            sslContextBuilder.loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            });
            sslContext = sslContextBuilder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        RegistryBuilder<ConnectionSocketFactory> socketFactoryRegistryBuilder = RegistryBuilder.create();
        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
        socketFactoryRegistryBuilder.register("http", new PlainConnectionSocketFactory()).register("https", connectionFactory).build();
        
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistryBuilder.build());
        connectionManager.setMaxTotal(maxTotal);
        connectionManager.setDefaultMaxPerRoute(maxPerRoute);
        
        return connectionManager;
    }
    
    /**
     * 构建 HttpClient
     * @param httpClientConfig
     * @return
     */
    public static CloseableHttpClient getHttpClient(HttpClientConfig httpClientConfig){
        
        HttpClientConfig config = httpClientConfig;
        if(null == httpClientConfig){
            config = HttpClientConfig.getDefault();
        }
        
        HttpClientBuilder builder = HttpClientBuilder.create();
        RequestConfig defaultConfig = RequestConfig.custom().setConnectTimeout(config.getConnectionTimeoutMillis())
                .setSocketTimeout(config.getSocketTimeoutMillis())
                .setConnectionRequestTimeout(config.getConnectionRequestTimeout()).build();
        builder.setDefaultRequestConfig(defaultConfig);
    
        HttpClientConnectionManager connectionManager = getConnectionManager(config.getMaxTotal(),config.getDefaultMaxPerRoute());
        builder.setConnectionManager(connectionManager);
    
        return builder.build();
    }
    
}
