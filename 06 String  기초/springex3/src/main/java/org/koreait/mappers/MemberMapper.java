package org.koreait.mappers;

import org.koreait.member.entiits.Member;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface MemberMapper {

    @Bean
    List<Member> getList();
}
