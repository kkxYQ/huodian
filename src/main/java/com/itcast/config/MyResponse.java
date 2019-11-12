package com.itcast.config;

import com.itcast.parent.ResultTitle;
import lombok.Data;

@Data
public class MyResponse<T>  {
    private String code;
    private String msg;
    private String error;
    private T data;

    public MyResponse(T data) {
        this.code = "200";
        this.msg = "获取成功";
        this.error = "";
        this.data = data;
    }

    public MyResponse(String code, String msg, String error, T data) {
        this.code = code;
        this.msg = msg;
        this.error = error;
        this.data = data;
    }

}
