package com.chernyshov.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

/**
 * @author dchernyshov
 */
public class ApacheCommonsLogAdapter extends Logger {
    private Log logger = new Log4JLogger();
    
    @Override
    void debug(String msg) {
         logger.debug(msg);
    }
    
    @Override
    void trace(String msg) {
        logger.trace(msg);
    }
    
    @Override
    void log(String msg) {
        logger.info(msg);
    }
}
