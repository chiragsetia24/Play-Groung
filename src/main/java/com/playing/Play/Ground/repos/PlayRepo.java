package com.playing.Play.Ground.repos;

import com.playing.Play.Ground.Entity.Play;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRepo extends JpaRepository<Play, Long> {
}
