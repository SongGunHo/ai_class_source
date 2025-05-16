package eaam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.global.configs.AppCtx;
import org.koreait.member.Repositorys.MemberRepository;
import org.koreait.member.entiits.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.awt.print.Pageable;
import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringJUnitConfig(AppCtx.class)
public class ex04 {

    private MemberRepository repository;

    @Test
    @DisplayName("날짜 조회")
    void test1(){
        LocalDateTime sdate = LocalDateTime.now().minusWeeks(1L);
        LocalDateTime edate = LocalDateTime.now();

        Pageable pageable = (Pageable) PageRequest.of(0, 2, Sort.by(desc("regDt"), asc("email")));
        Pageable<Member> date = repository.findByRegDtBetween(edate, sdate, pageable);


        List<Member> items = date.get
        long total = date.getTotalElememts();
        int totalPage  = date.getTotalPage();
        items.forEach(System.out::println);
        System.out.println("total:%d , totalPage: %d%n", totalPage, total);
    }
}
