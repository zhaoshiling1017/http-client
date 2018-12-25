package com.pdd.pop.sdk.common.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xuanli
 * @Description: TODO
 * @date 2018/11/27 23:47
 */
public abstract class IOSupport {
    
    public static String readString(InputStream inputStream){
        try {
            byte[] bytes =  new byte[inputStream.available()];
            inputStream.read(bytes);
            return new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}
