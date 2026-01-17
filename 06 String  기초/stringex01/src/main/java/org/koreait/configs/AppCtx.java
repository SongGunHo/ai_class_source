package org.koreait.configs;

import org.koreait.configs.person.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx { // 객체 설정 클래스

    @Bean // 관리 받고 있는 객체
    public Greeter greeter(){
        return new Greeter();
    }
}
