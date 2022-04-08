package com.company;

public class ProxyInternetAccess implements OfficeInternetAccess{

    private String employeeName;

    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getRole(String employeeName) {
        return 9;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access is granted.");
        }
    }
}
