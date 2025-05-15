package org.koreait.member.Repositorys;

import org.koreait.member.entiits.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
   Optional <Member> findByEmail(String email);
   List<Member> findByRegDtBetweenOrderByRegDtDEsc(LocalDateTime sdte , LocalDateTime edate);
    List<Member> findByRegDtBetweenAndNanmecontainingOrderByRegDtDEsc(LocalDateTime sdte , LocalDateTime edate , String keyword);

    @Query("SELECT *FROM MEMBER WHERE regDt BETWEEN : sDate AND : eDate AND name LIKE : key ORDER BY regDt DESC")
    List<Member> getMembers(@Param("sDate") LocalDateTime sdate , @Param("eDate") LocalDateTime edate , @Param("key") String keyword);


}
