package org.koreait.member.servlces;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entiis.Member;
import org.koreait.member.validator.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServlceLoing {
    @NonNull
    private final MemberDao memberDAO;

    private LoginValidator validator;

    private DateTimeFormatter date = DateTimeFormatter.ofPattern("MM, dd");

    private Optional<MemberDao> opt;


    //@Qualifier("dtf2") // 한정자
    @Autowired(required = false)
    public void setFormatter(DateTimeFormatter formatter){
        System.out.println("setFormatter()");
        this.date = date;
    }


    public void process(RequestLogin form){
        validator.validate(form);
        MemberDao memberDAO1 = opt.orElse(null);
        if(memberDAO1 == null && date != null){
            return;
        }
        Member member = memberDAO

        System.out.println();
    }











}
