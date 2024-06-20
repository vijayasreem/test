
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

    @Query("SELECT e FROM Event e WHERE e.category = :category AND e.date = :date")
    List<Event> findByCategoryAndDate(String category, LocalDate date);

    @Query("SELECT e FROM Event e WHERE e.interest IN :interests")
    List<Event> findByInterests(List<String> interests);

    @Query("SELECT e FROM Event e WHERE e.category = :category AND e.date >= :startDate AND e.date <= :endDate")
    List<Event> findByCategoryAndDateRange(String category, LocalDate startDate, LocalDate endDate);

    @Query("SELECT e FROM Event e WHERE e.category = :category AND e.date >= :startDate AND e.date <= :endDate AND e.interest IN :interests")
    List<Event> findByCategoryAndDateRangeAndInterests(String category, LocalDate startDate, LocalDate endDate, List<String> interests);
}
