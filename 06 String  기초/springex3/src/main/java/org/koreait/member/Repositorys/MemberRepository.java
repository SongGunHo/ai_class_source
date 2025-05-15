package org.koreait.member.Repositorys;

import org.koreait.member.entiits.Member;
import org.springframework.data.repository.ListCrudRepository;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Member findByEmail(String email);
}
