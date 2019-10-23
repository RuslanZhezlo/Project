package ruslan.zhezlo.worksstatistic.controller;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class LoginDto {
    private String login;
    private String password;
    private List<String> roles;
    private Boolean isActive;
    private Integer age;
}
