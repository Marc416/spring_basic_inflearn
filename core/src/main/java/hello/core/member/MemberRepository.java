package hello.core.member;

public interface MemberRepository {
    Member findById(Long memberId);
    void save(Member member);
}
