package helloworld;

import java.util.ArrayList;

/**
 * @author Steven
 */
public class HelloWorld {
    
    private String _message;
    private ArrayList<World> _worlds;
    
    public HelloWorld(String message) {
	_message = message;
    }
    
    public void setMessage(String message) {
	_message = message;
    }
    
    public void printMessage() {
	System.out.println(_message);
    }
    
    public String getMessage() {
	return _message;
    }
}
