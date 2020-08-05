package com.ol.house.exception;

/**
 * @author gyh
 * @create 2020-08-05 17:21
 */
public class MyException extends RuntimeException{
    private Integer code;
    private String message;

    public MyException(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
