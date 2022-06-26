package Jeju.travelplanner.dto;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberForm {
    @NotBlank
    private String name;
    @NotBlank
    private String sex;
    @NotBlank
    private Integer age;
    @NotBlank
    private String nickName;
    @NotBlank
    private String email;
    @NotBlank
    private String password;

    public MemberMapperDTO convertToMemberMapperDTO(){
        MemberMapperDTO memberMapperDTO = new MemberMapperDTO();
        memberMapperDTO.setName(this.name);
        memberMapperDTO.setAge(this.age);
        memberMapperDTO.setSex(this.sex);
        memberMapperDTO.setNick_name(this.nickName);
        memberMapperDTO.setEmail(this.email);
        memberMapperDTO.setPassword(this.password);
        return memberMapperDTO;
    }

}
