package com.softcode.kanistek.base;

import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

@Data
public class BaseResponse<T> {
    private boolean isSuccess;
    private ArrayList<String> messages;
    private T data;

    public static <T> ResponseEntity<BaseResponse<T>> ok(T data,Integer statusCode){
        BaseResponse<T> response = new BaseResponse<>();
        response.setSuccess(true);
        response.setMessages(null);
        response.setData(data);
        return ResponseEntity.status(statusCode).body(response);
    }
    public static <T> ResponseEntity<BaseResponse<T>> ok(T data){
        BaseResponse<T> response = new BaseResponse<>();
        response.setSuccess(true);
        response.setMessages(null);
        response.setData(data);
        return ResponseEntity.ok(response);
    }
    public static ResponseEntity<BaseResponse> error(ArrayList<String> messages,Integer statusCode){
        BaseResponse response = new BaseResponse<>();
        response.setSuccess(false);
        response.setMessages(messages);
        return ResponseEntity.status(statusCode).body(response);
    }
}
