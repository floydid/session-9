package StaticExample;

public class Door {
    private static int personCount;

    public void entryCounter(){
        personCount += 1;
    }

    public void exitCounter(){
        personCount -= 1;
    }

    public static int getPersonCount(){
        return personCount;
    }

}
