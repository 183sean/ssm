package com.zhisen.User.response;

public class Response<T> {

    private int res_code=1000002;
    private String msg="密码不能为空";
    private T data;

    public int getRes_code() {
        return res_code;
    }

    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response(T data) {
        this.data = data;
    }

    public Response() {
    }

    public Response(int res_code, String msg, T data) {
        this.res_code = res_code;
        this.msg = msg;
        this.data = data;
    }
}
