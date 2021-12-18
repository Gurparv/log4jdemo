package AutoTestingFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{

   Logger log = LogManager.getLogger(AppTest.class.getName());

    @Test
    public void shouldAnswerWithTrue()
    {
        log.debug("I am debugging");
        log.error("I am an error");
        log.fatal("This is fatal.");
        log.info("i am for activity");
        log.warn("i am warning!");
        System.out.println("This should pass.");
    }

    @Test
    public void helloWorld(){
        System.out.println("Hello world app.");
    }
}
