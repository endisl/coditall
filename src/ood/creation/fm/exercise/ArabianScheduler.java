package ood.creation.fm.exercise;

import ood.creation.fm.exercise.scheduler.Scheduler;

public class ArabianScheduler extends Scheduler {
    @Override
    protected ArabianCalendar createCalendar() {
        return new ArabianCalendar();
    }
}
