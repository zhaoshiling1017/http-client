package com.pdd.pop.ext.fasterxml.jackson.databind.jsonFormatVisitors;

import com.pdd.pop.ext.fasterxml.jackson.databind.JavaType;
import com.pdd.pop.ext.fasterxml.jackson.databind.JsonMappingException;

/**
 * Interface {@link com.pdd.pop.ext.fasterxml.jackson.databind.JsonSerializer} implements
 * to allow for visiting type hierarchy.
 */
public interface JsonFormatVisitable
{
    /**
     * Get the representation of the schema to which this serializer will conform.
     * 
     * @param typeHint Type of element (entity like property) being visited
     */
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper visitor, JavaType typeHint)
        throws JsonMappingException;
}
