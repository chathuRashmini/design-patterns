package com.company;

public class Main {

    Controller controller;

    Main(String connection) {
        controller = new Controller();

        if (connection.equalsIgnoreCase("management")) {
            controller.setManagementConnection();
        }
        if (connection.equalsIgnoreCase("sales")) {
            controller.setSalesConnection();
        }
        if (connection.equalsIgnoreCase("accounting")) {
            controller.setAccountingConnection();
        }

        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    public static void main(String[] args) {
        new Main(args[0]);
    }
}
