package Jeju.travelplanner.member.service;

import Jeju.travelplanner.dto.MemberForm;
import Jeju.travelplanner.dto.MemberMapperDTO;
import Jeju.travelplanner.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public void join(MemberForm memberForm){
        MemberMapperDTO memberMapperDTO = memberForm.convertToMemberMapperDTO();
        memberRepository.saveMember(memberMapperDTO);
    }

}
