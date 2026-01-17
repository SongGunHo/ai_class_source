package com.koreait.board.entityes;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class BoardView {
    @EmbeddedId
    private BoardViewId viewId;
}
