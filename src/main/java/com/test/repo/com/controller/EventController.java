package com.test.repo.com.controller;

import com.test.repo.com.model.Event;
import com.test.repo.com.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/category/{category}")
    public List<Event> getEventsByCategory(@PathVariable String category) {
        return eventService.getEventsByCategory(category);
    }

    @GetMapping("/date/{date}")
    public List<Event> getEventsByDate(@PathVariable LocalDate date) {
        return eventService.getEventsByDate(date);
    }

    @GetMapping("/category/{category}/date/{date}")
    public List<Event> getEventsByCategoryAndDate(@PathVariable String category, @PathVariable LocalDate date) {
        return eventService.getEventsByCategoryAndDate(category, date);
    }

    @GetMapping("/interests")
    public List<Event> getEventsByInterests(@RequestParam List<String> interests) {
        return eventService.getEventsByInterests(interests);
    }

    @GetMapping("/category/{category}/date-range")
    public List<Event> getEventsByCategoryAndDateRange(@PathVariable String category, @RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return eventService.getEventsByCategoryAndDateRange(category, startDate, endDate);
    }

    @GetMapping("/category/{category}/date-range/interests")
    public List<Event> getEventsByCategoryAndDateRangeAndInterests(@PathVariable String category, @RequestParam LocalDate startDate, @RequestParam LocalDate endDate, @RequestParam List<String> interests) {
        return eventService.getEventsByCategoryAndDateRangeAndInterests(category, startDate, endDate, interests);
    }
}