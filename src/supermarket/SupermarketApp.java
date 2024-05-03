package supermarket;

import java.util.Scanner;

public class SupermarketApp {

    public static void main(String[] args) {
        int newToothpaste;
        int newHairOil;
        int newBodySoap;
        int newLotion;

        int totalToothpaste;
        int totalHairOil;
        int totalBodySoap;
        int totalLotion;

        Scanner scanner = new Scanner(System.in);
        SuperMarkerInventory inStock = new SuperMarkerInventory(5,7,12,9);
        System.out.println("Select the product to add to the inventory: ");
        System.out.println("**********************************************");
        System.out.println("1. Tooth Paste");
        System.out.println("2. Hair Oil");
        System.out.println("3. Body Soap");
        System.out.println("4. Body Lotion");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("How many toothpaste to add to inventory?");
                newToothpaste = scanner.nextInt();
                totalToothpaste = inStock.getNumberOfInStockToothpaste()+newToothpaste;
                System.out.println("Updated number of tooth paste in inventory: "+totalToothpaste);
                break;
            case 2:
                System.out.println("How many hair oil to add to inventory?");
                newHairOil = scanner.nextInt();
                totalHairOil = inStock.getNumberOfInStockHairOil()+newHairOil;
                System.out.println("Updated number of hair oil in inventory: "+totalHairOil);
                break;
            case 3:
                System.out.println("How many body soap to add to inventory?");
                newBodySoap = scanner.nextInt();
                totalBodySoap = inStock.getNumberOfInStockBodySoap()+newBodySoap;
                System.out.println("Updated number of body soap in inventory: "+totalBodySoap);
                break;
            case 4:
                System.out.println("How many body lotion to add to inventory?");
                newLotion = scanner.nextInt();
                totalLotion = inStock.getNumberOfInStockLotion()+newLotion;
                System.out.println("Updated number of body lotion in inventory: "+totalLotion);
                break;
            default:
                System.out.println("Please enter valid product");
        }


    }
}
