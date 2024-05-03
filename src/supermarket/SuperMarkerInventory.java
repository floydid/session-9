package supermarket;

public class SuperMarkerInventory {
    private int numberOfInStockToothpaste;
    private int numberOfInStockHairOil;
    private int numberOfInStockBodySoap;
    private int numberOfInStockLotion;

    public SuperMarkerInventory(int numberOfInStockToothpaste, int numberOfInStockHairOil, int numberOfInStockBodySoap, int numberOfInStockLotion) {
        this.numberOfInStockToothpaste = numberOfInStockToothpaste;
        this.numberOfInStockHairOil = numberOfInStockHairOil;
        this.numberOfInStockBodySoap = numberOfInStockBodySoap;
        this.numberOfInStockLotion = numberOfInStockLotion;
    }

    public int getNumberOfInStockToothpaste() {
        return numberOfInStockToothpaste;
    }

    public int getNumberOfInStockHairOil() {
        return numberOfInStockHairOil;
    }

    public int getNumberOfInStockBodySoap() {
        return numberOfInStockBodySoap;
    }

    public int getNumberOfInStockLotion() {
        return numberOfInStockLotion;
    }

    //product add method
}
