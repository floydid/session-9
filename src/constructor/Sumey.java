package constructor;

import java.util.Calendar;

public class Sumey {
    public static void main(String[] args) {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 1993);
        dateOfBirth.set(Calendar.MONTH, 2);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 24);
        System.out.println(dateOfBirth.getTime());

    }
}
