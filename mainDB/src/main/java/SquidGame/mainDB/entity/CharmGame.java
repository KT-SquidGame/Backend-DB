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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CharmGame {
    @Id @GeneratedValue
    private Long id;
    private int score;

    @OneToMany(mappedBy = "charmGame")
    private List<Member> members = new ArrayList();
}
