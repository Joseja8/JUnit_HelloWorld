package junit_helloworld;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * MyPrinter use case test class.
 *
 * @author Joseja
 */
public class TestHelloWorld extends TestCase {

    /**
     * Expected message.
     */
    String testMessage = "HelloWorld";

    /**
     * Class to test.
     */
    MyPrinter printer = new MyPrinter();

    /**
     * Prepare class before tests.
     */
    @Override
    public void setUp() {
        printer.setMessage(testMessage);
    }

    /**
     * This test will pass, as the message printed is the same as the expected.
     */
    @Test
    public void testSuccessful1Print() {
        assertEquals(testMessage, printer.print());
    }

    /**
     * The printer text changed, so it isn't "HelloWorld" anymore and will fail.
     */
    @Test
    public void testFailed1Print() {
        printer.setMessage("This will fail");
        assertEquals(testMessage, printer.print());
    }

    /**
     * The printer text changed again, and is still wrong.
     */
    @Test
    public void testFailed2Print() {
        printer.setMessage("This too");
        assertEquals(testMessage, printer.print());
    }
}
