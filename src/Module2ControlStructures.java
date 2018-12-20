public class Module2ControlStructures {
    public static void main(String[] args){
        runBooleans();
        runForLoops();

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
}
