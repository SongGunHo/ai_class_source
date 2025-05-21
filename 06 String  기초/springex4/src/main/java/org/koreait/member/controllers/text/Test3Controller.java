package org.koreait.member.controllers.text;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test3")
@RequiredArgsConstructor // 의존성 주입
public class Test3Controller {

    private final HttpServletResponse response; //
    private final HttpServletRequest request;// 기본 생성자

    @ResponseBody // json 로 변환
    @GetMapping("/sub1/ex01")
    public void exam01(){
        Cookie cookie = new Cookie("key1", "value1");
        response.addCookie(cookie);

    }
    @ResponseBody // json 로 변환
    @GetMapping("/sub2/ex02")
    public void exam02(){
        Cookie cookie = new Cookie("key2", "value2");
        response.addCookie(cookie);
    }

    @GetMapping("/sub3/ex03")
    @ResponseBody
    public void exam03(@CookieValue(name = "key3", required = false) String value){
        System.out.printf("key3:%s%n", value);
        // /spring/text3
//        Cookie cookie = new Cookie("key3", "value3");
//        cookie.setPath(request.getContextPath()+ "/text3");
//        response.addCookie(cookie);

    }

    @GetMapping("/sub3/ex01")
    @ResponseBody
    public void exam04(){
        // /spring/text3
        Cookie cookie = new Cookie("key4", "value4");
        //cookie.setPath(request.getContextPath()+ "/text3");
        //cookie.setMaxAge(604800); // 일주일 초단위
        //cookie.setMaxAge(60 * 60 * 24 * 7); // 쿠기의 만료 시간 7일
        //cookie.setHttpOnly(true); // 자바 스크립트에서는 조회 불가능
        //cookie.setMaxAge(0);//  쿠키의 만료 시간1970.1.1 쿠기 삭제
        //response.addCookie(cookie);
        Cookie [] cookies = request.getCookies();
        for (Cookie cookie1 : cookies){
            System.out.printf("name:%s, value:%s%n", cookie1.getName(),cookie1.getValue());
        }
    }



}
