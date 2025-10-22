import java.util.*;

public class Graph {
    private final Map<String, List<String>> cityMap;

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

    public void addRoad(String loc1, String loc2) {
        if (cityMap.containsKey(loc1) && cityMap.containsKey(loc2)) {
            cityMap.get(loc1).add(loc2);
            cityMap.get(loc2).add(loc1);
            System.out.println("Road added between " + loc1 + "and" + loc2);
        } else {
            System.out.println("Both loacations must exist first!");
        }
    }
    
        public void removeRoad(String loc1, String loc2) {
        if (cityMap.containsKey(loc1) && cityMap.containsKey(loc2)) {
            cityMap.get(loc1).remove(loc2);
            cityMap.get(loc2).remove(loc1);
            System.out.println("Road removed between " + loc1 + "and" + loc2);
        } else {
            System.out.println("one or both loacation not found!");
        }
    }
    
    public void displayConnections() {
        System.out.println("\n--- All city connections ---");
        for (String loc : cityMap. keySet()) {
            System.out.println(loc + " --> " + cityMap.get(loc));
        }
    }

    public void bfs(String start ){
        if (!cityMap.containsKey(start)){
            System.out.println("Start Location not found!");
            return;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        System.out.println("\nBFS Traversal starting from" + start + ":");
        while (!queue.isEmpty()) {
            String node = queue.poll();
            System.out.println(node + " ");

            for (String neighbour : cityMap.get(node)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
    }

    public boolean hasLocation(String location) {
        return cityMap.containsKey(location);
    }
}
