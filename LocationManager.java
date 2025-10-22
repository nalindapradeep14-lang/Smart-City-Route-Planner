import java.util.Scanner;

public class LocationManager {
    private Graph graph;
    private Scanner scanner;

    public LocationManager(Graph graph) {
        this.graph = graph;
        this.scanner = new Scanner(System.in);
    }
}