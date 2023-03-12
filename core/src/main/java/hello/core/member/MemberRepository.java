package hello.core.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
    //테스트 용도

}
