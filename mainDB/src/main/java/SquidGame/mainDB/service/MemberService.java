package SquidGame.mainDB.service;

import SquidGame.mainDB.DTO.MemberLoginDto;
import SquidGame.mainDB.entity.Member;
import SquidGame.mainDB.repository.MemberRepository;
import SquidGame.mainDB.repository.Query.MemberQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberQuery memberQuery;
    public Long join(Member member){
        memberRepository.save(member);
        return member.getId();
    }

    public Long memberLogin(MemberLoginDto memberLoginDto){
        Long memberId = memberQuery.findMemberId(memberLoginDto);
        return memberId;
    }
}
