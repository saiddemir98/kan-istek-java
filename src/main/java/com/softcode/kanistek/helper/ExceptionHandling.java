package com.softcode.kanistek.helper;

import com.softcode.kanistek.base.BaseResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(value = DataIntegrityViolationException.class)
    public ResponseEntity<BaseResponse> runtimeException(DataIntegrityViolationException exception){
        ArrayList<String> messages = new ArrayList<>();
        messages.add("Bu kullanıcı zaten mevcut.");
        return BaseResponse.error( messages,400);
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<BaseResponse> runtimeException(RuntimeException exception){
        System.out.println(exception);
        return BaseResponse.error(null,400);
    }

    @ExceptionHandler(value = JpaSystemException.class)
    public ResponseEntity<BaseResponse> jpaSystemException(JpaSystemException e){
        System.out.println("Bu email sistemde zaten kayıtlı!");
        return BaseResponse.error(null,400);
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<BaseResponse> emailValidException(MethodArgumentNotValidException e){
        System.out.println("lütfen email giriniz");
        return BaseResponse.error(null,400);
    }



}
