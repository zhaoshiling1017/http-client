package com.pdd.pop.sdk.common.logger;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/12/3 14:45
 */
public class PopLoggerFactory {
    
    /**
     * 获取 PopLogger
     *
     * @param clazz
     * @return
     */
    public static PopLogger getLogger(Class clazz) {
        ServiceLoader<PopLogger> popLoggers = ServiceLoader.load(PopLogger.class);
        
        Iterator<PopLogger> it = popLoggers.iterator();
        while (null != it && it.hasNext()) {
            PopLogger logger = it.next();
            if (null != logger) {
                return logger;
            }
        }
        return new ConsolePopLogger();
    }
}
