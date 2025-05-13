package org.koreait.board.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class board {
    private long seq;
    private String subject;
}
