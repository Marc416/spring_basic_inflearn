package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {
    private int rate = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {

            return price * rate / 100;
        }
        return 0;
    }
}
