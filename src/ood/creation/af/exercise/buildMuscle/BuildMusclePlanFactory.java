package ood.creation.af.exercise.buildMuscle;

import ood.creation.af.exercise.MealPlan;
import ood.creation.af.exercise.PlanFactory;
import ood.creation.af.exercise.WorkoutPlan;

public class BuildMusclePlanFactory implements PlanFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMeal();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }
}
