package com.pdd.pop.ext.fasterxml.jackson.databind.ser.impl;

import java.io.IOException;
import java.lang.reflect.Type;

import com.pdd.pop.ext.fasterxml.jackson.core.*;
import com.pdd.pop.ext.fasterxml.jackson.databind.JavaType;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonMappingException;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonNode;
import com.pdd.pop.ext.fasterxml.jackson.databind.SerializerProvider;
import com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.pdd.pop.ext.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * Special bogus "serializer" that will throw
 * {@link JsonMappingException} if its {@link #serialize}
 * gets invoked. Most commonly registered as handler for unknown types,
 * as well as for catching unintended usage (like trying to use null
 * as Map/Object key).
 */
@SuppressWarnings("serial")
public class FailingSerializer
    extends StdSerializer<Object>
{
    protected final String _msg;
    
    public FailingSerializer(String msg) {
        super(Object.class);
        _msg = msg;
    }
    
    @Override
    public void serialize(Object value, JsonGenerator g, SerializerProvider provider) throws IOException
    {
        provider.reportMappingProblem(_msg);
    }

    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint) throws JsonMappingException {
        return null;
    }
    
    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
    {
        ;
    }
}
