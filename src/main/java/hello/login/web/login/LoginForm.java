package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * packageName    : hello.login.web.login
 * fileName       : LoginForm
 * author         : Sora
 * date           : 2024-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-06        Sora       최초 생성
 */
@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
