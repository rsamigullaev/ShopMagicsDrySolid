import java.util.Scanner;

public class Main {

    public static final String rubles = "рублей";//Magics

    public static void main(String[] args) {

        Product[] products = {new Phone(), new Player(), new Camera()};//Liskov substitution principle

        printProducts(products); //DRY
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и через пробел количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        printProducts(products);
        printBasket(products);
    }

    private static void printProducts(Product[] products) {
        System.out.println("Список товаров:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products) {
        int costProducts = 0;
        System.out.println("Ваша корзина:");
        for (Product product : products) {
            if (product.getCount() != 0) {
                costProducts += product.getCount() * product.getPrice();
                System.out.println(product + " - " + product.getCount() + " шт."
                        + " 'цена'= " + product.getPrice() + " " + rubles
                        + " 'стоимость'= " + product.getCount() * product.getPrice() + " " + rubles);
            }
        }
        System.out.println("Итого: " + costProducts + " " + rubles);
        System.out.println("СПАСИБО ЗА ПОКУПКУ!!!");
    }
}
