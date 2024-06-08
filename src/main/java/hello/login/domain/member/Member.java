package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : hello.login.domain.member
 * fileName       : Member
 * author         : Sora
 * date           : 2024-06-06
 * description    : 회원가입
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-06        Sora       최초 생성
 */
@Data
public class Member {

    private Long id;
    @NotEmpty
    private String loginId; // 로그인 ID
    @NotEmpty
    private String name; // 사용자 이름
    @NotEmpty
    private String password;
}
