package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee employee_1 = new Cashier(101, "Edward Cullen", 20000.00);
        Employee employee_2 = new Cashier(102, "Alice Cullen", 30000.00);
        Employee employee_3 = new Cashier(103, "Rosalie Cullen", 50000.00);

        Employee manager = new BankManager(201, "Bella Swan", 100000.00);

        manager.add(employee_1);
        manager.add(employee_2);
        manager.add(employee_3);

        manager.print();
    }
}
