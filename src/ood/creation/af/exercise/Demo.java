package ood.creation.af.exercise;

import ood.creation.af.exercise.app.HomePage;
import ood.creation.af.exercise.buildMuscle.BuildMusclePlanFactory;

public class Demo {
    public static void main(String[] args) {
        HomePage page = new HomePage();
        page.setGoal(new BuildMusclePlanFactory());
    }
}
