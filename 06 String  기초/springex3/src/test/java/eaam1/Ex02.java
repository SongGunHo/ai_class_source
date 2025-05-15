//package eaam1;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.koreait.global.configs.AppCtx;
//import org.koreait.member.entiits.Member;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementCreator;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Transactional
//@SpringJUnitConfig(AppCtx.class)
//public class Ex02 {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Test
//    void test1(){
//         String sql ="INSERT INTO MEMBER (email ,password , name , mobile) "+
//                 "VALUES(?,?,?,?)";
//         int affectedRows = jdbcTemplate.update(sql, "user01@test.org", "1234", "사용자01", "01010001000");
//        System.out.println(affectedRows);
//    }
//
//    @Test
//    @DisplayName("회원 정보")
//    void text2(){
//        String sql = "SELECT * FROM MEMBER WHERE LIKE ?";
//        List<Member> items = jdbcTemplate.query(sql, new RowMapper<Member>() {
//            @Override
//            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Member member = new Member();
//                member.setSeq(rs.getLong("seq"));
//                member.setEmail(rs.getString("email"));
//                member.setPasswrod(rs.getString("password"));
//                member.setName(rs.getString("na,e"));
//                member.setMobile(rs.getString("mobile"));
//                member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());
//
//                return member;
//            }
//        });
//        items.forEach(System.out::println);
//    }
//    @Test
//    @DisplayName("회원 1명 조회")
//    void test3() {
//        String sql = "SELECT * FROM MEMBER WHERE email = ?";
//        Member item = jdbcTemplate.queryForObject(sql, this::mapper, "%user91@test.org%"); {
//        }
//        System.out.println(item);
//    }
//    @Test
//    @DisplayName("회원1명의 이름 조회 ")
//    void test4(){
//        String sql = "SELECT name FROM MEMBER WHERE email=?  ";
//        String name = jdbcTemplate.query(sql,String.class , "user01@test.org" );
//    }
//    @Test
//    void test5(){
//        long total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MEMBER", long.class);
//        System.out.println(total);
//    }
//
//
//
//
//
//
//    private Member mapper(ResultSet rs, int i) throws SQLException {
//        Member member = new Member();
//        member.setSeq(rs.getLong("seq"));
//        member.setEmail(rs.getString("email"));
//        member.setPasswrod(rs.getString("password"));
//        member.setName(rs.getString("name"));
//        member.setMobile(rs.getString("mobile"));
//        member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());
//
//        return member;
//    }
//
//    @Test
//    @DisplayName("회원이 주가 되면 회원 번호 (증감 번호 )를 가져 오는 방법 ")
//    void test6(){
//
//        String sql = "INSERT INTO MEMBER (email, password , name , mobile + VALUES(?,?,?,?)";
//        KeyHolder keyHolder =new GeneratedKeyHolder();
//        int affectedRows = jdbcTemplate.update(c ->{
//            PreparedStatement pstmt = c.prepareStatement
//                    (sql, new String[] {"sql"});
//            pstmt.setString(1, "user99@test.org");
//            pstmt.setString(2,"1234");
//            pstmt.setString(3, "사용자99");
//            pstmt.setString(4, "010100010000");
//
//            return pstmt;
//        },keyHolder);
//
//       Number key=  keyHolder.getKey();
//       long seq = key.longValue();
//        System.out.println(seq);
//
//    }
//
//}
