package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTests {
    MemberService memberService;
    OrderService orderService;

    // BeforeEach 는 테스트가 실행될 때마다 초기 설정을 위해 실행됨
    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        // Arrange
        Long memberId = 1L;
        String name = "joonhee";
        Grade grade = Grade.VIP;
        int itemPrice = 10000;

        Member member = new Member(memberId, name, grade);
        memberService.join(member);

        // Action
        Order order = orderService.createOrder(memberId, name, itemPrice);

        int discountPrice = order.calculatePrice();
        // Assertion
        assertThat(discountPrice).isEqualTo(order.calculatePrice());
    }
}
