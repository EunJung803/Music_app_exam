package com.ll.exam.music_app.app.song.repository;

import com.ll.exam.music_app.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}