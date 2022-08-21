package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    void createNewMusic(Music music);

    Music findById(int id);

    List<Music> list();

    void updateMusic(Music music);

    void deleteMusic(int id);
}
