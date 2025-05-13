package org.koreait.member.dao;

import org.koreait.member.entiis.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberDAO {
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
