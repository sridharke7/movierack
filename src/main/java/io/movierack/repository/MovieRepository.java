package io.movierack.repository;

import io.movierack.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    public List<Movie> findByGenre(String genre);
    public List<Movie> findByTitle(String title);

    @Query("from Movie m where lower(m.title) LIKE %:title% order by title asc")
    public List<Movie> FindTitleWith(@Param("title") String title);

}
