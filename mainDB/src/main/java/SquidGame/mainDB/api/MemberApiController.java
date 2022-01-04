package SquidGame.mainDB.api;

import SquidGame.mainDB.DTO.MemberLoginDto;
import SquidGame.mainDB.entity.Member;
import SquidGame.mainDB.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class MemberApiController {

    private final MemberService memberService;

    /**
     * 회원 기본키 조회
     */
    @PostMapping("/api/members/login")
    public Long memberLogin(@RequestBody @Valid MemberLoginDto memberLoginDto){
        Long id = memberService.memberLogin(memberLoginDto);
        if(id == null){
            return null;
        }
        return id;
    }

    /**
     * 회원 전문
     */
    @PostMapping("/api/members")
    public createMemberResponse saveMember(@RequestBody @Valid createMemberResponse request){
        Member member = new Member();
        member.setUsername(request.username);
        member.setPassword(request.password);
        Long id = memberService.join(member);
        return new createMemberResponse(id, request.username, request.password);
    }

    @Data
    @AllArgsConstructor
    static class createMemberResponse {
        private Long id;
        private String username;
        private String password;

        public createMemberResponse() {
        }
    }
}
