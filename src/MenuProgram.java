import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuHandler.displayHeader();
        MenuHandler.displayOptions();

        int userChoice = MenuHandler.getUserChoice(scanner);

        MenuHandler.handleUserChoice(userChoice);

        scanner.close();
    }
}
