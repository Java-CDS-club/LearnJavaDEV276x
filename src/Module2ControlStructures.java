package Random;
import java.util.Scanner;

public class Module2ControlStructures {
    public static void main(String[] args){
        int x= 2;
        while(x<200){
            System.out.println("x");
            x *= x;
        }
        runBooleans();
        runCombiningConditions();
        runForLoops();
        runNestedLoops();
        runWhileLoops();
    }
    public static void runBooleans(){
        System.out.println("1 + 1 == 2, evaluates true, EQUALS TO");
        System.out.println("1 + 1 != 11, evaluates true, NOT EQUALS TO");
        System.out.println("1 < 2, evaluates true, LESS THAN");
        System.out.println("1 > 2, evaluates false, GREATER THAN");
        System.out.println("10 <= 15, evaluates true, LESS THAN or EQUAL TO");
        System.out.println("10 >= 15, evaluates false, GREATER THAN or EQUAL TO");

        String name = "John Doe";
        System.out.println(name);
        if (name.equals("John Doe")){
            System.out.println("John Doe equals string name");
        }
        if (name.equalsIgnoreCase("John Doe")){
            System.out.println("john doe equals string name, not case sensitive");
        }
        if (name.startsWith("Joh")){
            System.out.println("string name starts with Joh");
        }
        if (name.endsWith("Doe")){
            System.out.println("string name ends with Doe");
        }
        if (name.contains(" ")){
            System.out.println("string name contains \" \" i.e. empty space");
        }
    }
    public static void runCombiningConditions(){
        System.out.println("operator && means and, a && b, only if  a AND b both true will statement evaluate true");
        System.out.println("operator || means or, a || b, if either a OR b is true, statement will evaluate true");
        System.out.println("operator ! means not, !a, not a - a is not true");
    }
    public static void runForLoops(){
        //syntax
        /*for (initialization; test; update) {
            body
        }*/
        for (int i = 1; i <= 4; i++) {
            System.out.println("+-+-+-+");
        }

        for (int i=1; i<=3; i++) {
            System.out.println("+---+---+---+");
            System.out.println("|---|---|---|");
        }
        System.out.println("+---+---+---+");

        for (int i=1; i<=5; i += 2){
            System.out.println(i);
        }
    }
    public static void runNestedLoops(){
        //loop within a loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner j = " + j);
            }
        }
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.println("0 ");
            }
            System.out.println();
        }
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
    public static void runWhileLoops(){
        //syntax
        /*variable initialization;
        while (test) {
            body
            variable update
        }*/
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number or 0 to get the sum: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);

        String answer = "";
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter yes or no: ");
            answer = input.nextLine();
        }
        System.out.println("Thank you!");

        System.out.println("Enter yes or no: ");
        String answer1 = input.nextLine();
        while (!answer1.equals("yes") && !answer1.equals("no")) {
            System.out.println("Enter ONLY yes or no, please: ");
            answer1 = input.nextLine();
        }
        System.out.println("Thank you!");
    }
}
