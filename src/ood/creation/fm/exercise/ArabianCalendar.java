package ood.creation.fm.exercise;

import ood.creation.fm.exercise.scheduler.Calendar;
import ood.creation.fm.exercise.scheduler.Event;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Adding an event to the Arabian calendar");
    }
}
