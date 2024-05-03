package conditions;

import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day is today?");
        String dishTurn = scanner.nextLine();

        switch (dishTurn.toLowerCase()){
            case "Sunday":
                System.out.println("Today is pandey's turn to do dishes");
                break;
            case "Monday":
                System.out.println("Today is Pantey's turn to do dishes");
                break;
            case "Tuesday":
                System.out.println("Today is GD's turn to do dishes");
                break;
            case "Wednesday":
                System.out.println("Today is Nilisha's turn to do dishes");
                break;
            case "Thursday":
                System.out.println("Today is Mahima's turn to do dishes");
                break;
            default:
                System.out.println("Enter valid day");
                break;
        }

    }
}
