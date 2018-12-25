package com.pdd.pop.sdk.common.logger;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/3 14:42
 */
public interface PopLogger {

    void info(String msg);
    
    void info(String msg,Throwable t);
    
    void debug(String msg);
    
    void debug(String msg,Throwable t);
    
    void error(String msg);
    
    void error(String msg,Throwable t);
}
