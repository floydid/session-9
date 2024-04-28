public class AmazonWebApp {
    public static void main(String[] args) {
        Mobile iphone14ProMax = new Mobile();
        iphone14ProMax.setBrand("Apple");
        iphone14ProMax.setOperatingSystem("IOS");
        iphone14ProMax.setNumberOfCameras(3);
        iphone14ProMax.setSize(6.7f);
        iphone14ProMax.setStorage(512);
        iphone14ProMax.setStorageUnit("GB");
        iphone14ProMax.setPrice(1099f);

        Mobile samsungS22 = new Mobile();
        samsungS22.setBrand("Samsung");
        samsungS22.setOperatingSystem("Android");
        samsungS22.setNumberOfCameras(4);
        samsungS22.setSize(6);
        samsungS22.setStorage(256);
        samsungS22.setStorageUnit("GB");
        samsungS22.setPrice(899.7f);

        Tv samsungVseries = new Tv();
        samsungVseries.setBrand("Samsung");
        samsungVseries.setScreenType("LCD");
        samsungVseries.setPrice(499.3f);
        samsungVseries.setSmartTv(false);

        Tv lgTv = new Tv();
        lgTv.setBrand("LG");
        lgTv.setScreenType("OLED");
        lgTv.setPrice(1599.78f);
        lgTv.setSmartTv(true);

        System.out.println("Brand: " + iphone14ProMax.getBrand());
        System.out.println("OS: " + iphone14ProMax.getOperatingSystem());
        System.out.println("Capacity: " + iphone14ProMax.getStorage());
        System.out.println("Number of cameras: " + iphone14ProMax.getNumberOfCameras());
        System.out.println("Price: " + iphone14ProMax.getPrice());
        System.out.println("Size: " + iphone14ProMax.getSize());

    }
}
