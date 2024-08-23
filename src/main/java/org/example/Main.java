package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Customer
        Customer customer = new Customer("Сергій ", "serg123@hmail.com", "+38012345678");

        // Відображення інформації про клієнта
        customer.displayInfo();
    }
}