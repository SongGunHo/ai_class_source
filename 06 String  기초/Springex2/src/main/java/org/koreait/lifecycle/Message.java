package org.koreait.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

public class Message implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() 호출 되었다");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy()  확인 ");
    }
    @Bean
    public void send(String name){
        System.out.printf("%s님에게 메세지 전송 %n ", name);



    }
}
