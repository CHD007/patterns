package com.chernyshov.proxy;

/**
 * A proxy for business object.
 * @author dchernyshov
 */
public class BusinessObjectProxy implements BusinessObject {
    private final BusinessObject target;
    
    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }
    
    public void sayHi() {
        // pre processing
        System.out.println("About to call real...");
        // real work
        target.sayHi();
        // post processing
        System.out.println("Completed call to real...");
    }
}
