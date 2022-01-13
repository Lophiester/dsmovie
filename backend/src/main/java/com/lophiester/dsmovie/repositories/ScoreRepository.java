package com.lophiester.dsmovie.repositories;

import com.lophiester.dsmovie.entities.Score;
import com.lophiester.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
