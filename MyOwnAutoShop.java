
class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(300, 300000, "Green", 33);
        Ford ford1 = new Ford(100, 298880, "white", 2018, 2000);
        Ford ford2 = new Ford(250, 190000, "yellow", 2023, 2866);
        Car car = new Car(150, 1000000, "black");

        System.out.println("Sale price of sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of first Ford: " + ford1.getSalePrice());
        System.out.println("Sale price of second Ford: " + ford2.getSalePrice());
        System.out.println("Sale price of car: " + car.getSalePrice());
    }
}
