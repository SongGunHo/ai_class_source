package org.koreait.configs;

import org.koreait.lifecycle.Message;
import org.koreait.lifecycle.Message2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // 설정
public class AppCtx {
    @Bean
    public Message message(){
        return new Message();
    }
    @Scope("prototype")// 조회할때 마다 객채를 새로 생성
    @Bean(initMethod = "init", destroyMethod = "close")// 관리 객체 어노테이션
    public Message2 message2(){
        return new Message2();
    }

}
