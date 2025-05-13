package org.koreait.configs;

import org.koreait.member.dao.MemberDAO;
import org.koreait.member.servlces.ServlceJoin;
import org.koreait.member.servlces.ServlceLoing;
import org.koreait.member.validator.JoinValidator;
import org.koreait.member.validator.LoginValidator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Import(DBConfig.class)
@Configuration
@ComponentScan("org.koreait.member")
public class AppCtx1 {
    @Bean
    public DateTimeFormatter date (){
        return DateTimeFormatter.ofPattern("yy, MM, dd HH:mm");
     }
//    @Bean
//    @Qualifier("dtf2")
//    public DateTimeFormatter date2 (){
//        return DateTimeFormatter.ofPattern            ("yy, MM, dd HH:mm");
//    }





}
