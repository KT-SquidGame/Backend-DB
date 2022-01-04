package SquidGame.mainDB.DTO;

import lombok.Data;

@Data
public class MugungwhaPointDto {
    private Long id;
    public int score;
    private String username;

    public MugungwhaPointDto() {
    }

    public MugungwhaPointDto(Long id, int score, String username) {
        this.id = id;
        this.score = score;
        this.username = username;
    }
}
