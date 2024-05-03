package ArrayPractice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] numbers = new int[11];
//        numbers[2] = 5;
//        numbers[8] = 7;
//        numbers[10] = 20;
//
//        for(int i=0; i<=numbers.length-1; i++){
//            System.out.println(numbers[i]);
//        }
//
//        //Enhanced for loop
//
//        for(int value : numbers){
//            System.out.println(value);
//        }

        //Array copying

        int[] rollNumbers = {1,5,8,9,3,4};
        System.out.println("Roll Number: "+Arrays.toString(rollNumbers));
        int[] rollNumbersDuplicate = Arrays.copyOf(rollNumbers,rollNumbers.length);
        printNumers(rollNumbersDuplicate);
        System.out.println("Roll Number: "+Arrays.toString(rollNumbers));


    }
    public static void printNumers(int[] rollList){
        rollList[0] =3;
        System.out.println("Roll List: "+Arrays.toString(rollList));
    }

}
