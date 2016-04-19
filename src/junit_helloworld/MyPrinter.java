/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_helloworld;

/**
 * @brief Stores a message and prints it in console.
 * @author Joseja
 */
public class MyPrinter {
    /**
     * Stored message.
     */
    private String message;
    
    /**
     * Initialize the default message with empty string.
     */
    public MyPrinter() {
        this.message = "";
    }
    
    /**
     * Updates the message to print.
     * @param message stored message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Prints in console the stored message.
     * @return 
     */
    public String print() {
        System.out.println("TEST_MESSAGE: " + message);
        return this.message;
    }
}
