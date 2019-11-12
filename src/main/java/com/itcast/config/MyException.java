package com.itcast.config;

import lombok.Data;

@Data
public class MyException extends RuntimeException {
    private String errorCode;
    private String msg;
}
