package SquidGame.mainDB.api;

import SquidGame.mainDB.DTO.MugungwhaRankDTO;
import SquidGame.mainDB.DTO.MugungwhaPointDto;
import SquidGame.mainDB.entity.MugungwhaGame;
import SquidGame.mainDB.repository.Query.MugungwhaQuery;
import SquidGame.mainDB.service.MugunwhaService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class MugungwhaApiController {
    private final MugunwhaService mugunwhaService;
    private final MugungwhaQuery mugungwhaQuery;
    /**
     * 무궁화 점수 저장 호출
     */
    @PostMapping("/api/saveMugungwhaPoint")
    public MugungwhaPointDto mugungwhaPointSave(@RequestBody @Valid MugungwhaPointDto request){
        MugungwhaGame mugungwhaGame = new MugungwhaGame();
        mugungwhaGame.setScore(request.getScore());
        mugungwhaGame.setUsername(request.getUsername());
        Long id = mugunwhaService.saveMugungwhaGame(mugungwhaGame);
        return new MugungwhaPointDto(id,request.score, request.getUsername());
    }

    /**
     * 무궁화 랭크 쿼리 반환
     */
    @GetMapping("/api/readRankMugungwha")
    public List<SquidGame.mainDB.DTO.MugungwhaRankDTO> readRankMugungwha(){
        List<SquidGame.mainDB.DTO.MugungwhaRankDTO> allRank = mugungwhaQuery.findAllRank();
        return allRank;
    }

    @Data
    static class MugungwhaRankDTO{
        private Long id;
        private String username;
        private int score;

        public MugungwhaRankDTO(Long id, String username, int score) {
            this.id = id;
            this.username = username;
            this.score = score;
        }
    }
}
