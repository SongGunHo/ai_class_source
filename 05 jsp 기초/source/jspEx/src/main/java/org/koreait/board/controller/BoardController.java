package org.koreait.board.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.board.serviecs.Board;
import org.koreait.board.serviecs.BoardinfoServices;

import java.io.IOException;
import java.util.List;
@WebServlet("/board/list")
public class BoardController extends HttpServlet { // 컨트롤러
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardinfoServices service = new BoardinfoServices();
        List<Board> items = service.getList(); // 모델
        req.setAttribute("items", items);

        // 뷰 (view) 직접 접근을 못하도록 / WEB-INF  하위 구성을 한다 
        RequestDispatcher re = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp");
        re.forward(req, resp);
    }
}
