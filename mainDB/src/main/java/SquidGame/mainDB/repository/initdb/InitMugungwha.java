package SquidGame.mainDB.repository.initdb;

import SquidGame.mainDB.entity.DalgonaGame;
import SquidGame.mainDB.entity.MugungwhaGame;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

@Profile("local")
@Component
@RequiredArgsConstructor
public class InitMugungwha {
    private final InitMemberService initMemberService;

    @PostConstruct
    public void init(){
        initMemberService.init();
    }

    @Component
    static class InitMemberService{
        @PersistenceContext
        EntityManager em;

        @Transactional
        public void init(){
            DalgonaGame user1 = new DalgonaGame("김남협", 70);
            DalgonaGame user2 = new DalgonaGame("김주환", 92);
            DalgonaGame user3 = new DalgonaGame("김서정", 100);
            DalgonaGame user4 = new DalgonaGame("김수연", 88);
            DalgonaGame user5 = new DalgonaGame("허나연", 98);
            DalgonaGame user6 = new DalgonaGame("박수정", 92);
            DalgonaGame user7 = new DalgonaGame("유동헌", 87);
            DalgonaGame user8 = new DalgonaGame("조민호", 84);
            DalgonaGame user9 = new DalgonaGame("조민준", 90);
            DalgonaGame user10 = new DalgonaGame("윤혜정", 80);

            em.persist(user1);
            em.persist(user2);
            em.persist(user3);
            em.persist(user4);
            em.persist(user5);
            em.persist(user6);
            em.persist(user7);
            em.persist(user8);
            em.persist(user9);
            em.persist(user10);

            MugungwhaGame userMugungwha1 = new MugungwhaGame("김남협", 70);
            MugungwhaGame userMugungwha2 = new MugungwhaGame("김주환", 92);
            MugungwhaGame userMugungwha3 = new MugungwhaGame("김서정", 100);
            MugungwhaGame userMugungwha4 = new MugungwhaGame("김수연", 88);
            MugungwhaGame userMugungwha5 = new MugungwhaGame("허나연", 98);
            MugungwhaGame userMugungwha6 = new MugungwhaGame("박수정", 92);
            MugungwhaGame userMugungwha7 = new MugungwhaGame("유동헌", 87);
            MugungwhaGame userMugungwha8 = new MugungwhaGame("조민호", 84);
            MugungwhaGame userMugungwha9 = new MugungwhaGame("조민준", 90);
            MugungwhaGame userMugungwha10 = new MugungwhaGame("윤혜정", 80);

            em.persist(userMugungwha1);
            em.persist(userMugungwha2);
            em.persist(userMugungwha3);
            em.persist(userMugungwha4);
            em.persist(userMugungwha5);
            em.persist(userMugungwha6);
            em.persist(userMugungwha7);
            em.persist(userMugungwha8);
            em.persist(userMugungwha9);
            em.persist(userMugungwha10);
        }
    }
}
