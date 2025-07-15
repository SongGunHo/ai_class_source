package org.koreait.gobel.advices;

import org.koreait.gobel.excetions.BadRequestException;
import org.koreait.gobel.rests.JsonError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "org.koreait")
public class CommonRestControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JsonError<Object>> ErrorHeader (Exception e){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        Object oj  = e.getMessage();
        if ( e instanceof BadRequestException badRequestException){
            oj = badRequestException.getMessage();
        }
        JsonError<Object> js  = new JsonError<>(status, oj);
        return ResponseEntity.status(status).body(js);

    }
}
