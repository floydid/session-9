package stringformat;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's name:");
        String name = scanner.nextLine();
        System.out.println("Enter Score on math:");
        float math = scanner.nextFloat();
        System.out.println("Enter Score on Science:");
        float science = scanner.nextFloat();
        System.out.println("Enter Score on Programming:");
        float programming = scanner.nextFloat();
        System.out.println("Enter Score on Social:");
        float social = scanner.nextFloat();

        float studentPercentage = ((math+science+programming+social)/400) * 100;
        //String formattedPercentage = String.format("%s scored percentage of %.2f", name, studentPercentage);
        //System.out.println(formattedPercentage);
        if (studentPercentage>=90){
            String message = String.format("%s got A+",name);
            System.out.println(message);
        } else if(studentPercentage<90 && studentPercentage>= 80){
            String message = String.format("%s got A",name);
            System.out.println(message);
        }else if(studentPercentage<80 && studentPercentage>=70){
            String message = String.format("%s got B",name);
            System.out.println(message);

        }else if(studentPercentage<70 && studentPercentage>=60){
            String message = String.format("%s got c",name);
            System.out.println(message);
        }else{
            String message = String.format("%s Failed",name);
            System.out.println(message);
        }


    }



}
