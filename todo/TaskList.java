import java.util.ArrayList;


public class TaskList {
    public static ArrayList<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
    }

    public static void removeTask(String task) {
        tasks.remove(task);
    }
    public static void listTask() {
        if(tasks.isEmpty()) {
            System.out.println("You have no tasks yet");
        }else {
            for(int i = 0; i < tasks.size(); i++) {
                System.out.println(tasks.get(i));
            }
        }
    }
}
