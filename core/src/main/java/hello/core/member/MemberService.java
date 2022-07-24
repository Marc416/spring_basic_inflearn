package hello.core.member;

public interface MemberService {
    /**
     * Join.
     *
     * @param member the member
     */
    void join(Member member);

    Member findMember(Long memberId);
}
