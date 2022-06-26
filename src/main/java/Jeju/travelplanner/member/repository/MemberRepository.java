package Jeju.travelplanner.member.repository;

import Jeju.travelplanner.dto.MemberMapperDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberRepository {

    void saveMember(MemberMapperDTO memberMapperDTO);

}
