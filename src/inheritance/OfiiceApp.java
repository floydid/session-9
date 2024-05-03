package inheritance;

public class OfiiceApp {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Pawan");
        employee.setAge(30);
        employee.setAddress("Oklahoma");
        employee.setSalary(2550.5);

        Manager manager = new Manager();
        manager.setName("Richard");
        manager.setAge(30);
        manager.setAddress("Oklahoma");
        manager.setSalary(5500.5);
        manager.setBonus(500);

        System.out.println("Employee Details:");
        System.out.println("Name: " +employee.getName());
        System.out.println("Age: " +employee.getAge());
        System.out.println("Address: " +employee.getAddress());
        System.out.println("Salary: " +employee.getSalary());

        System.out.println("Manager Details");
        System.out.println("Name: " +manager.getName());
        System.out.println("Age: " +manager.getAge());
        System.out.println("Address: " +manager.getAddress());
        System.out.println("Salary: " +manager.getSalary());
        System.out.println("Bonus: " +manager.getBonus());

    }
}
