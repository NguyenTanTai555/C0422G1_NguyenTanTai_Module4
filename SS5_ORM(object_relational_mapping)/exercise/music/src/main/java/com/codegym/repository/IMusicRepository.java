package com.codegym.repository;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    void createNewMusic(Music music);

    Music findById(int id);

    List<Music> list();

    void updateMusic(Music music);

    void deleteMusic(int id);
}
