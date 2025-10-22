import java.util.Scanner;

public class SmartCityMain {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        LocationManager manager = new  LocationManager(graph);
        LocationTree tree = new LocationTree();

        while (true) {
            System.out.println("\n--- Smart City Route Planner ---");
            System.out.println("1. Add a new location");
            System.out.println("2. Remove a location");
            System.out.println("3. Add a road between location");
            System.out.println("4. Remove a road");
            System.out.println("5. Display all Connections");
            System.out.println("6. Display all locations (tree)");
            System.out.println("7. BFS traversal from a location");
            System.out.println("8. Exit");
            System.out.print("Enter your choice");

            String choice = sc.next().trim();

            switch (choice) {
                case "1" -> {
                    manager.addLocation();
                    System.out.print("Enter same name again to store in tree: ");
                    String locName = sc.nextLine().trim();
                    tree.insert(locName);
                }
                case "2" -> manager.removeLocation();
                case "3" -> manager.addRoad();
                case "4" -> manager.removeRoad();
                case "5" -> manager.showConnections();
                case "6" -> tree.inorder();
                case "7" -> {
                    System.out.print("Enter starting location for BFS; ");
                    String start = sc.nextLine().trim();
                    graph.bfs(start);
                }
                case "8" -> {
                    System.out.println("Exiting Smart city planner. Goodbye!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Try again");
            }
        
        }
    }

}