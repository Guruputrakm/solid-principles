package com.solidprinciple.interfacesegrigation;

public class MutipurpouseBox implements ColorPrinter, Scanner, Fax{
    @Override
    public void fax() {
        System.out.println("Doing Fax");
    }

    @Override
    public void prints() {
        System.out.println("Print the color element");
    }

    @Override
    public void scans() {
        System.out.println("Scanning is enabled");
    }
}
