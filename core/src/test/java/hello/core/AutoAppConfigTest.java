package hello.core;

import hello.core.AutoAppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import
        org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.assertj.core.api.Assertions.*;
public class AutoAppConfigTest {
    @Test
    void basicScan() {
        ApplicationContext ac = new
                AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);

        /*
        *
        *
         @ComponentScan 은 @Component 가 붙은 모든 클래스를 스프링 빈으로 등록
        이때 스프링 빈의 기본 이름은 클래스명을 사용하되 맨 앞글자만 소문자 사용
        빈 이름 기본 전략: MemberServiceImpl 클래스 memberServiceImpl
        빈 이름 직접 지정: @Component("memberService2") 이런식으로 이름을 부여하면 된다
        *

        @Component : 컴포넌트 스캔에서 사용
        @Controlller : 스프링 MVC 컨트롤러에서 사용
        @Service : 스프링 비즈니스 로직에서 사용
        @Repository : 스프링 데이터 접근 계층에서 사용
        @Configuration : 스프링 설정 정보에서 사용
        * */
    }
}