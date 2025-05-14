package org.koreait.member.dao;

import org.koreait.configs.ManualBean;
import org.koreait.member.entiis.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@ManualBean
@Repository
public class MemberDao {
    private Map<String , Member> members = new HashMap<>();




//    public void register(Member member) {
//        members.put( member);
//    }
//    public Member get(String email){
//        return members.get(email);
//    }
//    public List<Member> getlist(){
//        return new ArrayList<>(members.values());
//
//
//
//    }
}
