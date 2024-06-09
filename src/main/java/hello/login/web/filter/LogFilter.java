package hello.login.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

/**
 * packageName    : hello.login.web.filter
 * fileName       : LogFilter
 * author         : Sora
 * date           : 2024-06-09
 * description    : Servlet filter를 사용한 공통 관심사 처리
 *                  만들고 WebConfig에 스프링 빈으로 등록해야함.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-09        Sora       최초 생성
 */
@Slf4j
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("log filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("log filter doFilter");

        HttpServletRequest httpRequest = (HttpServletRequest)request;
        String requestURI = httpRequest.getRequestURI();

        String uuid = UUID.randomUUID().toString(); // 각 요청을 구분하기 위해 uuid 남김

        try{
            log.info("REQUEST [{}][{}]", uuid, requestURI);
            chain.doFilter(request, response);  // 다음 필터가 있으면 필터를 호출하고, 필터가 없으면 서블릿을 호출한다 -> 이 로직이 없으면 다음 단계 진행X
        } catch(Exception e){
            throw  e;
        }finally{
            log.info("RESPONSE [{}][{}]", uuid, requestURI);
        }
    }

    @Override
    public void destroy() {
        log.info("log filter destroy");
    }
}
