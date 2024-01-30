import java.util.Scanner;
//Implement a function to add a new task to the list.
//The function should take a task title as input and add it to a list of tasks.

//Each task should be displayed with its index, title, and completion status.

//Implement a function to mark a task as completed.
//Users should enter the index of the task they want to mark as completed.
//Update the completion status of the selected task.

public class CliTaskList {
    static Scanner userInput = new Scanner(System.in);
    static void intro(){
        System.out.println("CLI TASK LIST\n1. Add a new task to the list\n2. Display all tasks\n3. Mark task as completed");
    }
    class task{
        private String title;
        private boolean status;

        public String getTitle(){
            return title;
        }

        public boolean taskStatus(){
            return status;
        }

        public task(String title, boolean status) {
              this.title = title;
              this.status = status;
        }
    }



    public static void main(String[] args) {


        intro();


    }
}


