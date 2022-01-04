package SquidGame.mainDB.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mugungwha_id")
    private MugungwhaGame mugungwhaGame;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dalgona_id")
    private DalgonaGame dalgonaGame;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "charm_id")
    private CharmGame charmGame;

    public Member() {

    }

    public Member(String username, String password, DalgonaGame game) {
        this.username = username;
        this.password = password;
        if (game != null){
            addDalgonaGame(game);
        }
    }

    private void addDalgonaGame(DalgonaGame game) {
        this.dalgonaGame = dalgonaGame;
        dalgonaGame.getMembers().add(this);
    }

}
