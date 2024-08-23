package org.example;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    // Конструктор
    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Геттери
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Метод для відображення інформації про клієнта
    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}