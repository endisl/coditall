package ood.creation.af.exercise.strengthTraining;

import ood.creation.af.exercise.MealPlan;
import ood.creation.af.exercise.PlanFactory;
import ood.creation.af.exercise.WorkoutPlan;

public class StrengthTrainingPlanFactory implements PlanFactory {
    @Override
    public MealPlan createMealPlan() {
        return new StrengthTrainingMeal();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new StrengthTrainingWorkout();
    }
}
