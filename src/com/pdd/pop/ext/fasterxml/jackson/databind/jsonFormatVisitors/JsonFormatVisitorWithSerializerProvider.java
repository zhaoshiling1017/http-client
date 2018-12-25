/**
 * 
 */
package com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors;

import com.pdd.pop.ext.fasterxml.jackson.databind.SerializerProvider;

/**
 * @author jphelan
 */
public interface JsonFormatVisitorWithSerializerProvider {
    public SerializerProvider getProvider();
    public abstract void setProvider(SerializerProvider provider);
}
