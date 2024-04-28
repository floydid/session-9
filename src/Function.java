public class Function {
    public static void main(String[] args) {
        add(2, 3);
        System.out.println("Your total interest is: $" + interest(5055.67f, 3, 8.25f));
    }

    public static void add (int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static float interest(float principle, int numberOfYears, float rate){
        return (principle * numberOfYears * rate)/100;
    }
}
