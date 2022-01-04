package SquidGame.mainDB.DTO;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;

@Data
public class DalgonaRankDto {
    private String username;
    public int score;

    @QueryProjection
    public DalgonaRankDto(String username, int score) {
        this.username = username;
        this.score = score;

    }
}
