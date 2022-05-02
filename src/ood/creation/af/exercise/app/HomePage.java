package ood.creation.af.exercise.app;

import ood.creation.af.exercise.PlanFactory;

public class HomePage {
    public void setGoal(PlanFactory factory) {
        factory.createMealPlan().render();
        factory.createWorkoutPlan().render();
    }
}
