package ood.creation.fm.exercise;

import java.util.Date;

public class Scheduler {
    //private Calendar calendar = new Calendar();

    public void schedule(Event event) {
        Calendar calendar = createCalendar();
        Date today = new Date();
        calendar.addEvent(event, today);
    }

    protected Calendar createCalendar() {
        return new Calendar();
    }
}
