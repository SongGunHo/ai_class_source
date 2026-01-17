package com.koreait.board.entityes;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Embeddable
public class BoardViewId {

    @Id
    private Long seq;
    @Id
    private int uId;











}
