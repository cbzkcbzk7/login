package hello.login.domain.login;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName    : hello.login.domain.login
 * fileName       : LoginService
 * author         : Sora
 * date           : 2024-06-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-06        Sora       최초 생성
 */
@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository memberRepository;

    /**
     * @return null이면 로그인 실패
     */
    public Member login(String loginId, String password){
//        Optional<Member> byLoginIdOptional = memberRepository.findByLogin(loginId);
//        Member member = byLoginIdOptional.get();
//        if(member.getPassword().equals(password)){
//            return member;
//        } else {
//            return null;
//        }

       return memberRepository.findByLogin(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
