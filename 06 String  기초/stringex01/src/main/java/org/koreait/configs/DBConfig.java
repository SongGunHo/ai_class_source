package org.koreait.configs;

import org.koreait.configs.person.Greeter;
import org.koreait.member.dao.sub.MemberDao;
import org.springframework.context.annotation.Bean;

public class DBConfig {
    @Bean
    public MemberDao memberDao(){
        System.out.println("수동 빈 확인");
        return new MemberDao();

    }
    @Bean
    public Greeter dataSource(){
        return new Greeter();
    }
}
