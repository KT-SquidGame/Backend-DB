package SquidGame.mainDB.DTO;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class MugungwhaRankDTO {
    private String username;
    public int score;

    @QueryProjection
    public MugungwhaRankDTO(String username, int score) {
        this.username = username;
        this.score = score;
    }
}
