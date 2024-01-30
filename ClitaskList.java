import java.util.Scanner;
//Implement a function to add a new task to the list.
//The function should take a task title as input and add it to a list of tasks.

//Each task should be displayed with its index, title, and completion status.

//Implement a function to mark a task as completed.
//Users should enter the index of the task they want to mark as completed.
//Update the completion status of the selected task.

public class ClitaskList {
    static void intro(){
        System.out.println("CLI TASK LIST\n1. Add a new task to the list\n2. Display all tasks\n3. Mark task as completed");
    }
    public class task{
        String index;
        String title;
        String status;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        intro();

        // Declare a variable to store the title of a task
        String taskTitle;

        // Declare an array of strings to store a list of tasks
        String taskList[] = new String[2];

        int introChoice;

        System.out.print(": ");
        introChoice = userInput.nextInt();
        userInput.nextLine();

        System.out.println();

        if (introChoice == 1){
            // Iterate through each element in the taskList array
            for (int j = 0; j < taskList.length; j++){
                System.out.println("Task title:");
                taskTitle = userInput.nextLine();
                taskList[j] = taskTitle;
            }
            for (int i = 0; i < taskList.length; i++){
                System.out.println(taskList[i]);
            }

        }


    }
}
