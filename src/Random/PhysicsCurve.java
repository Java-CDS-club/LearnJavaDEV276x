package Random;

import java.util.Scanner;

public class PhysicsCurve {
    public static void main(String[] args){
        calculatePhysicsCurved();

    }
    public static void calculatePhysicsCurved(){
        System.out.println("This program calculates the curved score of a raw score.");
        Scanner input = new Scanner(System.in);
        System.out.print("Are you in 'AP' or 'Regular' Physics? > ");
        String physicsClass = input.nextLine();
        if (physicsClass.equals("Regular")){
            int rawScoreARangeMax = 100;
            int rawScoreARangeMin = 65;
            int rawScoreBRangeMax = 64;
            int rawScoreBRangeMin = 48;
            int rawScoreCRangeMax = 47;
            int rawScoreCRangeMin = 33;
            int rawScoreDRangeMax = 32;
            int rawScoreDRangeMin = 18;
            int rawScoreFRangeMax = 17;
            int rawScoreFRangeMin = 0;
            System.out.print("What is the MCQ out of? > ");
            double MCQTotal = input.nextDouble();
            System.out.print("What is your MCQ score? > ");
            double MCQScore = input.nextDouble();
            System.out.print("What is the FRQ out of? > ");
            double FRQTotal = input.nextDouble();
            System.out.print("What is your FRQ score? > ");
            double FRQScore = input.nextDouble();
            double weightedMCQ = 100*0.5*(MCQScore / MCQTotal);
            double weightedFRQ = 100*0.5*(FRQScore / FRQTotal);
            double weightedTotal = (weightedMCQ + weightedFRQ);
            if (rawScoreARangeMin <= weightedTotal && weightedTotal <= rawScoreARangeMax){
                //location ratio finds the position of the weightedTotal in the Assessment Raw Score, to reference it with the SAS scale
                double locationRatio = (weightedTotal-rawScoreARangeMin)/(rawScoreARangeMax-rawScoreARangeMin);
                double curvedGrade = 90+(100-90)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreBRangeMin <= weightedTotal && weightedTotal <= rawScoreBRangeMax){
                double locationRatio = (weightedTotal-rawScoreBRangeMin)/(rawScoreBRangeMax-rawScoreBRangeMin);
                double curvedGrade = 80+(89-80)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreCRangeMin <= weightedTotal && weightedTotal <= rawScoreCRangeMax){
                double locationRatio = (weightedTotal-rawScoreBRangeMin)/(rawScoreCRangeMax-rawScoreCRangeMin);
                double curvedGrade = 70+(79-70)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreDRangeMin <= weightedTotal && weightedTotal <= rawScoreDRangeMax){
                double locationRatio = (weightedTotal-rawScoreDRangeMin)/(rawScoreDRangeMax-rawScoreDRangeMin);
                double curvedGrade = 60+(69-60)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreFRangeMin <= weightedTotal && weightedTotal <= rawScoreFRangeMax){
                double locationRatio = (weightedTotal-rawScoreFRangeMin)/(rawScoreFRangeMax-rawScoreFRangeMin);
                double curvedGrade = 0+(59)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else {
                System.out.println("Sorry, that is an invalid grade. \nPlease rerun the program.");
            }
        } else if (physicsClass.equals("AP")){
            int rawScoreARangeMax = 80;
            int rawScoreARangeMin = 57;
            int rawScoreBRangeMax = 56;
            int rawScoreBRangeMin = 43;
            int rawScoreCRangeMax = 42;
            int rawScoreCRangeMin = 31;
            int rawScoreDRangeMax = 30;
            int rawScoreDRangeMin = 20;
            int rawScoreFRangeMax = 19;
            int rawScoreFRangeMin = 0;
            System.out.print("What is the MCQ out of? > ");
            double MCQTotal = input.nextDouble();
            System.out.print("What is your MCQ score? > ");
            double MCQScore = input.nextDouble();
            System.out.print("What is the FRQ out of? > ");
            double FRQTotal = input.nextDouble();
            System.out.print("What is your FRQ score? > ");
            double FRQScore = input.nextDouble();
            double weightedMCQ = 100*0.5*(MCQScore / MCQTotal);
            double weightedFRQ = 100*0.5*(FRQScore / FRQTotal);
            double APPoints = (weightedMCQ + weightedFRQ)*0.01*80; //takes the % of test, multiplied by 80 to give AP points scored
            if (rawScoreARangeMin <= APPoints && APPoints <= rawScoreARangeMax){
                //location ratio finds the position of the weightedTotal in the Assessment Raw Score, to reference it with the SAS scale
                double locationRatio = (APPoints-rawScoreARangeMin)/(rawScoreARangeMax-rawScoreARangeMin);
                double curvedGrade = 90+(100-90)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreBRangeMin <= APPoints && APPoints <= rawScoreBRangeMax){
                double locationRatio = (APPoints-rawScoreBRangeMin)/(rawScoreBRangeMax-rawScoreBRangeMin);
                double curvedGrade = 80+(89-80)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreCRangeMin <= APPoints && APPoints <= rawScoreCRangeMax){
                double locationRatio = (APPoints-rawScoreBRangeMin)/(rawScoreCRangeMax-rawScoreCRangeMin);
                double curvedGrade = 70+(79-70)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreDRangeMin <= APPoints && APPoints <= rawScoreDRangeMax){
                double locationRatio = (APPoints-rawScoreDRangeMin)/(rawScoreDRangeMax-rawScoreDRangeMin);
                double curvedGrade = 60+(69-60)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (rawScoreFRangeMin <= APPoints && APPoints <= rawScoreFRangeMax){
                double locationRatio = (APPoints-rawScoreFRangeMin)/(rawScoreFRangeMax-rawScoreFRangeMin);
                double curvedGrade = 0+(59)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else {
                System.out.println("Sorry, that is an invalid grade. \nPlease rerun the program.");
            }

        } else {
            System.out.println("Sorry, you must type exactly 'AP' or 'Regular'. \nPlease rerun the program.");
        }
    }
    public static void calculatePhysicsUncurved(){


    }
}
