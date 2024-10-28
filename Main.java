package com.example.account;

public class Main {
    public static void main(String[] args) {
        DataSource myDataSource = new DataSource() {
            @Override
            public void execute() {
                System.out.println("Executing data source operation...");
            }
        };

        Admin admin = new Admin(1, "John Doe", "password123");
        admin.performOperation(myDataSource);
    }
}