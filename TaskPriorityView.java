import java.util.*;

public class Main {

    static class Task {
        String name;
        String priority;

        Task(String name, String priority) {
            this.name = name;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        List<Task> allTasks = Arrays.asList(
            new Task("Task A", "HIGH"),
            new Task("Task B", "LOW"),
            new Task("Task C", "HIGH"),
            new Task("Task D", "MEDIUM")
        );

        String filterPriority = "HIGH";

        System.out.println("📌 Tasks with priority: " + filterPriority);
        for (Task task : allTasks) {
            if (task.priority.equalsIgnoreCase(filterPriority)) {
                System.out.println("• " + task.name + " (" + task.priority + ")");
            }
        }
    }
}