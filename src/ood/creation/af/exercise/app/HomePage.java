package ood.creation.af.exercise.app;

import ood.creation.af.exercise.PlanFactory;

public class HomePage {
    public void setGoal(PlanFactory planFactory) {
        planFactory.createMealPlan().print();
        planFactory.createWorkoutPlan().print();
    }
}
