package Jeju.travelplanner.member.controller;

import Jeju.travelplanner.dto.MemberForm;
import Jeju.travelplanner.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<?> joinMember(@RequestBody MemberForm memberForm){


        memberService.join(memberForm);

        // 원래 Status 만들어야 하는데 귀찮아서...
        return ResponseEntity.ok("성공");
    }

}
