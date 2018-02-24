package com.the.rain.authority.core.common;


/**
 * @author zengfeiyue http result responseBean
 */
public class ResponseBean {

    private String code;
    private String message;
    private Object result;

    public ResponseBean(String code,String message,Object result){
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
