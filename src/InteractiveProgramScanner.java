import java.util.Scanner;
public class InteractiveProgramScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome! What is your name? ");
        String name = input.next();
        System.out.println("Hello " + name + "!");
        //Scanner is very specific about data types, and has a total of 4 methods
        //FOR Scanner input = new Scanner(System.in);
        //input.next(); looks for a String with no spaces, and ignores everything after a space if you enter one
        //input.nextLine(); looks for everything before user taps Enter
        //input.nextInt(); looks for an int value
        //input.nextDouble(); looks for a double value

    }
}
