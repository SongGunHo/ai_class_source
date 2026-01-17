package eaam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.Repositorys.MemberRepository;
import org.koreait.member.entiits.Member;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@SpringJUnitConfig(AppCtx.class)
public class Ex03 {
    private MemberRepository repository;


    @Test
    @DisplayName("새로운 엔티티를 추가 ")
    void test1(){
        Member member= new Member();
        member.setEmail("user01@text.org");
        member.setPasswrod("1245678");
        member.setName("사용자97");
        member.setMobile("0101112222");
        member.setRegDt(LocalDateTime.now());

        //repository.save(member);
        System.out.println(member);
    }

    @Test
    @DisplayName("회원을 1명 조회하고 수정 ")
    void test2(){
        Member member = repository.findById(8L).orElse(null);
        System.out.println(member);
        member.setName("(수정)사용자96");
         repository.save(member);
    }

    @Test
    @DisplayName("회원 목록 조회")
    void test3(){
        List<Member> itmes = repository.findAll();

    }
    @Test

    void test4(){
        Optional<Member> member  = repository.findByEmail("user01@text.org");
        System.out.println(member);
    }


    @Test
    void test5(){
        LocalDateTime sdate = LocalDateTime.now().toLocalDate().atStartOfDay();
        LocalDateTime edate = LocalDateTime.of(LocalDate.now(), LocalTime.of(59,59));

        List<Member> items  = repository.findByRegDtBetweenOrderByRegDtDEsc(sdate, edate);
        items.forEach(System.out::println);
    }
  @Test
    void test6(){
      LocalDateTime sdate = LocalDateTime.now().toLocalDate().atStartOfDay();
      LocalDateTime edate = LocalDateTime.of(LocalDate.now(), LocalTime.of(59,59));


      List<Member> items  = repository.findByRegDtBetweenAndNanmecontainingOrderByRegDtDEsc(sdate, edate, "사용자");
      items.forEach(System.out::println);
  }
  @Test
    void test7(){
      LocalDateTime sdate = LocalDateTime.now().toLocalDate().atStartOfDay();
      LocalDateTime edate = LocalDateTime.of(LocalDate.now(), LocalTime.of(59,59));

      List<Member> items = repository.getMembers(sdate,edate,"%사용자 %");
      items.forEach(System.out::println);
  }



}
