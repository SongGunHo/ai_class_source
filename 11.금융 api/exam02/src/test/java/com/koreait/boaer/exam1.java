package com.koreait.boaer;

import com.koreait.board.entityes.BoardData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
public class exam1 {

    @PersistenceContext
    private EntityManager manager;


    @Test
    void test(){
        BoardData b = new BoardData();

        b.setSeq(1L);
        b.setSubject("작성자01");
        b.setContent("내용1");
        b.setPost("임시");
        b.setCreateAt(LocalDateTime.now());
        b.setModifiedAt(LocalDateTime.now());

        manager.persist(b);
        manager.flush();
    }





}
