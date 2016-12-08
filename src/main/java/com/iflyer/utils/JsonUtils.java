package com.iflyer.utils;

import org.codehaus.jackson.map.ObjectMapper;


public class JsonUtils {

    /**
     * 将json转化为实体POJO
     *
     * @param jsonStr
     * @param obj
     * @return
     */
    public static <T> Object JSONToObj(String jsonStr, Class<T> obj) {
        T t = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            t = objectMapper.readValue(jsonStr, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
