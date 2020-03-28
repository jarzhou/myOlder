package com.both.older.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 日志输出工具
 */

public class Log {
    private static Log ourInstance = new Log();
    private static Logger logger = null;
    private static Map<Class, Logger> loggerMap = new HashMap<>();
    public static Log getInstance(Class clazz) {
        Log.logger = loggerMap.get(clazz);
        if (Log.logger == null){
            Log.logger = LoggerFactory.getLogger(clazz);
            loggerMap.put(clazz, Log.logger);
        }
        return ourInstance;
    }

    private Log() {
    }

    public void trace(String message){
        Log.logger.trace(message);
    }

    public void trace(String message,Throwable t){
        Log.logger.trace(message, t);
    }

    public void debug(String message) {
        Log.logger.debug(message);
    }

    public void debug(String message, Throwable t) {
        Log.logger.debug(message, t);
    }

    public void info(String message) {
        Log.logger.info(message);
    }

    public void info(String message, Throwable t) {
        Log.logger.info(message, t);
    }

    public void warn(String message) {
        Log.logger.warn(message);
    }

    public void warn(String message, Throwable t) {
        Log.logger.warn(message, t);
    }

    public void error(String message,Object... arguments) {
        Log.logger.error(message,arguments);
    }

    public void error(String message, Throwable t, Object... arguments) {
        Log.logger.error(message,t,arguments);
    }

}
