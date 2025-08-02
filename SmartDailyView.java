import java.time.LocalDate;
import java.util.*;

public class Main {

    static class Task {
        String name;
        LocalDate startDate;
        String status;

        Task(String name, LocalDate startDate, String status) {
            this.name = name;
            this.startDate = startDate;
            this.status = status;
        }
    }

    public static void main(String[] args) {
        List<Task> allTasks = Arrays.asList(
            new Task("Task A", LocalDate.of(2025, 8, 2), "ASSIGNED"),
            new Task("Task B", LocalDate.of(2025, 7, 30), "PENDING"),
            new Task("Task C", LocalDate.of(2025, 7, 25), "COMPLETED"),
            new Task("Task D", LocalDate.of(2025, 8, 2), "CANCELLED")
        );

        LocalDate today = LocalDate.of(2025, 8, 2); // simulate today

        System.out.println("🔍 Smart Daily View:");
        for (Task task : allTasks) {
            boolean isCancelled = task.status.equals("CANCELLED");
            boolean isCompleted = task.status.equals("COMPLETED");

            boolean startsToday = task.startDate.equals(today);
            boolean startedBeforeAndPending = task.startDate.isBefore(today) && !isCompleted;

            if (!isCancelled && (startsToday || startedBeforeAndPending)) {
                System.out.println("• " + task.name + " (" + task.status + ")");
            }
        }
    }
}