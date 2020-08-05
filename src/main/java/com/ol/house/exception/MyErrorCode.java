package com.ol.house.exception;

/**
 * @author gyh
 * @create 2020-08-05 17:26
 */
public enum MyErrorCode implements IMyErrorCode{
    SYSTEM_ERROR(500,"服务器冒烟了，请稍后再试");
    private Integer code;
    private String message;

    MyErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }

}
