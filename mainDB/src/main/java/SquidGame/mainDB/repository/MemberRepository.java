package SquidGame.mainDB.repository;

import SquidGame.mainDB.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
