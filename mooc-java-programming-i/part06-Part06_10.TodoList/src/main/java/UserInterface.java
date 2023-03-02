import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("To add:");
        String input = scanner.nextLine();
        this.todoList.add(input);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.println("Which one is removed?");
        int input = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(input);
    }

}
