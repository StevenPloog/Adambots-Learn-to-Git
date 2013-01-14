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
	_worlds = new ArrayList<World>(0);
    }
    
    public void addWorld(String name, int pop) {
	_worlds.add(new World(name, pop));
    }
    
    public void printWorlds() {
	//TODO: Add code to print the worlds here.
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
