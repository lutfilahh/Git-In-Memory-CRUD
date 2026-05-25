public class Main {

    public static void main(String[] args) {

        UpdateDeleteService manager = new UpdateDeleteService();

        // CREATE
        manager.addTask(new Task(1, "Belajar Java"));
        manager.addTask(new Task(2, "Belajar Git"));
        manager.addTask(new Task(3, "Belajar OOP"));

        // READ
        System.out.println("\n=== ALL TASKS ===");
        manager.viewAllTasks();

        // UPDATE
        System.out.println("\n=== UPDATE TASK ===");
        manager.updateTask(2, "Belajar Git Branching");

        // READ setelah update
        System.out.println("\n=== TASK AFTER UPDATE ===");
        manager.viewAllTasks();

        // DELETE
        System.out.println("\n=== DELETE TASK ===");
        manager.deleteTask(1);

        // READ setelah delete
        System.out.println("\n=== FINAL TASK LIST ===");
        manager.viewAllTasks();
    }
}