package SquidGame.mainDB.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MugungwhaGame {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private int score;

    @OneToMany(mappedBy = "mugungwhaGame")
    private List<Member> members = new ArrayList<>();

    public MugungwhaGame() {
    }

    public MugungwhaGame(String username, int score) {
        this.username = username;
        this.score = score;
    }

    public MugungwhaGame(Long id, int score, List<Member> members) {
        this.score = score;
        this.members = members;
    }
}

