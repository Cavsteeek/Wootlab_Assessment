import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CliTaskList {
    // Scanner to get user input
    static Scanner userInput = new Scanner(System.in);

    // List to store tasks
    private static List<Task> taskList = new ArrayList<>();

    // Function to display the initial menu
    static void intro(){
        System.out.println("CLI TASK LIST\n1. Add a new task to the list\n2. Display all tasks\n3. Mark task as completed\n4. Exit");
    }

    public static void main(String[] args) {
        // Main loop for the program
        while (true) {
            try {
                // Introduce a delay of 1 second between menu displays
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Display the menu options
            intro();
            int userChoice;

            // Get user input for menu choice
            System.out.print(": ");
            userChoice = userInput.nextInt();
            userInput.nextLine(); // consume the newline character

            System.out.println();

            // Process user's choice
            switch (userChoice) {
                case 1:
                    addTask(); // Option to add a new task
                    break;
                case 2:
                    displayTask(); // Option to display all tasks
                    break;
                case 3:
                    markAsCompleted(); // Option to mark a task as completed
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0); // Option to exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Function to add a new task to the list
    private static void addTask(){
        System.out.println("Enter Task Title: ");
        String taskTitle = userInput.nextLine();
        Task newTask = new Task(taskTitle, false);
        taskList.add(newTask);
    }

    // Function to display all tasks
    private static void displayTask(){
        System.out.println("Tasks: ");
        for (int i = 0; i < taskList.size(); i++){
            Task task = taskList.get(i);
            System.out.println(i + 1 + ". " + task.getTitle() + "\nStatus (Completed?): " + task.taskStatus());
            System.out.println();
        }
    }

    // Function to mark a task as completed
    private static void markAsCompleted(){
        System.out.println("Enter the index of the task to mark as completed");
        displayTask(); // Show the list of tasks for user reference
        System.out.print(": ");
        int userChoice = userInput.nextInt();
        int index = userChoice - 1;
        if(index >= 0 && index < taskList.size()){
            Task task = taskList.get(index);
            task.setTaskStatus(true);
            System.out.println("Task successfully marked as complete");
            System.out.println();
        } else {
            System.out.println("Invalid index, try again");
        }
    }
}