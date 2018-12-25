package com.pdd.pop.sdk.common.logger;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/3 14:49
 */
public class ConsolePopLogger implements  PopLogger{
    
    public void info(String msg) {
        System.out.println(msg);
    }
    
    public void info(String msg, Throwable t) {
        System.out.println(msg);
        t.printStackTrace(System.out);
    }
    
    public void debug(String msg) {
        System.out.println(msg);
    }
    
    public void debug(String msg, Throwable t) {
        System.out.println(msg);
        t.printStackTrace(System.out);
    }
    
    public void error(String msg) {
        System.err.println(msg);
    }
    
    public void error(String msg, Throwable t) {
        System.err.println(msg);
        t.printStackTrace(System.err);
    }
}
