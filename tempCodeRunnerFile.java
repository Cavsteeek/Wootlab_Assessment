
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskListManager {
    private static List<Task> taskList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Mark as Completed");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTasks();
                    break;
                case 3:
                    markAsCompleted();
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask() {
        System.out.println("Enter the task title:");
        String title = scanner.nextLine();
        taskList.add(new Task(title, false));
        System.out.println("Task added successfully!");
    }

    private static void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            System.out.println(i + ". " + task.getTitle() + " - Completed: " + task.isCompleted());
        }
    }

    private static void markAsCompleted() {
        displayTasks();
        System.out.println("Enter the index of the task to mark as completed:");
        int index = scanner.nextInt();
        if (index >= 0 && index < taskList.size()) {
            Task task = taskList.get(index);
            task.setCompleted(true);
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}

class Task {
    private String title;
    private boolean completed;

    public Task(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
