package SquidGame.mainDB.repository.Query;

import SquidGame.mainDB.DTO.DalgonaRankDto;
import SquidGame.mainDB.DTO.QDalgonaRankDto;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

import static SquidGame.mainDB.entity.QDalgonaGame.*;

@Repository
@Transactional
public class DalgonaQuery {
    @Autowired
    EntityManager em;
    JPAQueryFactory queryFactory;

    public DalgonaQuery(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public List<DalgonaRankDto> findAllRank(){
        List<DalgonaRankDto> fetch = queryFactory
                .select(new QDalgonaRankDto(dalgonaGame.username,
                        dalgonaGame.score))
                .from(dalgonaGame)
                .orderBy(dalgonaGame.score.desc())
                .fetch();
        return fetch;
    }
}
