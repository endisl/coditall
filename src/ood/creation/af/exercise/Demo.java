package ood.creation.af.exercise;

import ood.creation.af.exercise.app.HomePage;
import ood.creation.af.exercise.buildMuscle.BuildMusclePlanFactory;
import ood.creation.af.exercise.strengthTraining.StrengthTrainingPlanFactory;
import ood.creation.af.exercise.weightLoss.WeightLossPlanFactory;

public class Demo {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        page.setGoal(new BuildMusclePlanFactory());
        System.out.println();
        page.setGoal(new WeightLossPlanFactory());
        System.out.println();
        page.setGoal(new StrengthTrainingPlanFactory());
    }
}
