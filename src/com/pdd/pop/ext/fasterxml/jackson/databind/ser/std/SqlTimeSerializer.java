package com.pdd.pop.ext.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;

import com.pdd.pop.ext.fasterxml.jackson.core.JsonGenerator;
import com.pdd.pop.ext.fasterxml.jackson.databind.*;
import com.pdd.pop.ext.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

@JacksonStdImpl
@SuppressWarnings("serial")
public class SqlTimeSerializer
    extends StdScalarSerializer<java.sql.Time>
{
    public SqlTimeSerializer() { super(java.sql.Time.class); }

    @Override
    public void serialize(java.sql.Time value, JsonGenerator g, SerializerProvider provider) throws IOException
    {
        g.writeString(value.toString());
    }

    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
        return createSchemaNode("string", true);
    }
    
    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
        throws JsonMappingException
    {
        visitStringFormat(visitor, typeHint, JsonValueFormat.DATE_TIME);
    }
}