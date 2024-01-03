import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class TaskPerformanceDataStructure {
public static void main(String[] args) {

Stack<String> stack = new Stack<String>();

Scanner scanner = new Scanner(System.in);

System.out.println("Enter four book titles. ");

for (int i = 1; i <= 4; i++) {

System.out.print("Book " + i + ": ");

String bookTitle = scanner.nextLine();

stack.push(bookTitle);

}

Queue<String> queue = new LinkedList<String>();

while (!stack.isEmpty()) {

String bookTitle = stack.pop();

queue.add(bookTitle);

}

System.out.println("\nNew order of books:\n");

for (String bookTitle : queue) {

System.out.println(bookTitle);

}
}
}