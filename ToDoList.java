import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean completed;

    Task(String description) {
        this.description = description;
        this.completed = false;
    }

    void markCompleted() {
        this.completed = true;
    }

    public String toString() {
        return (completed ? "[✓] " : "[ ] ") + description;
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        
        while (true) {
            System.out.println("1. Add Task \n2. Mark Completed  \n3. Show Tasks  \n4. Exit");
            int choice = scan.nextInt(); scan.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(new Task(scan.nextLine()));
            } else if (choice == 2) {
                System.out.print("Enter task number: ");
                int index = scan.nextInt();
                if (index > 0 && index <= tasks.size()) tasks.get(index - 1).markCompleted();
            } else if (choice == 3) {
                for (int i = 0; i < tasks.size(); i++)
                    System.out.println((i + 1) + ". " + tasks.get(i));
            } else break;
        }
        scan.close();
    }
}
