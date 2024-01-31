import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Implement a function to add a new task to the list.
//The function should take a task title as input and add it to a list of tasks.

//Each task should be displayed with its index, title, and completion status.

//Implement a function to mark a task as completed.
//Users should enter the index of the task they want to mark as completed.
//Update the completion status of the selected task.

public class CliTaskList {
    static Scanner userInput = new Scanner(System.in);
    // static String taskList[] = {};
    private static List<Task> taskList = new ArrayList<>();

    static void intro(){
        System.out.println("CLI TASK LIST\n1. Add a new task to the list\n2. Display all tasks\n3. Mark task as completed\n4. Exit");
    }

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            intro();
            int userChoice;

            System.out.print(": ");
            userChoice = userInput.nextInt();
            userInput.nextLine();

            System.out.println();

            switch (userChoice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    displayTask();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(){
        System.out.println("Enter Task Title: ");
        String taskTitle = userInput.nextLine();
        Task newTask = new Task(taskTitle, false);
        taskList.add(newTask);
    }

    private static void displayTask(){
        System.out.println("Tasks: ");
        for (int i = 0; i < taskList.size(); i++){
            Task task = taskList.get(i);
            System.out.println(i + 1 + ". " + task.getTitle() + "\nStatus (Completed?): " + task.taskStatus());
            System.out.println();
        }
    }

}
