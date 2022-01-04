package SquidGame.mainDB.repository;

import SquidGame.mainDB.entity.MugungwhaGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MugungwhaRepository extends JpaRepository<MugungwhaGame, Long> {
}
