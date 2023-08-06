package com.solidprinciple.interfacesegrigation;

public class MainExample {
    public static void main(String[] args) {
        MutipurpouseBox mutipurpouseBox = new MutipurpouseBox();
        mutipurpouseBox.fax();
        mutipurpouseBox.prints();
        mutipurpouseBox.scans();
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.prints();
        oldPrinter.fax();
    }
}
