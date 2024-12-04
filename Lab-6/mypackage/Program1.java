package mypackage;

import externalpackage.ExternalClass;   Import the class from the external package

public class MyPackageDemo {
    public void displayMessage() {
        System.out.println(Hello from MyPackageDemo in mypackage!);
    }

    public static void main(String[] args) {
        MyPackageDemo myPackageDemo = new MyPackageDemo();
        myPackageDemo.displayMessage();

        ExternalClass externalClass = new ExternalClass();
        externalClass.displayMessage();
    }
}
