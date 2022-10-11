package baiTap4;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        System.out.println("Enter number to convert to Binary: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number/2 !=0) {
            int redundant = number%2;
            myStack.push(redundant);
            number = number/2;
        }
        myStack.push(number);
        System.out.println("Number after convert to Binary:");
        while (!myStack.isEmpty()) {
            System.out.printf("%d",myStack.pop());
        }
    }
}
