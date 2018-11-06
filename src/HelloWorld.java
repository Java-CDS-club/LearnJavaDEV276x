public class HelloWorld {
    //class variables can be used in all methods
    double PI = 3.14;
    int DAYS_IN_A_WEEK = 7;
    String myName = "Michael Lin";

    //main method, this is the method that the computer executes in the console
    public static void main(String[] args){
        printEscapeSequences();
        printControlFlow();
        showJavaDataTypes();
    }

    //prints some examples of escape sequences
    public static void printEscapeSequences(){
        System.out.println("This escape sequence \nmakes a new line");
        System.out.println("This escape sequence \\ turns into a single slash");
        System.out.println("This escape sequence \"creates quotes\"");
        System.out.println("This escape sequence \tmakes a tab indent");
        test;
    }
    public static void printControlFlow(){
        System.out.println("Calling on a method.");
    }
    public static void showJavaDataTypes(){
        System.out.println("The Java data types are \nint(integers):213,3,-51,etc. \ndouble(real numbers):23.1,0.5,-1.4, etc.");
        System.out.println("char(one character):'A', '1', 'z', '%' \nboolean(true or false):true, false");
    }


}