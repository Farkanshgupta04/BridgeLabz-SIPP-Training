class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null;

    void addTask(Task task) {
        if (head == null) {
            head = task;
            task.next = head;
        } else {
            Task temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = task;
            task.next = head;
        }
    }

    void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " - " + temp.name + " | Priority: " + temp.priority + " | Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void removeTask(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) {
            head = null;
            return;
        }
        Task temp = head;
        Task prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    Task last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int p) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == p)
                System.out.println("Task Found: " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskApp {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new Task(1, "Math Assignment", 2, "2025-07-12"));
        scheduler.addTask(new Task(2, "Grocery Shopping", 1, "2025-07-10"));
        scheduler.addTask(new Task(3, "Gym Session", 3, "2025-07-09"));

        System.out.println("Tasks:");
        scheduler.displayTasks();

        System.out.println("\nSearching Priority 1:");
        scheduler.searchByPriority(1);

        System.out.println("\nDeleting Task ID 2...");
        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}