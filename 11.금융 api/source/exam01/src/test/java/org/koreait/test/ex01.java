package org.koreait.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.RequestJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class ex01 {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private ObjectMapper om;

    @Test
    void  test1()throws  Exception{
        RequestJoin rq = new RequestJoin();
        rq.setEmail("user01@test.org");
  //      rq.setName("사용자01");
//        rq.setPassword("1234");

        String json = om.writeValueAsString(rq);

        mvc.perform(post("/api/v1/member/join").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print());
    }

    @Test
    void test2() throws Exception {
        mvc.perform(post("api/v1/member/login")).andDo(print());
    }













}
