package SquidGame.mainDB.service;

import SquidGame.mainDB.entity.DalgonaGame;
import SquidGame.mainDB.repository.DalgonaRepository;
import SquidGame.mainDB.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class DalgonaService {
    private final DalgonaRepository dalgonaRepository;

    public Long join(DalgonaGame dalgonaGame){
        dalgonaRepository.save(dalgonaGame);
        return dalgonaGame.getId();
    }
}
