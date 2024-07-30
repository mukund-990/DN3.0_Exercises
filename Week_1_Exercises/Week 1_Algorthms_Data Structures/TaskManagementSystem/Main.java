public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskLinkedList = new TaskLinkedList();

        Task task1 = new Task(1, "Task 1", "In Progress");
        Task task2 = new Task(2, "Task 2", "Done");
        Task task3 = new Task(3, "Task 3", "To Do");

        taskLinkedList.addTask(task1);
        taskLinkedList.addTask(task2);
        taskLinkedList.addTask(task3);

        System.out.println("Tasks:");
        taskLinkedList.traverseTasks();

        Task searchedTask = taskLinkedList.searchTask(2);
        if (searchedTask != null) {
            System.out.println("Searched Task:");
            System.out.println("Task ID: " + searchedTask.getTaskId() + ", Task Name: " + searchedTask.getTaskName() + ", Status: " + searchedTask.getStatus());
        } else {
            System.out.println("Task not found.");
        }

        taskLinkedList.deleteTask(2);

        System.out.println("Tasks after deletion:");
        taskLinkedList.traverseTasks();
    }
}