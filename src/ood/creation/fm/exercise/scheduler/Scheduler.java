package ood.creation.fm.exercise.scheduler;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = createCalendar();

    public void schedule(Event event) {
        Date today = new Date();
        calendar.addEvent(event, today);
    }

    protected Calendar createCalendar() {
        return new GregorianCalendar(); //default
    }
}
