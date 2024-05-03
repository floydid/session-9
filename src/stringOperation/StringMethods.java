package stringOperation;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String policyNumbers = "Ath48927, Bg947593, VY85727548";

        String[] individualPolicy = policyNumbers.split(",");
        System.out.println(Arrays.toString(individualPolicy));
        System.out.println(individualPolicy[0]);
        System.out.println(individualPolicy[1].trim());
        System.out.println(individualPolicy[2].trim());
    }
}
