package com.chernyshov.adapter;

/**
 * @author dchernyshov
 */
public abstract class Logger {
    abstract void debug(String msg);
    abstract void trace(String msg);
    abstract void log(String msg);
    static Logger create() {
        return new ApacheCommonsLogAdapter();
    }
}
