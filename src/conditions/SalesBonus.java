package conditions;

import java.util.Scanner;

public class SalesBonus {
    private static final int TARGET = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of your monthly sales:");
        int sales = scanner.nextInt();

        if(sales >= 2*TARGET ){
            int bonus = 1000;
            System.out.println("Excellent! you earned the bonus of " +bonus);
        }
        else if(sales >= 1.5*TARGET){
            int bonus = 500;
            System.out.println("Fine Performance! you earned the bonus of " +bonus);
        }
        else if(sales >= TARGET) {
            int bonus = 100;
            System.out.println("Satisfactory Performance! you earned the bonus of " + bonus);
        }else{
            System.out.println("You are fired!");
        }

    }
}
