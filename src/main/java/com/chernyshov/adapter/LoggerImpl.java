package com.chernyshov.adapter;

/**
 * @author dchernshov
 */
public class LoggerImpl extends Logger {
    @Override
    void debug(String msg) {
        System.out.println(msg);
    }
    
    @Override
    void trace(String msg) {
        System.out.println(msg);
    }
    
    @Override
    void log(String msg) {
        System.out.println(msg);
    }
}
