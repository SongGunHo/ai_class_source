package com.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Adderss {

    @Column(length = 10)
    private String zonecode;
    @Column(length = 100)
    private String adderss;
    @Column(length = 100)
    private String addrssSub;












}
