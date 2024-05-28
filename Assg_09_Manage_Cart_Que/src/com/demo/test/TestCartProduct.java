package com.demo.test;

import com.demo.service.CartService;

import java.util.Scanner;
import java.util.Set;

public class TestCartProduct {
    public static void main(String[] args) {
        CartService cartService = new CartService();
        Scanner scanner = new Scanner(System.in);
        String username;

        while (true) {
            System.out.println("1. Buy Products");
            System.out.println("2. Send the delivery of cart");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    cartService.displayProducts();
                    System.out.print("Enter product ID to buy: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    cartService.addToCart(username, productId, qty);
                    break;
                case 2:
                    Set<String> usernames = cartService.getAllUsernames();
                    if (usernames.isEmpty()) {
                        System.out.println("No users have carts.");
                        break;
                    }

                    System.out.println("Users with carts:");
                    for (String user : usernames) {
                        System.out.println(user);
                    }

                    System.out.print("Enter username to deliver: ");
                    username = scanner.nextLine();
                    cartService.displayCart(username);

                    System.out.print("Do you want to deliver (y/n)? ");
                    char deliver = scanner.nextLine().charAt(0);
                    if (deliver == 'y' || deliver == 'Y') {
                        cartService.deliverCart(username);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
