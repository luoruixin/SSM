package com.luoxiaohei.exception;

//自定义系统异常
public class SystemException extends RuntimeException{
    private Integer code;//异常编号

//    public SystemException(Integer code) {
//        this.code = code;
//    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message ) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

//    public SystemException(Throwable cause, Integer code) {
//        super(cause);
//        this.code = code;
//    }
//
//    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
//        super(message, cause, enableSuppression, writableStackTrace);
//        this.code = code;
//    }
}
