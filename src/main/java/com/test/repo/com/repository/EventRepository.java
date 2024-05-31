
package com.test.repo.com.repository;

import com.test.repo.com.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findAllByOrderByDateAscTimeAsc();

    List<Event> findByCategory(String category);

    List<Event> findByDate(LocalDate date);

    @Query("SELECT e FROM Event e WHERE e.category = ?1 AND e.date >= ?2")
    List<Event> findByCategoryAndDate(String category, LocalDate date);

    @Query("SELECT e FROM Event e WHERE e.interest IN ?1")
    List<Event> findByInterests(List<String> interests);

    @Query("SELECT e FROM Event e WHERE e.category = ?1 AND e.date >= ?2 AND e.interest IN ?3")
    List<Event> findByCategoryAndDateAndInterests(String category, LocalDate date, List<String> interests);
}
