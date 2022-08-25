package com.codegym.music_validate.service.impl;

import com.codegym.music_validate.model.Music;
import com.codegym.music_validate.repository.IMusicRepository;
import com.codegym.music_validate.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service
public class MusicService implements IMusicService {

    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public Page<Music> findAll(Pageable pageable) {
        return this.musicRepository.findAll(pageable);
    }

    @Override
    public void save(Music music) {
        this.musicRepository.save(music);
    }

    @Override
    public Music findById(int id) {
        return this.musicRepository.findById(id).orElse(null);
    }
}
