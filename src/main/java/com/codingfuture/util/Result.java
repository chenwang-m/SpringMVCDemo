package com.codingfuture.util;

import lombok.Getter;

@Getter
public class Result {
    private int code;
    private String message;
    private Object data;
    private static final int CODE_SUCCESS = 200;
    private static final int CODE_ERROR = 500;
    private static final String MESSAGE_SUCCESS = "OK";
    private static final String MESSAGE_ERROR = "ERROR";

    public static Result ok() {
        Result result = new Result();
        result.code = CODE_SUCCESS;
        result.message = MESSAGE_SUCCESS;
        return result;
    }
    public static Result ok(Object data){
        Result result = Result.ok();
        result.data = data;
        return result;
    }
}
