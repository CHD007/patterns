package com.chernyshov.proxy;

/**
 * @author dchernyshov
 */
public class Main {
    public static void main(String[] args) {
        BusinessObject obj = new BusinessObjectProxy(new BusinessObjectImplementation());
        obj.sayHi();
    }
}
