package SquidGame.mainDB.api;

import SquidGame.mainDB.DTO.DalgonaRankDto;
import SquidGame.mainDB.DTO.MugungwhaRankDTO;
import SquidGame.mainDB.entity.DalgonaGame;
import SquidGame.mainDB.repository.Query.DalgonaQuery;
import SquidGame.mainDB.service.DalgonaService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class DalgonaApiController {
    private final DalgonaService dalgonaService;
    private final DalgonaQuery dalgonaQuery;
    /**
     *  달고나 점수 저장 호출
     */
    @PostMapping("/api/Dalgona")
    public createDalgonaResponse saveDalgonaGame(@RequestBody @Valid createDalgonaResponse request){
        DalgonaGame dalgonaGame = new DalgonaGame();
        dalgonaGame.setScore(request.score);
        dalgonaGame.setUsername(request.username);
        Long id = dalgonaService.join(dalgonaGame);
        return new createDalgonaResponse(id, request.username, request.score);
    }

    /**
     * 달고나 랭크 쿼리 반환
     */
    @GetMapping("/api/readRankDalgona")
    public List<DalgonaRankDto> readDalgonaRank(){
        List<DalgonaRankDto> allRank = dalgonaQuery.findAllRank();
        return allRank;
    }

    @Data
    static class createDalgonaResponse{
        private Long id;
        private String username;
        private int score;

        public createDalgonaResponse() {
        }

        public createDalgonaResponse(Long id, String username, int score) {
            this.id = id;
            this.username = username;
            this.score = score;
        }
    }
}
