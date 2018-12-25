package com.pdd.pop.sdk.common.util;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonInclude;
import com.pdd.pop.ext.fasterxml.jackson.core.JsonFactory;
import com.pdd.pop.ext.fasterxml.jackson.core.JsonGenerator;
import com.pdd.pop.ext.fasterxml.jackson.core.JsonParser;
import com.pdd.pop.ext.fasterxml.jackson.core.type.TypeReference;
import com.pdd.pop.ext.fasterxml.jackson.databind.DeserializationFeature;
import com.pdd.pop.ext.fasterxml.jackson.databind.ObjectMapper;
import com.pdd.pop.ext.fasterxml.jackson.databind.SerializationFeature;
import com.pdd.pop.ext.fasterxml.jackson.databind.module.SimpleModule;
import com.pdd.pop.sdk.common.exception.JsonParseException;

import java.io.IOException;
import java.io.StringWriter;

public class JsonUtil {

    private static JsonFactory jsonFactory = new JsonFactory();
    private static ObjectMapper defaultObjectMapper = createObjectMapper();

    /**
     * 创建一个自定义的JSON ObjectMapper
     */
    public static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        objectMapper.registerModule(module);

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

        return objectMapper;
    }

    /**
     * 将对象转换为JSON字符串
     */
    public static <T> String transferToJson(T value) throws JsonParseException{
        StringWriter sw = new StringWriter();
        JsonGenerator gen = null;
        try {
            gen = jsonFactory.createGenerator(sw);
            defaultObjectMapper.writeValue(gen, value);
            return sw.toString();
        } catch (IOException e) {
            throw new JsonParseException();
        } finally {
            if (gen != null) {
                try {
                    gen.close();
                } catch (IOException e) {
                }
                
            }
        }
    }

    /**
     * 将JSON字符串转换为指定对象
     */
    public static <T> T transferToObj(String jsonString, Class<T> valueType) throws JsonParseException{
        T value = null;
        if(jsonString == null || jsonString.length() == 0) {return value;}
        try {
            value = defaultObjectMapper.readValue(jsonString, valueType);
        } catch (IOException e) {
            throw new JsonParseException();
        }
        return value;
    }

    /**
     * 将JSON字符串转换为指定对象
     */
    public static <T> T transferToObj(String jsonString, TypeReference typeReference) {
        if(jsonString == null || jsonString.length() == 0 || typeReference == null) {
            throw new JsonParseException();
        }

        try {
            return defaultObjectMapper.readValue(jsonString, typeReference);
        } catch (IOException e){
            throw new JsonParseException();
        }

    }

}
