package baiTap6;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<String> bracketStack = new Stack<>();
        System.out.println("Enter Expression: ");
        Scanner scanner = new Scanner(System.in);
        String inputExpression = scanner.nextLine();
        String[] arrayInput = inputExpression.split("");
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i].equals("(")) {
                bracketStack.push(arrayInput[i]);
            }
        }

        if (!bracketStack.empty()){
            for (int i = 0; i < arrayInput.length; i++) {
                if (arrayInput[i].equals(")")) {
                    if (bracketStack.empty()) {
                        System.err.println("This Expression is NOT good!");
                    } else {
                        bracketStack.pop();
                        break;
                    }
                }
            }
            if (bracketStack.empty()){
                System.out.println("Good");
            } else {
                System.err.println("This Expression is NOT good!");
            }
        } else {
            System.err.println("This Expression is NOT good!");
        }
    }
}
