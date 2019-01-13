package Random;

public class NumberGuesser {
    public static void main(String[] args){
        int x = 64;
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
            System.out.println(x);
        }
        System.out.println(x + " " + y);
    }
    public static void run(){
        int a = 10;
        int b = 30;
        if (a*2<b){
            a = a*3;
        }
        if (b<a){
            b++;
        } else {
            a--;
        }
        System.out.println(a+" "+b);

        /*int a = 10;
        int b = 30;
        if (a * 2 < b) {
            a = a * 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
        }
        System.out.println(a + " " + b);*/

    }
}
