package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.internal.SuppressSignatureCheck;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    void vipO() {
        // Arrange
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        // Action
        int discount = discountPolicy.discount(member, 10000);

        // Assertion
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    void vipX() {
        // Arrange
        Member member = new Member(1L, "memberVIP", Grade.BASIC);
        // Action
        int discount = discountPolicy.discount(member, 10000);

        // Assertion
        assertThat(discount).isEqualTo(0);
    }
}