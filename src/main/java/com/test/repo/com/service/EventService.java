package com.test.repo.com.service;

import com.test.repo.com.model.Event;
import com.test.repo.com.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAllByOrderByDateAscTimeAsc();
    }

    public List<Event> getEventsByCategory(String category) {
        return eventRepository.findByCategory(category);
    }

    public List<Event> getEventsByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    public List<Event> getEventsByCategoryAndDate(String category, LocalDate date) {
        return eventRepository.findByCategoryAndDate(category, date);
    }

    public List<Event> getEventsByInterests(List<String> interests) {
        return eventRepository.findByInterests(interests);
    }

    public List<Event> getEventsByCategoryAndDateRange(String category, LocalDate startDate, LocalDate endDate) {
        return eventRepository.findByCategoryAndDateRange(category, startDate, endDate);
    }

    public List<Event> getEventsByCategoryAndDateRangeAndInterests(String category, LocalDate startDate, LocalDate endDate, List<String> interests) {
        return eventRepository.findByCategoryAndDateRangeAndInterests(category, startDate, endDate, interests);
    }
}