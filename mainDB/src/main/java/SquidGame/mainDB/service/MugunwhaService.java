package SquidGame.mainDB.service;

import SquidGame.mainDB.DTO.MemberLoginDto;
import SquidGame.mainDB.entity.Member;
import SquidGame.mainDB.entity.MugungwhaGame;
import SquidGame.mainDB.repository.MemberRepository;
import SquidGame.mainDB.repository.MugungwhaRepository;
import SquidGame.mainDB.repository.Query.MemberQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MugunwhaService {
    private final MugungwhaRepository mugungwhaRepository;

    public Long saveMugungwhaGame(MugungwhaGame mugungwhaGame){
        mugungwhaRepository.save(mugungwhaGame);
        return mugungwhaGame.getId();
    }
}
