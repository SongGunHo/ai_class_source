package eaam1;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringJUnitConfig(AppCtx.class)
public class Ex01 {
    @Autowired
    private DataSource ds;


    // 연결 테스트
    @Test
    void test1()throws Throwable{
        Connection con = ds.getConnection();
        System.out.println(con);
    }

}
