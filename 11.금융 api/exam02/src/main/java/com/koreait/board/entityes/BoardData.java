package com.koreait.board.entityes;

import com.koreait.global.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "boardData")
//@Table(indexes =@Index(name = "subjcet, ") )
public class BoardData  extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(unique = false)
    private String subject;
    @Column(nullable = false, length = 100)
    @Lob
    private String content;
    @Column(nullable = false, length = 10)
    private String post;












}
