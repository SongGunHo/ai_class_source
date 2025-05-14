package org.koreait.member.servlces;

import org.koreait.member.RequestJoin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entiis.Member;
import org.koreait.member.validator.JoinValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServlceJoin {
    private JoinValidator vaildator;
    private MemberDao memberDAO;

    @Autowired
    public void setVaildator(JoinValidator vaildator ){
        this.vaildator = vaildator;
    }
    public void setMemberDAO(MemberDao memberDAO){
        this.memberDAO =memberDAO;
    }
    @Autowired
    public void process(RequestJoin form ){
        vaildator.validate(form);
        Member member = new Member();
        member.
    }
}
