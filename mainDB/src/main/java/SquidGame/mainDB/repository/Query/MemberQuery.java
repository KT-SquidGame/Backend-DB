package SquidGame.mainDB.repository.Query;

import SquidGame.mainDB.DTO.MemberLoginDto;
import SquidGame.mainDB.entity.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class MemberQuery {
    @Autowired
    EntityManager em;
    JPAQueryFactory jpaQueryFactory;

    public MemberQuery(EntityManager em) {
        this.em = em;
        this.jpaQueryFactory = new JPAQueryFactory(em);
    }

    public Long findMemberId(MemberLoginDto memberLoginDto) {
        QMember mem = new QMember("M");
        Long id = jpaQueryFactory
                .select(mem.id)
                .from(mem)
                .where(mem.username.eq(memberLoginDto.getUsername()),
                        mem.password.eq(memberLoginDto.getPassword())
                ).fetchOne();
        return id;
    }
}
