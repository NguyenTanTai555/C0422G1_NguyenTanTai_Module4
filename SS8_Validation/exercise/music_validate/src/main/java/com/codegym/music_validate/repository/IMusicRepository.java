package com.codegym.music_validate.repository;

import com.codegym.music_validate.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMusicRepository extends JpaRepository<Music,Integer> {
}
