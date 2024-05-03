package StaticExample;

public class MallApp {
    public static void main(String[] args) {
        Door door1 = new Door();
        Door door2 = new Door();
        Door door3 = new Door();
        Door door4 = new Door();

        door1.entryCounter();
        door1.entryCounter();
        door2.entryCounter();
        door3.exitCounter();
        door1.exitCounter();
        door4.exitCounter();
        door2.entryCounter();

        int personInsideMall = Door.getPersonCount();
        System.out.println("Number of people inside mall: " +personInsideMall);
    }
}
