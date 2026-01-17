package com.koreait.tests;

import com.koreait.member.entities.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
@SpringBootTest
@ActiveProfiles({"default", "test"})
public class exam02 {

    @PersistenceContext
    private EntityManager manager;

    @BeforeEach
    void  init(){
        Member member = new Member();
       // member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreateAt(LocalDateTime.now());

        manager.persist(member);
        manager.flush();
    }

    @Test
    void test(){
        Member member = manager.find(Member.class, 1L);
        System.out.println(member);

        Member member1= manager.find(Member.class, 1L);
        System.out.println(member1);
    }






}
