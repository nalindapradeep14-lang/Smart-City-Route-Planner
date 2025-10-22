import java.util.Scanner;

public class LocationManager {
    private final Graph graph;
    private final Scanner scanner;

    public LocationManager(Graph graph) {
        this.graph = graph;
        this.scanner = new Scanner(System.in);
    }

    public void addLocation() {
        System.out.print("Enter Location name: ");
        String name = scanner.nextLine().trim();
        graph.addLocation(name);
    }

    public void removeLocation() {
        System.out.print("Enter Location name to remove: ");
        String name = scanner.nextLine().trim();
        graph.removeLocation(name);
    }

    public void addRoad() {
        System.out.print("Enter first location: ");
        String loc1 = scanner .nextLine().trim();
        System.out.print("Enter Second location: ");
        String loc2 = scanner .nextLine().trim();
        graph.addRoad(loc1, loc2);
    }

    public void removeRoad() {
        System.out.print("Enter first location: ");
        String loc1 = scanner .nextLine().trim();
        System.out.print("Enter Second location: ");
        String loc2 = scanner .nextLine().trim();
        graph.removeRoad(loc1, loc2);
    }

    public void showConnections() {
        graph.displayConnections();
    }
}