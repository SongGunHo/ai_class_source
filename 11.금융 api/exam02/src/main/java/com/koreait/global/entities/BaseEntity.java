package com.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass // 공통 속성 으로 사용될 상위 클래스 임 을 알려 주 는 에노테이션
@EntityListeners(AuditingEntityListener.class) // 상입 수정 삭제 조회등 잗업을 하때 전후에 작업을 하기 위해 이벤트 처리 위한 어노테이션
public abstract class BaseEntity { // 공통적 으로 사용 예정
    @CreationTimestamp // insert 시간 자동 저장
    @Column(updatable = false) // 생성일자는 최초 1번만 등록
    private LocalDateTime createAt;
    //@UpdateTimestamp  // update 시 시간 자동 저장
    @LastModifiedDate // 자동으로 현재 날짜와 시간을 정하는 에노테이션
    @Column(insertable = false) // 수정일자는 최초 등록
    private LocalDateTime modifiedAt;
}
