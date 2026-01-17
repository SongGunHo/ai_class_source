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
public class em1 {

    @PersistenceContext// 변화 감지 메모리
    private EntityManager manager;

//    @BeforeEach
//    void init(){
//        manager.getTransaction().begin();
//    }
//    @AfterEach
//    void  after(){
//        manager.getTransaction().commit();
//    }
    @Test
    void test(){
        Member member= new Member();
       // member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreateAt(LocalDateTime.now());

        manager.persist(member); // 영속으로

        manager.flush();// 변화 상태를 db에 영구 반영
        member.setName("(수정) 사용자01 ");
        manager.flush();
        manager.remove(member);
        manager.flush();

    }
    @Test
    void test1(){
        Member member= new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("사용자01");
        member.setCreateAt(LocalDateTime.now());


        manager.persist(member); // 영속으로

        manager.flush();// 변화 상태를 db에 영구 반영
        //manager.detach(member);// 영속성 분리 x 변화 감지 x
        manager.merge(member); //  분리된 영속성 상태 -> 다시 영속 상태변경
        member.setName("(수정) 사용자01 ");


    }

}
