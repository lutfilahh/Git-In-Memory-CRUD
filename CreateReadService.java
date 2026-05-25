public class CreateReadService extends TaskManager {

    // CREATE
    public void addTask(Task task) {
        taskList.add(task);
        System.out.println("Task added successfully!");
    }

    // READ
    public void viewAllTasks() {

        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task t : taskList) {
            System.out.println(t);
        }
    }
}