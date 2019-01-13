import java.util.Scanner;

public class Module3DataFlow {
    public static void main(String[] args){
        power2(16); // 2 to the 16 = 65536
        power2(0); // 2 to the 0 = 1
        power2(7); // 2 to the 7 = 128
        power(4,3);
        for (int i = 0; i <= 16; i++) {
            power(2,i);
        }
        javaMathClass();
    }

    //PARAMETERS
    public static void power2(int exp) {
        var result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= 2;
        }
        System.out.println("2 to the " + exp + " = " + result);
    }
    //PARAMETERS
    public static void power(double base, int exp) {
        //must be "double base" to have bases that are doubles
        var result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("base" + base + "to the " + exp + " = " + result);
    }
    //int instead of void, therefore this method will return an int
    public static int power(int base, int exp) {
        var result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void javaMathClass(){
        //Math.PI = 3.14159…
        //Math.E = 2.71828
        int a = Math.abs(-2);
        double b = Math.pow(10,2);
        double c = Math.sqrt(25.0);
        double d = Math.random();
        //int e = Math.round(0.66);
        int f = Math.max(5,10);
        int g = Math.min(-10, 10);
        double h = Math.sin(Math.PI / 2.0); //sin of angle in radians
        double i = Math.cos(Math.PI / 3.0); //cos of angle in radians
        double j = Math.tan(Math.PI / 4.0); //tan of angle in radians
        double k = Math.toDegrees(Math.PI); //convert radians to degrees
        double l = Math.toRadians(180); //convert degrees to radians
        System.out.println(a + b + c + d + f + i + j + k + l);
        System.out.println(b);
    }
}
