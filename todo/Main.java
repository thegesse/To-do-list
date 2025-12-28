import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Todo list application demo made by the_geese \n type help to see a list of commands");
        while(true) {
            System.out.println();
            String command = scan.nextLine();
            switch(command) {
                case "help":
                    System.out.println("List of commands: \n" +
                                            "help   - Show command\n" +
                                            "list   - Lists all the tasks you added to your to do list\n" +
                                            "add    - Adds a new task to your to do list\n" +
                                            "remove - Removes a task from your to do list\n" +
                                            "clear  - Clears the terminal makes everything clean\n" +
                                            "quit   - Quits the program");
                    break;

                case "list":
                    System.out.println("Here is a list of all your tasks");
                    TaskList.listTask();
                    break;

                case "add":
                    System.out.println("Enter a task to add:  ");
                    String add = scan.nextLine();
                    TaskList.addTask(add);
                    System.out.println("Task added successfully \n");
                    break;

                case "remove":
                    System.out.print("Enter what task you would like to take off the list: ");
                    String remove = scan.nextLine();
                    TaskList.removeTask(remove);
                    System.out.println("Task removed succesfully \n");
                    break;
                case "clear":
                    System.out.print("\033[H\033[2J"); //thx chatgpt
                    System.out.flush();
                    break;

                    case "quit":
                        System.exit(0);
                default:
                    System.out.println("command not recognized please try something else or use the help command to see what is available");
            }

        }
    }
}