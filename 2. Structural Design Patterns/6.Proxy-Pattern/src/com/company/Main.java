package com.company;

public class Main {

    public static void main(String[] args) {
	    OfficeInternetAccess access = new ProxyInternetAccess("Edward Cullen");
	    access.grantInternetAccess();
    }
}
