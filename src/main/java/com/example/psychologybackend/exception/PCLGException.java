package com.example.psychologybackend.exception;

import lombok.Data;
import org.apache.http.HttpStatus;

@Data
public class PCLGException extends RuntimeException{
    private int code = HttpStatus.SC_INTERNAL_SERVER_ERROR;
    private String msg;

    public PCLGException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public PCLGException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }



    public PCLGException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    public PCLGException( int code,String msg ,Throwable e) {
        super(msg,e);
        this.code = code;
        this.msg = msg;
    }


}
