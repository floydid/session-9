package constructor;

public class ConstructorExample {
    private String name;
    private String address;
    private int rollNumber;
    private String subject;

    public ConstructorExample(String name, int rollNumber, String subject) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subject = subject;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getSubject() {
        return subject;
    }
}
