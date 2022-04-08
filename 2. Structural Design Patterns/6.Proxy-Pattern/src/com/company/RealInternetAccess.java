package com.company;

public class RealInternetAccess implements OfficeInternetAccess{

    private String employeeName;

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }

    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }
}
