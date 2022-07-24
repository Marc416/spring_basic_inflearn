package hello.core;

import hello.core.member.*;

public class MemberApp {

    public static void main(String[] args) {
        Member member = new Member(1L, "joonhee", Grade.VIP);
        MemberService memberService = new MemberServiceImpl();
        memberService.join(member);

        System.out.println(member.getName());
        System.out.println(memberService.findMember(1L).getName());
    }
}
