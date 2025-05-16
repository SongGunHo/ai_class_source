package org.koreait.global.configs;

import org.koreait.global.member.controllers.MemberController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class ControllerConfig {

    @Bean
    public MemberController memberController(){
        return new MemberController();
    }









}
