package com.ontop.webapi.webapiontop.exception;


import java.io.Serializable;
import java.util.Date;
public class ExceptionResponse implements Serializable {

    private  Date timestamp;
    private Integer code;
    private String message;

    private String details;



    public ExceptionResponse (Date timestamp, Integer code, String message, String details){
        super();

        this.timestamp = timestamp;
        this.code = code;
        this.message = message;
        this.details = details;

    }



    public Date getTimestamp() {
        return timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }



}
