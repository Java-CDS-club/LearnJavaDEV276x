import java.util.Scanner;
public class Module1ProjectTripPlanner {
    public static void main(String[] args){
        runIntro();
        runInfo();
        runTime();
        runArea();

    }

    public static void runIntro(){
        System.out.println("Welcome to Vacation Planner!");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String travelDestination = input.nextLine();
        System.out.println("Great! " + travelDestination + " sounds like a great trip!" );
        System.out.println("***********");

    }

    public static void runInfo(){
        System.out.println(" ");
        System.out.print("How many days are you going to spend travelling? ");
        Scanner input = new Scanner(System.in);
        Integer daysTravelling = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        Double tripMoney = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        Double currencyUSDValue = input.nextDouble();

        int hoursTravelling = daysTravelling*24;
        int minutesTravelling = daysTravelling*24*60;
        System.out.println("If you are travelling for " + daysTravelling + " days that is the same as " + hoursTravelling + " hours or " + minutesTravelling + " minutes.");
        double moneyUSDPerDay = tripMoney/daysTravelling;
        moneyUSDPerDay *= 100;
        moneyUSDPerDay = (int)(moneyUSDPerDay);
        moneyUSDPerDay = (double)(moneyUSDPerDay/100.0);
        double moneyCurrencyTotal = tripMoney*currencyUSDValue;
        double moneyCurrencyPerDay = moneyUSDPerDay*currencyUSDValue;
        moneyCurrencyPerDay *= 100;
        moneyCurrencyPerDay = (int)(moneyCurrencyPerDay);
        moneyCurrencyPerDay = (double)(moneyCurrencyPerDay/100.0);
        System.out.println("If you are going to spend $" + tripMoney + " USD that means per day you can spend up to " + moneyUSDPerDay);
        System.out.println("Your total budget in " + currencySymbol + " is " + moneyCurrencyTotal + " " + currencySymbol + ", which per day is " + moneyCurrencyPerDay + " " + currencySymbol);
        System.out.println("***********");
    }

    public static void runTime(){
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Integer timeDifference = input.nextInt();
        int timeDifferenceNoon = timeDifference+12;
        String timeDifferenceDigitalFormatMidnight = timeDifference + ":00";
        String timeDifferenceDigitalFormatNoon = timeDifferenceNoon + ":00";
        System.out.print("That means when it is midnight at home it will be " + timeDifferenceDigitalFormatMidnight + " in your travel destination");
        System.out.println(" and when it is noon at home it will be " + timeDifferenceDigitalFormatNoon);
        System.out.println("***********");

    }

    public static void runArea(){
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km^2? ");
        Integer squareAreaKM = input.nextInt();
        double sideAreaKM = Math.sqrt(squareAreaKM);
        double sideAreaMile = sideAreaKM*0.62;
        double squareAreaMile = sideAreaMile*sideAreaMile;
        squareAreaMile *= 100;
        squareAreaMile = (int)(squareAreaMile);
        squareAreaMile = (double)(squareAreaMile/100.0);
        System.out.println("In miles^2 that is " + squareAreaMile);
        System.out.println("***********");

    }
}
