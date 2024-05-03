package conditions;

public class Loops {
    public static void main(String[] args) {
        for(int i=10; i>= 1; i--){
            System.out.println(i);
        }
        System.out.println("Out of the for loop");

        int i = 10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
        System.out.println("Out of the while loop");

        int j = 10;
        do{
            System.out.println(j);
            j--;
        } while (j>=1);
        System.out.println("Out of the do while loop");

        for(int m =1; m<=10; m++){
            if(m%2 == 0) continue;
            System.out.println(m);
        }
    }
}
