package com.example.GoBankers.Repo;

import java.util.List;

public class CustomResponse <T> {

    private String status;
    private Integer code;
    private String message;

    private Object object;

    private List<T> list;
    private T data;

    public CustomResponse(String status, Integer code, String errorMessage, T data, List<T> list, Object object) {
        this.status = status;
        this.code = code;
        this.message = errorMessage;
        this.data = data;
        this.list = list;
        this.object = object;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
