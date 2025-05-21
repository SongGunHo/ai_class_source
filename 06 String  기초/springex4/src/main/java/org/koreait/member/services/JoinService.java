//package org.koreait.member.services;
//
//import lombok.RequiredArgsConstructor;
//import org.koreait.member.entits.Member;
//import org.koreait.member.repository.MemberRepository;
//import org.mindrot.jbcrypt.BCrypt;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//@RequiredArgsConstructor
//public class JoinService {
//    private final MemberRepository repository;
//
//    public void process(RequestJoin form){
//        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));
//        Member member = new Member();
//        member.setEmail(form.getEmail);
//        member.setPassword(form.getPassword);
//        member.setName(form.getName);
//        member.setMoble(form.getMoble);
//        member.setRegDt(LocalDateTime.now());
//
//        repository.save(member);
//    }
//
//}
