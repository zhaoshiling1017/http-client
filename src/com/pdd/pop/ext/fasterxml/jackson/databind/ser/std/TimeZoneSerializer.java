package com.pdd.pop.ext.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.util.TimeZone;

import com.pdd.pop.ext.fasterxml.jackson.core.*;
import com.pdd.pop.ext.fasterxml.jackson.core.type.WritableTypeId;
import com.pdd.pop.ext.fasterxml.jackson.databind.SerializerProvider;
import com.pdd.pop.ext.fasterxml.jackson.databind.jsontype.TypeSerializer;

@SuppressWarnings("serial")
public class TimeZoneSerializer extends StdScalarSerializer<TimeZone>
{
    public TimeZoneSerializer() { super(TimeZone.class); }

    @Override
    public void serialize(TimeZone value, JsonGenerator g, SerializerProvider provider) throws IOException {
        g.writeString(value.getID());
    }

    @Override
    public void serializeWithType(TimeZone value, JsonGenerator g,
            SerializerProvider provider, TypeSerializer typeSer) throws IOException
    {
        // Better ensure we don't use specific sub-classes:
        WritableTypeId typeIdDef = typeSer.writeTypePrefix(g,
                typeSer.typeId(value, TimeZone.class, JsonToken.VALUE_STRING));
        serialize(value, g, provider);
        typeSer.writeTypeSuffix(g, typeIdDef);
    }
}
