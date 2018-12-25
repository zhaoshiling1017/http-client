package com.pdd.pop.ext.fasterxml.jackson.databind.ser.std;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

import com.pdd.pop.ext.fasterxml.jackson.core.JsonGenerator;
import com.pdd.pop.ext.fasterxml.jackson.databind.JavaType;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonMappingException;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonNode;
import com.pdd.pop.ext.fasterxml.jackson.databind.SerializerProvider;
import com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

/**
 * For now, File objects get serialized by just outputting
 * absolute (but not canonical) name as String value
 */
@SuppressWarnings("serial")
public class FileSerializer
    extends StdScalarSerializer<File>
{
    public FileSerializer() { super(File.class); }

    @Override
    public void serialize(File value, JsonGenerator g, SerializerProvider provider) throws IOException {
        g.writeString(value.getAbsolutePath());
    }

    @Override
    public JsonNode getSchema(SerializerProvider provider, Type typeHint) {
        return createSchemaNode("string", true);
    }
    
    @Override
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
        throws JsonMappingException
    {
        visitStringFormat(visitor, typeHint);
    }
}