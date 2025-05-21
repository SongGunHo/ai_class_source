package org.koreait.member.repository;

import org.koreait.member.entits.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {

    boolean existsByEmail(String email);
    Optional<Member> findByEmail(String Email);
}

