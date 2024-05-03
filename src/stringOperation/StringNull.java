package stringOperation;

import java.util.Optional;

public class StringNull {
    public static void main(String[] args) {
        String test = "Pawan";

        Optional<String> optionalOfTest= Optional.ofNullable(test);
//        int nullLength= nullString.length();
        if(optionalOfTest.isPresent()){
            System.out.println("The value is not null");
        }
        else{
            System.out.println("The value is null");
        }

    }
}
