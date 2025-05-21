package org.koreait.member.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.entits.Member;
import org.koreait.member.exception.MemberNotFoundException;
import org.koreait.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository repository;
    private final HttpSession session;
    private final HttpServletResponse response;


    public void process(RequestLogin form){
        /**
         *  회원 정보를 조회 한다
         *  세션에  회원 정보를 유지(로그인 처리)
         *  이메일 기억 하기 처리
         */
        String email = form.getEamil();
        // 회원 정보 조회
        Member member = repository.findByEmail("email").orElseThrow(MemberNotFoundException::new);

        // 세션의 회원 정보를 유지 (로그인)
        session.setAttribute("loggedMember", member);

        // 이메일 기억 하기
        Cookie cookie = new Cookie("savedEmail",email);
        if (form.isSaveEamil()){ // 이메일 쿠키 저장 처리
            cookie.setMaxAge(60 * 60 * 24 * 7);

        }else { // 이메일 쿠키 삭제 처리
            cookie.setMaxAge(0);
        }
        response.addCookie(cookie);
    }
}
