package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private MemberRepository memberRepository = new MemberRepositoryImpl();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


}
