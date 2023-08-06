package com.solidprinciple.interfacesegrigation;

public class OldPrinter implements Printer, Fax{
    @Override
    public void fax() {
        System.out.println("Sending the fax");
    }

    @Override
    public void prints() {
        System.out.println("printing the black and white printer");
    }
}
