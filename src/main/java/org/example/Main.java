package org.example;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Customer
        Customer customer = new Customer("", "denys123@hmail.com", "+");

        // Відображення інформації про клієнта
        customer.displayInfo();
    }
}