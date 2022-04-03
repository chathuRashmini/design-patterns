package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));

        System.out.println("Employee id: ");
        int employeeId = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Employee name: ");
        String employeeName = bufferedReader.readLine();

        System.out.println("Employee designation: ");
        String employeeDesignation = bufferedReader.readLine();

        System.out.println("Employee address: ");
        String employeeAddress = bufferedReader.readLine();

        System.out.println("Employee salary: ");
        double employeeSalary = Double.parseDouble(bufferedReader.readLine());

        EmployeeRecord employee_1 = new EmployeeRecord(employeeId, employeeName, employeeDesignation, employeeSalary, employeeAddress);
        employee_1.showRecord();

        EmployeeRecord employee_2 = (EmployeeRecord) employee_1.getClone();
        employee_2.showRecord();
    }
}
