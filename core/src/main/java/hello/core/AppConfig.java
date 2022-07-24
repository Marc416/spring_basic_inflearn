package hello.core;

import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepositoryImpl;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    public OrderService orderService() {
        return new OrderServiceImpl(new MemberRepositoryImpl(), new RateDiscountPolicy());
    }

    public MemberService memberService() {
        return new MemberServiceImpl(new MemberRepositoryImpl());
    }
}
