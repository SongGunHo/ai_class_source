package org.koreait.member.controllers.text;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.entits.Member;
import org.koreait.member.repository.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test4")
@RequiredArgsConstructor
public class Test4Controller {
    private final HttpSession session;
    private final MemberRepository repository;

    @GetMapping("/ex01")
    @ResponseBody
    public void exam01(){
        Member member = repository.findByEmail("user02@test.org").orElse(null);
        session.setAttribute("member", member);
    }
    @GetMapping("/ex02")
    public void exam02(){
        Member member = (Member) session.getAttribute("member");
        System.out.println(member);
    }


}
