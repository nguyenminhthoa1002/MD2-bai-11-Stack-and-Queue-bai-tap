package baiTap5;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] arrayInput = inputString.split("");
        boolean checkPalindrome = false;
        for (int i = 0; i < arrayInput.length/2; i++) {
            if (arrayInput[i].toLowerCase().equals(arrayInput[(arrayInput.length-1)-i].toLowerCase())) {
                checkPalindrome = true;
            }
        }
        if (checkPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }
}
