package org.koreait.board.serviecs;

import java.util.List;
import java.util.stream.IntStream;

public class BoardinfoServices {
    public List<Board> getList(){
        List<Board> b = IntStream.rangeClosed(1, 10).mapToObj(i -> Board.builder()
                .seq(i)
                .subject("제목" + i)
                .build()).toList();

        return b;
    };
}
