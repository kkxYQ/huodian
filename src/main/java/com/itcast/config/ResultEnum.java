package com.itcast.config;

public enum  ResultEnum {

    CODE_200(200, ""),
    CODE_400(400, "错误的请求参数"),
    CODE_401(401, "没有登录"),
    CODE_402(402, "用户名或密码错误"),
    CODE_403(403, "没有权限"),
    //CODE_404("404", "用户不存在"),
    CODE_405(405, "用户被冻结"),
    CODE_406(406, "信息重复"),
    CODE_500(500, "内部服务器错误");
    private Integer code;
    private String msg;

    ResultEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
