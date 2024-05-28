package com.demo.service;

import com.demo.model.Product;

import java.util.*;

public class CartService {
    private static List<Product> productList = new ArrayList<>();
    private static Map<String, List<Product>> userCarts = new HashMap<>();

    static {
        productList.add(new Product(1, "Shoes", 3000, 10));
        productList.add(new Product(2, "Shirts", 1500, 20));
        productList.add(new Product(3, "Bags", 2000, 15));
        productList.add(new Product(4, "Jeans", 2500, 12));
        productList.add(new Product(5, "T-Shirts", 1000, 25));
        productList.add(new Product(6, "Hats", 500, 30));
        productList.add(new Product(7, "Socks", 200, 50));
        productList.add(new Product(8, "Belts", 800, 18));
        productList.add(new Product(9, "Sunglasses", 1200, 22));
        productList.add(new Product(10, "Watches", 5000, 8));
    }

    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void addToCart(String username, int productId, int qty) {
        Product product = productList.stream()
            .filter(p -> p.getId() == productId && p.getQty() >= qty)
            .findFirst()
            .orElse(null);

        if (product != null) {
            product.setQty(product.getQty() - qty);
            Product cartProduct = new Product(product.getId(), product.getName(), product.getPrice(), qty);

            userCarts.putIfAbsent(username, new ArrayList<>());
            userCarts.get(username).add(cartProduct);

            System.out.println("Added to cart successfully!");
        } else {
            System.out.println("Product not available or insufficient quantity.");
        }
    }

    public void displayCart(String username) {
        List<Product> cart = userCarts.get(username);
        if (cart == null || cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double totalAmount = 0;
        for (Product product : cart) {
            System.out.println(product.getName() + " - " + product.getQty() + " pcs - $" + (product.getPrice() * product.getQty()));
            totalAmount += product.getPrice() * product.getQty();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }

    public void deliverCart(String username) {
        if (userCarts.containsKey(username)) {
            displayCart(username);
            System.out.println("Order delivered.");
            userCarts.remove(username);
        } else {
            System.out.println("No cart found for this user.");
        }
    }

    public Set<String> getAllUsernames() {
        return userCarts.keySet();
    }

	
	
}
