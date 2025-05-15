package org.koreait.member.entiits;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("MEMBER")
public class Member {

    @Id
    private Long seq;
    private String email;
    private String passwrod;
    private String name;
    private String mobile;
    @Column("regDt")
    private LocalDateTime regDt; // reg_Dt 인식
    @Column("modDt")
    private LocalDateTime modDt;
}
