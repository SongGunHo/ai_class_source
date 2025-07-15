package com.koreait.member.entities;

import com.koreait.global.entities.Adderss;
import com.koreait.global.entities.BaseEntity;
import com.koreait.member.constants.Authority;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
//@Table(name = "kit-member", indexes = {
//        @Index(name="idx_member_created_at", columnList = "createdAt DESC"),
//        @Index(name="uq_member_email_name", columnList = "email, name", unique = true)
//})
public class Member extends BaseEntity { // baseentity 공통 상수를 공유
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long  seq;

    @Id
    //@GeneratedValue(strategy = GenerationType.UUID) // 자동 증감
    private Long seq;
    @Column(unique = true, nullable = false,length = 80)
    private String email;
    @Column(name = "pa", nullable = false, length = 65)
    private String password;
    @Column(nullable = false, length = 45)
    private String name;
    @Lob //  CLOB 매핑 대량에 데이터 베이스 문자열 을 정할 데 사용
    private String introduction;
    @Enumerated(EnumType.STRING) //  열거형 상수 사용 하는 에노테이션 EnumType.String문자열로 기록
    private Authority authority;

    @Enumerated
    private Adderss adderss;


    @Transient //엔티티 로 관리 되는 필드 x  엔티티 클래스 내부 에서 만 사용할 목적
    private String profileImage;
    //@Temporal(TemporalType.DATE) // localData 동일 하다 고 생각을 하면 된다
    //private LocalDateTime modifiedAt;




}
