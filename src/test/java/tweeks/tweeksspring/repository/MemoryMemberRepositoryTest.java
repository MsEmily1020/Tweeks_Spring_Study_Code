package tweeks.tweeksspring.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tweeks.tweeksspring.domain.Member;

class MemoryMemberRepositoryTest {
    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        Assertions.assertEquals(member, result);
    }
}