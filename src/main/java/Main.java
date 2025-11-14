import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();

        System.out.println("=== Plane State Machine Demo ===");

        plane.exitHangar();
        plane.takeOff();
        plane.land();
        plane.enterHangar();

        System.out.println("=== Demo Complete ===");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Plane Control Menu ---");
            System.out.println("1. Exit Hangar");
            System.out.println("2. Enter Hangar");
            System.out.println("3. Take Off");
            System.out.println("4. Land");
            System.out.println("5. Quit");
            System.out.print("Choose an action: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> plane.exitHangar();
                case 2 -> plane.enterHangar();
                case 3 -> plane.takeOff();
                case 4 -> plane.land();
                case 5 -> {
                    System.out.println("Shutting down.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
