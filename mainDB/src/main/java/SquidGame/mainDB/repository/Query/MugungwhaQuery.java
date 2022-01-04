package SquidGame.mainDB.repository.Query;

import SquidGame.mainDB.DTO.MugungwhaRankDTO;
import SquidGame.mainDB.DTO.QMugungwhaRankDTO;
import SquidGame.mainDB.api.MugungwhaApiController;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

import static SquidGame.mainDB.entity.QMugungwhaGame.*;

@Repository
@Transactional
public class MugungwhaQuery {
    @Autowired
    EntityManager em;
    JPAQueryFactory queryFactory;

    public MugungwhaQuery(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    public List<MugungwhaRankDTO> findAllRank(){
        return queryFactory
                .select(new QMugungwhaRankDTO(mugungwhaGame.username,mugungwhaGame.score))
                .from(mugungwhaGame)
                .orderBy(mugungwhaGame.score.desc())
                .fetch();
    }
}
