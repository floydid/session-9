package bignumbers;

import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        //long number = 100000000000000000000L;

        BigInteger bigInteger = new BigInteger("10000000000000000000");

        BigInteger sub = bigInteger.subtract(new BigInteger("10000000000"));

        int sign = sub.signum();
        if(sign < 0){
            System.out.println("The subtracted value is negative");
        }
        else{
            System.out.println("The subtracted value is positive");
        }

    }
}
