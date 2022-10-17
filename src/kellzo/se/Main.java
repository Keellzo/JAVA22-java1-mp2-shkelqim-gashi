package kellzo.se;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(0, 0);
        Product bottle = new Product("Dom Perignon", 2139, 6);
        Product chips = new Product("Pringles", 42, 36);
        SubProduct balloons = new SubProduct("Balloon", 24, 5, 0.50);
        String choice;

        do {
            System.out.println("1. Buy " + bottle.getProduct() + " - " + bottle.getPrice() + " SEK, " + bottle.getProductAmount() + " left");
            System.out.println("2. Buy " + chips.getProduct() + " - " + chips.getPrice() + " SEK, " + chips.getProductAmount() + " left");
            System.out.println("3. Buy " + balloons.getProduct() + " - " + (balloons.getDiscount() * 100) + "% SALE - " + balloons.getPrice() + " SEK now! " + balloons.getProductAmount() + " left ");
            System.out.println("4. Quit");

            Scanner input = new Scanner(System.in);
            choice = input.nextLine();

            switch (choice) {
                case "1" -> {
                    if (bottle.getProductAmount() > 0) {
                        customer.setTotalProducts();
                        customer.setTotalAmount(bottle.getPrice());
                        bottle.setProductAmount();
                    } else {
                        System.out.println("| " + bottle.getProduct() + " IS SOLD OUT |");
                    }
                }
                case "2" -> {
                    if (chips.getProductAmount() > 0) {
                        customer.setTotalProducts();
                        customer.setTotalAmount(chips.getPrice());
                        chips.setProductAmount();
                    } else {
                        System.out.println("| " + chips.getProduct() + " IS SOLD OUT |");
                    }
                }
                case "3" -> {
                    if (balloons.getProductAmount() > 0) {
                        customer.setTotalProducts();
                        customer.setTotalAmount(balloons.getPrice());
                        balloons.setProductAmount();
                    } else {
                        System.out.println("| " + balloons.getProduct() + " IS SOLD OUT |");
                    }
                }
                case "4" ->
                        System.out.println("You bought " + customer.getTotalProducts() + " items and the total amount is " + customer.getTotalAmount());
            }
        } while (!choice.equals("4"));
    }
}