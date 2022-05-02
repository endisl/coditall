package ood.creation.fm.exercise;

import ood.creation.fm.exercise.scheduler.Event;
import ood.creation.fm.exercise.scheduler.Scheduler;

public class Demo {
    public static void main(String[] args) {
        //standard scheduler using the gregorian calendar
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(new Event());

        //arabian scheduler using the arabian calendar
        Scheduler arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
