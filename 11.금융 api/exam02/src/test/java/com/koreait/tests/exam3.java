package com.koreait.tests;

import com.koreait.member.entities.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional

public class exam3 {
    @PersistenceContext
    private EntityManager manager;


    @Test
    void test() throws  Exception{
        Member member = new Member();

        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreateAt(LocalDateTime.now());

        manager.persist(member);
        manager.flush();
        // 최초 추가시
        member = manager.find(Member.class, 1L);
        System.out.printf("createAt%s, modifiedAt:%s%n", member.getCreateAt(), member.getModifiedAt());

        Thread.sleep(50000);

        member.setName("(수정)사용자01");
        member.setCreateAt(LocalDateTime.now());
        manager.flush();
        manager.clear();




        // 수정 후
        member = manager.find(Member.class, 1L);
        System.out.printf("createAt%s, modifiedAt:%s%n", member.getCreateAt(), member.getModifiedAt());

    }






}
