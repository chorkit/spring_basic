package hello.hello_spring.repository;


import hello.hello_spring.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRopository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequnce = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequnce);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()  //stream이 뭐지?
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return List.of();
    }
}
