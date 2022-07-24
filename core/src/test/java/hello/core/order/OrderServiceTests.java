package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.Test;

public class OrderServiceTests {
    @Test
    void createOrder() {
        // Arrange
        Long memberId = 1L;
        String name = "joonhee";
        Grade grade = Grade.VIP;
        int itemPrice = 10000;

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(memberId, name, grade);
        memberService.join(member);

        // Action
        Order order = orderService.createOrder(memberId, name, itemPrice);

        int discountPrice = order.calculatePrice();
        // Assertion
        assertThat(discountPrice).isEqualTo(order.calculatePrice());
    }
}
