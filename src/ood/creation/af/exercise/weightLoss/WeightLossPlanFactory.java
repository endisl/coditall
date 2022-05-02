package ood.creation.af.exercise.weightLoss;

import ood.creation.af.exercise.MealPlan;
import ood.creation.af.exercise.PlanFactory;
import ood.creation.af.exercise.WorkoutPlan;

public class WeightLossPlanFactory implements PlanFactory {
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMeal();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }
}
