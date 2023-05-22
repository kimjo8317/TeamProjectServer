package com.team.project.repository;

import com.team.project.model.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleOrContent(String title,String content);
    /*title,content이용 검색*/
    Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

}
