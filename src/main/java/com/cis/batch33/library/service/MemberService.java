package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Member;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MemberService {

    private Map<Long, Member> memberMap = new HashMap<>();

    public Member createMember(Member member){
        // Call the database or perform any necessary operations
        Long memberId = new Random().nextLong();
        member.setMemberId(memberId);
        memberMap.put(memberId, member);
        return member;
    }

    public Member getMember(Long memberId) {
        // Retrieve member from the map (simulating database access)
        return memberMap.get(memberId);
    }

    public Member updateMember(Long memberId, Member member) {
        // Update member in the map (simulating database access)
        memberMap.put(memberId, member);
        return member;
    }

    public void deleteMember(Long memberId) {
        // Delete member from the map (simulating database access)
        memberMap.remove(memberId);
    }
}
