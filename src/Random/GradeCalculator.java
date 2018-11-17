package Random;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
//selection if else for which course u wanna calc
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to calculate or estimate a grade? \n[1] calculate \n[2] estimate \nEnter Here > ");
        Integer CalculateOrEstimate = input.nextInt();
        if (CalculateOrEstimate == 1){
            System.out.print("What class would you like to calculate your grade for? \n[1] Advanced Pre-Calculus Section 2 Block 4B \nEnter Here > ");
            Integer chooseClassForCalculate = input.nextInt();
            if (chooseClassForCalculate == 1){
                calculateMathGrade();
            } /*else if (chooseClassForCalculate){

            } */else {
                System.out.println("Sorry, you must type exactly '1'..... \nPlease rerun the program.");
            }
        } else if (CalculateOrEstimate == 2){

        } else {
            System.out.println("Sorry, you must type exactly '1' or '2'. \nPlease rerun the program.");
        }
    }

    //Advanced Pre-Calculus Section 2 Block 4B
    public static void calculateMathGrade(){
        double quizWeighting = 0.34; //actually 0.24 but +0.1 from the exam which isn't accounted
        double testWeighting = 0.66; //actually 0.56 but +0.1 from the exam which isn't accounted
        System.out.println("This program calculates the composite grade for Advanced Pre-Calculus Section 2 Block 4B after addition of a grade.");
        Scanner input = new Scanner(System.in);
        System.out.print("Are you adding a 'Quiz' or 'Test' grade? > ");
        String gradeType = input.nextLine();
        if (gradeType.equals("Quiz")){
            System.out.print("What is your current Quiz section percentage? > ");
            double quizSectionPercentage = input.nextDouble();
            System.out.print("How many total points does your Quiz section have currently? > ");
            double quizTotalPoints = input.nextDouble();
            System.out.print("How many points have you score your Quiz section currently? > ");
            double quizScoredPoints = input.nextDouble();
            System.out.print("What is your current Test section percentage? > ");
            double testSectionPercentage = input.nextDouble();
            System.out.print("How many total points does your Test section have currently? > ");
            double testTotalPoints = input.nextDouble();
            System.out.print("How many points have you score your Test section currently? > ");
            double testScoredPoints = input.nextDouble();

        } else if (gradeType.equals("Test")){

        } else {
            System.out.println("Sorry, you must type exactly 'Quiz' or 'Test'. \nPlease rerun the program.");
        }

    }
    public static void estimateMathGrade(){
        double quizWeighting = 0.34; //actually 0.24 but +0.1 from the exam which isn't accounted
        double testWeighting = 0.66; //actually 0.56 but +0.1 from the exam which isn't accounted
        System.out.println("This program estimates the composite grade for Advanced Pre-Calculus Section 2 Block 4B after addition of a grade.");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current Quiz section grade? > ");
        Double quizSectionPercentage = input.nextDouble();
        System.out.print("What is your current Test section grade? > ");
        Double testSectionPercentage = input.nextDouble();
        double initialCompositeGrade = (quizSectionPercentage*quizWeighting)+(testSectionPercentage*testWeighting);
        System.out.print("Is your current composite grade " + initialCompositeGrade + "?");
        System.out.print("( Y / N )");
        String answerOne = input.nextLine();
        if (answerOne.equals("Y")){

        } else if (answerOne.equals("N")){
            System.out.println("Error. The Quiz and Test percentages were likely incorrectly entered. \nPlease rerun the program.");
        } else {
            System.out.println("Sorry, you must type exactly 'Y' or 'N'. \nPlease rerun the program.");
        }

    }
}
