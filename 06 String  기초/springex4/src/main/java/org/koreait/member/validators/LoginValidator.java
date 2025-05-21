package org.koreait.member.validators;

import lombok.RequiredArgsConstructor;
import org.koreait.member.entits.Member;
import org.koreait.member.repository.MemberRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberRepository repository;
    private final RequestValidator requestValidator;


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 이메일로 회원을 조회
         * 조회된 회원의 비밀 번호가 일치 하는 지 케크
         *
         *
          */
        if (errors.hasErrors()){
            return ;
        }
        RequestLogin form = (RequestLogin) target;
        String email = form.getEmail();
        //1. 이메일 회원이 조회되는지
        Member member= repository.findByEmail(email).orElse(null);
        Member member = repository.findByEmail(email).orElse(null);
        if (member == null) {
            errors.rejectValue("email", "NotFound");
        }

        // 2. 조회된 회원의 비밀번호가 일치하는지 체크
        if (member != null && !BCrypt.checkpw(password, member.getPassword())) {
            errors.reject("Invalid.login");


        }


    }

}
