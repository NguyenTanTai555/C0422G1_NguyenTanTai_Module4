package com.codegym.service.impl;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository iMusicRepository;
    @Override
    public void createNewMusic(Music music) {
        this.iMusicRepository.createNewMusic(music);
    }

    @Override
    public Music findById(int id) {
        return this.iMusicRepository.findById(id);
    }

    @Override
    public List<Music> list() {
        return this.iMusicRepository.list();
    }

    @Override
    public void updateMusic(Music music) {
        this.iMusicRepository.updateMusic(music);
    }

    @Override
    public void deleteMusic(int id) {
        this.iMusicRepository.deleteMusic(id);
    }
}
