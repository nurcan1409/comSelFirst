package utilities;

import org.apache.logging.log4j.Logger;



import org.apache.logging.log4j.LogManager;

public class Log4j {
   private static Logger log= LogManager.getLogger(Log4j.class.getName());


    public static void info(String info_mesajı) {
        log.info("message");

    }

    public static void warn(String message){
        log.warn(message);
    }

    public static void  debug(String message){

        log.debug(message);
    }
    public static void  fatal(String message) {

        log.fatal(message);
    }
public static void error(String message){
        log.error(message);
}
public static void trace(String message) {
        log.trace(message);
}

    }

