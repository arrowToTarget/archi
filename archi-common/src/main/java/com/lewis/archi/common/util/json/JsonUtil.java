package com.lewis.archi.common.util.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by zhangminghua on 2016/8/27.
 */
public final class JsonUtil {

    private JsonUtil() {
    }

    private static final ThreadLocal<ObjectMapper> include_null_mapper = new ThreadLocal<ObjectMapper>();
    private static final ThreadLocal<ObjectMapper> not_include_null_mapper = new ThreadLocal<ObjectMapper>();

    private static ObjectMapper getObjectMapper(boolean serializeNull) {
        ThreadLocal<ObjectMapper> tl = serializeNull ? include_null_mapper : not_include_null_mapper;
        if (tl.get() == null) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
            if (!serializeNull) {
                objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
                objectMapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
            }
            tl.set(objectMapper);
        }
        return tl.get();
    }


    public static String toString(Object obj) {
        String retStr = null;
        ObjectMapper objectMapper = getObjectMapper(true);
        try {
            retStr = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return retStr;
    }

    public static <T> T toBean(String str, Class<T> clazzType) {
        T retT = null;
        ObjectMapper objectMapper = getObjectMapper(true);
        try {
            retT = objectMapper.readValue(str, clazzType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retT;
    }
}
