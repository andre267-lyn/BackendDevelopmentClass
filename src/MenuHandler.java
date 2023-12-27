import java.util.Scanner;

public class MenuHandler {
    public static void displayHeader() {
        System.out.println("(DIGIJOBS)");
        System.out.println("(Please choose following command :)");
    }

    public static void displayOptions() {
        System.out.println("1. Add new job.");
        System.out.println("2. Print all job.");
        System.out.println("3. Delete job.");
        System.out.println("4. Exit.");
    }

    public static int getUserChoice(Scanner scanner) {
        int choice = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the invalid input
            }
        }

        return choice;
    }

    public static void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Menu 1: Add new job - Menu sedang dalam pengembangan.");
                break;
            case 2:
                System.out.println("Menu 2: Print all job - Menu sedang dalam pengembangan.");
                break;
            case 3:
                System.out.println("Menu 3: Delete job - Menu sedang dalam pengembangan.");
                break;
            case 4:
                System.out.println("Menu 4: Exit - Program akan ditutup.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
