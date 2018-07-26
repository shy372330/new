package com.itdreamworks.datamanage.util;

/**
 * 相应结果生成工具
 * @author doudou
 */
public class ResultGenerator {

    public static Result genSuccessResult() {
        return new Result().setResultCode(ResultCode.SUCCESS);
    }

    public static Result genSuccessResult(String msg) {
        return new Result().setResultCode(ResultCode.SUCCESS).setMsg(msg);
    }

    public static <T> Result<T> genSuccessResult(T data) {
        return new Result().setResultCode(ResultCode.SUCCESS).setData(data);
    }

    public static <T> Result<T> genSuccessResult(String msg,T data) {
        return new Result().setResultCode(ResultCode.SUCCESS).setMsg(msg).setData(data);
    }

    public static <T> Result<T> genSuccessResult(ResultCode resultCode, String msg,T data) {
        return new Result().setResultCode(resultCode).setMsg(msg).setData(data);
    }

    public static <T> Result<T> genSuccessResult(int code,String msg,T data) {
        return new Result().setResultCode(code,msg).setData(data);
    }

    public static Result genFailResult() {
        return new Result().setResultCode(ResultCode.FAIL);
    }

    public static Result genFailResult(String msg) {
        return new Result().setResultCode(ResultCode.FAIL).setMsg(msg);
    }

    public static <T> Result<T> genFailResult(String msg,T data) {
        return new Result().setResultCode(ResultCode.FAIL).setMsg(msg).setData(data);
    }
    public static <T> Result<T> genFailResult(ResultCode resultCode) {
        return new Result().setResultCode(resultCode);
    }
    public static <T> Result<T> genFailResult(ResultCode resultCode, String msg) {
        return new Result().setResultCode(resultCode).setMsg(msg);
    }

    public static <T> Result<T> genFailResult(ResultCode resultCode, String msg,T data) {
        return new Result().setResultCode(resultCode).setMsg(msg).setData(data);
    }

    public static <T> Result<T> genFailResult(int code,String msg,T data) {
        return new Result().setResultCode(code,msg).setData(data);
    }
    public static <T> Result<T> genFailResult(int code,String msg) {
        return new Result().setResultCode(code,msg);
    }

}
