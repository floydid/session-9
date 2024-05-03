package constructor;

public class ConstructorApp {
    public static void main(String[] args) {
        ConstructorExample student1 = new ConstructorExample("Pawan", 4, "Math");

        System.out.println(student1.getName());
        System.out.println(student1.getRollNumber());
        System.out.println(student1.getSubject());

        student1.setAddress("Kathmandu");
        System.out.println(student1.getAddress());
    }
}
