package com.koreait.board.entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(BoardViewId2.class)
public class BoardView2 {
}
