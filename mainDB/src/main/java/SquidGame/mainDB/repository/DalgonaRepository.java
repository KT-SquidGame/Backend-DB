package SquidGame.mainDB.repository;

import SquidGame.mainDB.entity.DalgonaGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DalgonaRepository extends JpaRepository<DalgonaGame, Long> {
}
