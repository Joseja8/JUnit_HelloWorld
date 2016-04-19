package junit_helloworld;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Basic program showing the use of JUnit.
 *
 * @author Joseja
 */
public class JUnit_HelloWorld {

    public static void main(String[] args) {
        // Execute and store tests.
        Result testResults = JUnitCore.runClasses(TestHelloWorld.class);
        // Print some info about the executed tests.
        System.out.println("Number of tests executed: " + testResults.getRunCount());
        System.out.println("Number of tests failed: " + testResults.getFailureCount());
        // If there were any number of failed tests, print them in console.
        if (!testResults.wasSuccessful()) {
            System.out.println("FAILED_TESTS: ");
            for (Failure failure : testResults.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }

}
