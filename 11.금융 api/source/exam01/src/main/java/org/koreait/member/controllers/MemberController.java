package org.koreait.member.controllers;

import jakarta.validation.Valid;
import org.koreait.gobel.excetions.BadRequestException;
import org.koreait.gobel.rests.JsonError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/member")
public class MemberController {
//    @PostMapping("join")
//    public ResponseEntity<Object> join(@RequestBody @Valid RequestJoin form, Errors errors){
//        if(errors.hasErrors()){
//            List<String> li   = errors.getFieldErrors().stream().map(e-> e.getDefaultMessage()).toList();
//            return ResponseEntity.badRequest().body(errors);
//        }
//
//        return ResponseEntity.noContent().build();
//    }


//    @PostMapping("/join")
//    public ResponseEntity<Object> join(@RequestBody @Valid RequestJoin form, Errors errors){
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("header1", "value1");
//        headers.add("header2", "value2");
//        ResponseEntity<Object> en  = new ResponseEntity<>(HttpStatus.NO_CONTENT);
//
//        if(errors.hasErrors()){
//            List<String> errorsmessge =errors.getFieldErrors().stream().map(e -> e.getDefaultMessage()).toList();
//            en = new ResponseEntity<>(errorsmessge, HttpStatus.BAD_REQUEST);
//        }
//        System.out.println(form);
//        return en;
//    }


@PostMapping("join1")
@RequestMapping("api/v1/member")
public ResponseEntity<Object> join3(@RequestBody @Valid RequestJoin form, Errors errors){
    if(errors.hasErrors()){
        List<String> li   = errors.getFieldErrors().stream().map(e-> e.getDefaultMessage()).toList();
        return ResponseEntity.badRequest().body(errors);
    }

    return ResponseEntity.noContent().build();
}
    @PostMapping("login")
    public void login(){
        boolean result = false;
        if(!result){
            throw new IllegalArgumentException("잘못된 요청");
        }
    }

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
    @PatchMapping("join3")
    @RequestMapping("api/v1/member")
    public ResponseEntity<Object> join4(@RequestBody @Valid RequestJoin foro, Errors errors){
        if(errors.hasErrors()){
            List<String> li   = errors.getFieldErrors().stream().map(e-> e.getDefaultMessage()).toList();
            return ResponseEntity.badRequest().body(errors);
        }

        return ResponseEntity.noContent().build();
    }










}
