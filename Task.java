public class Task {

    private int id;
    private String title;

    // Constructor
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    // Display object
    @Override
    public String toString() {
        return "Task ID: " + id + " | Title: " + title;
    }
}
