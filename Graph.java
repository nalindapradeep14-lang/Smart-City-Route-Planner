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

    public void removeLocation(String location) {
        if (cityMap.containsKey(location)) {
            cityMap.remove(location);
            for (String loc : cityMap.keySet()) {
                cityMap.get(loc).remove(location);
            }
            System.out.println("Location removed: " + location);
        } else {
            System.out.println("Location not found!");
        }
    }

    public void removeRoad(String loc1, String loc2) {
        if (cityMap.containsKey(loc1) && cityMap.containsKey(loc2)) {
            cityMap.get(loc1).remove(loc2);
            cityMap.get(loc2).remove(loc1);
            System.out.println("Rode removed between " + loc1 + "and" + loc2);
        } else {
            System.out.println("one or both loacation not found!");
        }
    }
}
