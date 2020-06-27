package examples;
import java.util.logging.*;

public class LoggingExceptions {
    public static void main (String[] args) {
        Logger logger = Logger.getAnonymousLogger();


        String s = null;

        try {
            System.out.println(s.length());

        } catch (NullPointerException myExc) {

            logger.log(Level.SEVERE, "My Exception happened", myExc);
        }

        System.out.println("program still continues after the exception");
    }
}