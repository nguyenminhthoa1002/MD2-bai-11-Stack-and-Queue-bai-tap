package baiTap1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseIntElement {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to input: ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter number %d:\n ", i + 1);
            int numberInStack = Integer.parseInt(scanner.nextLine());
            myStack.push(numberInStack);
        }
        System.out.println("Stack before Reverse:  ");
        for (Integer oldStack : myStack) {
            System.out.print(oldStack+"\t");
        }
        System.out.printf("\n");
        System.out.println("Stack after Reverse: ");

        for (int i = 0; i < number; i++) {
            System.out.print(myStack.pop() + "\t");
        }
    }
}
