package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExcelReader reader = new ExcelReader();
        String filePath = "12 Customer Call List - Cleaned.xlsx";
        List<Customer> customers = reader.readExcelFile(filePath);

        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}