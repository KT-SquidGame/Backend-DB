package SquidGame.mainDB.DTO;

import lombok.Data;

@Data
public class MemberLoginDto {
    private String username;
    private String password;

    public MemberLoginDto() {
    }

    public MemberLoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
