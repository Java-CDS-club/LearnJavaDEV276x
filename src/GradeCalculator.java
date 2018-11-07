import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        calculatePhysicsCurved();

    }

    //4A PHYSICS
    public static void calculatePhysicsCompositeGrade(){
        //double
    }
    public static void calculatePhysicsCurved(){
        Scanner input = new Scanner(System.in);
        System.out.print("Are you in 'AP' or 'Regular' Physics?");
        String physicsClass = input.next();
        if (physicsClass == "Regular"){
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
            System.out.print("What the MCQ out of? > ");
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
            if (rawScoreARangeMin <= weightedTotal && weightedTotal <= 100){
                //location ratio finds the position of the weightedTotal in the Assessment Raw Score, to reference it with the SAS scale
                double locationRatio = (weightedTotal-)/(100-65);
                double curvedGrade = 90+(100-90)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            } else if (48 <= weightedTotal && weightedTotal <= 64){
                double locationRatio = (weightedTotal-65)/(64-48);
                double curvedGrade = 90+(100-90)*locationRatio;
                System.out.println("Your % score is " + curvedGrade);
            }
        } else if (physicsClass == "AP") {

        } else {
            System.out.println("Sorry, you must type exactly 'AP' or 'Regular'. \nPlease rerun the program.");
        }




    }
    public static void calculatePhysicsUncurved(){

    }
}
