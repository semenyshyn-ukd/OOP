public class Phone {
    String brand;
    String model;
    int price;
    public static void show(String brand, String model, int price) {
        System.out.println("Бренд телефону: " + brand);
        System.out.println("Модель телефону: " + model);
        System.out.println("Ціна телефону: " + price);
    }
}