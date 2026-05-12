import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;


    public UserInterface(TodoList list,Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();

            if (command.contains("add")) {
                System.out.println("To add: ");
                String toAdd = scanner.nextLine();
                list.add(toAdd);
            } else if (command.contains("list")) {
                list.print();
            } else if (command.contains("remove")) {
                System.out.println("Wich one is removed? ");
                int removedNum = Integer.valueOf(scanner.nextLine());
                list.remove(removedNum);
            } else if (command.contains("stop")) {
             break;   
            }
        }
    }
}
