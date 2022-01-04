package SquidGame.mainDB.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class DalgonaGame {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private int score;

    @OneToMany(mappedBy = "dalgonaGame")
    private List<Member> members = new ArrayList<>();

    public DalgonaGame() {
    }

    public DalgonaGame(String username, int score) {
        this.username = username;
        this.score = score;

    }
}
