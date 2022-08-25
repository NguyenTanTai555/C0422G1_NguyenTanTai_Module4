package com.codegym.music_validate.service;

import com.codegym.music_validate.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMusicService {
    Page<Music> findAll(Pageable pageable);

    void save(Music music);

    Music findById(int id);
}
