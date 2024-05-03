package inheritance;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Pawan");
        student1.setAge(20);
        student1.setRollNumber("3");
        student1.takeLeave(10, 12);

        Teacher teacher1 = new Teacher();
        teacher1.setName("Harry");
        teacher1.setAge(35);

        teacher1.takeLeave(02, 05);
    }
}
