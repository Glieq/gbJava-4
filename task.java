import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        ArrayList<String> array = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            String userInput = iScanner.nextLine();
            if (!userInput.equals("print")) {
                array.add(userInput);
            }
            if (userInput.equals("print")) {
                for (int i = array.size() - 1; 0 <= i; i--) {
                    String element = array.get(i);
                    queue.add(element);
                }
                System.out.println(queue);
                break;
            }
        }
        while (true) {
            String userInput = iScanner.nextLine();
            if (userInput.equals("print")) {
                System.out.println(queue);
            }
            if (userInput.equals("revert")) {
                queue.remove();
            }
            if (queue.isEmpty()) {
                break;
            }
        }
        iScanner.close();
    }
}
