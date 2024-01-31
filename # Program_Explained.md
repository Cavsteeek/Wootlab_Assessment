 # CLI Task List

This is a simple command-line application that allows users to manage a list of tasks. Users can add new tasks, display all tasks, and mark tasks as completed.


## User Interface

The application presents a simple text-based user interface with the following options:

1. Add a new task to the list
2. Display all tasks
3. Mark task as completed
4. Exit

## Adding a New Task

To add a new task, select option 1 from the main menu. You will be prompted to enter the title of the task. Once you enter the title, the task will be added to the list.

```java
private static void addTask(){
    System.out.println("Enter Task Title: ");
    String taskTitle = userInput.nextLine();
    Task newTask = new Task(taskTitle, false);
    taskList.add(newTask);
}
```

## Displaying All Tasks

To display all tasks, select option 2 from the main menu. The application will display a list of all tasks, along with their titles and completion statuses.

```java
private static void displayTask(){
    System.out.println("Tasks: ");
    for (int i = 0; i < taskList.size(); i++){
        Task task = taskList.get(i);
        System.out.println(i + 1 + ". " + task.getTitle() + "\nStatus (Completed?): " + task.taskStatus());
        System.out.println();
    }
}
```

## Marking a Task as Completed

To mark a task as completed, select option 3 from the main menu. You will be prompted to enter the index of the task you want to mark as completed. Once you enter the index, the task will be marked as completed.

```java
private static void markAsCompleted(){
    System.out.println("Enter the index of the task to mark as completed");
    displayTask();
    System.out.print(": ");
    int userChoice = userInput.nextInt();
    int index = userChoice
