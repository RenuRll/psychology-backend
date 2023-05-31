package com.example.psychologybackend.utils;

import lombok.Data;
import org.apache.http.HttpStatus;

@Data
public class R {
    private String msg;
    private Integer code;
    private  Object data;


    public  static R ok(){
        R r = new R();
        r.code = HttpStatus.SC_OK;
        r.msg = "success";
        return r;
    }

    public static R ok(String msg){
        R r = new R();
        r.code = HttpStatus.SC_OK;
        r.msg = msg;
        return r;
    }

    public static R ok(Object data){
        R r = new R();
        r.code = HttpStatus.SC_OK;
        r.msg = "sucess";
        r.data = data;
        return r;
    }

    public static R error(int code,String msg){
        R r = new R();
       r.code =code;
       r.msg = msg;
        return  r;

    }

    public static R error(String msg){
        // 固定的状态吗500
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,msg);
    }

    public static R error(){
        // 固定的状态吗500
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,"未知异常，请联系管理员");
    }






}
