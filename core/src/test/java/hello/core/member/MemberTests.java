package hello.core.member;

import hello.core.AppConfig;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MemberTests {
    @Test
    void join() {
        // Arrange
        Member member = new Member(1L, "joonhee", Grade.VIP);

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        // Action
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // Assertion : assertion은 assertjs 를 쓰도록 한다. -> assertThat 과 같은 좋은 기능들이 많이 있음
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }
}
