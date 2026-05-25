public class UpdateDeleteService extends CreateReadService {

    // UPDATE
    public void updateTask(int id, String newTitle) {

        for (Task t : taskList) {

            if (t.getId() == id) {
                t.setTitle(newTitle);
                System.out.println("Task updated!");
                return;
            }
        }

        System.out.println("Task not found.");
    }

    // DELETE
    public void deleteTask(int id) {

        taskList.removeIf(t -> t.getId() == id);

        System.out.println("Task deleted (if existed).");
    }
}