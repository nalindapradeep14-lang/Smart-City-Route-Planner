import java.util.*;

public class Graph {
    private Map<String, List<String>> cityMap;

    public Graph() {
        cityMap = new HashMap<>();
    }
    
    public void addLocation(String location) {
        if (!cityMap.containsKey(location)) {
            cityMap.put(location, new ArrayList<>());
            System.out.println("Location added: " + location);
        } else {
            System.out.println("Location already exists!");
        }
    }
}
