package helloworld;

/**
 *
 * @author Steven
 */
public class World {
    
    private String _name;
    private int _population;
    
    public World(String name, int population) {
	_name = name;
	_population = population;
    }
    
    public String getName() {
	return _name;
    }
    
    public void apocalypseNow(int survivors) {
	_population = survivors;
    }
}
