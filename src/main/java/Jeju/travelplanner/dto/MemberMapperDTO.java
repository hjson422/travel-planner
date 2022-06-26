package Jeju.travelplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberMapperDTO {

    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String nick_name;
    private String email;
    private String password;

    public MemberMapperDTO(String name, Integer age, String sex, String nick_name, String email, String password){
        this.name = name;
        this.age = age;
        this.sex =sex;
        this.nick_name = nick_name;
        this.email =email;
        this.password = password;
    }

}
