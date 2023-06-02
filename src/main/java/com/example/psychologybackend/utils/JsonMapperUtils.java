package com.example.psychologybackend.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
public class JsonMapperUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static TypeReference<Map<String,Object>>  mapTypeReference = new TypeReference<Map<String, Object>>() {
    };


    public static <T>String obj2JsonString(T obj){
        if (obj == null){
            return  null;
        }
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.warn("obj2JsonString error:{}",e.getMessage());
            return  null;
        }

    }

    public static  <T> T jsonString2Obj(String jsonString,Class<T> cls){
        try {
             return objectMapper.readValue(jsonString, cls);
        } catch (JsonProcessingException e) {
            log.warn("jsonString2Obj error:{}",e.getMessage());
            return null;
        }
    }


    public static Map<String,Object> jsonString2Map(String jsonString){
        try {
            return objectMapper.readValue(jsonString,mapTypeReference);
        } catch (JsonProcessingException e) {
            log.warn("jsonString2Map error:{}",e.getMessage());
            return null;
        }
    }




}
