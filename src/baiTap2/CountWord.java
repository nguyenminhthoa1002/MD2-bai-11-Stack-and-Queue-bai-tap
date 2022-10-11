package baiTap2;

import java.util.*;

public class CountWord {
    public static void main(String[] args) {
        Map<String, Integer> countWord = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = scanner.nextLine();
        String[] arrayInput = inputString.split(" ");
        for (int i = 0; i < arrayInput.length; i++) {
            if (countWord.containsKey(arrayInput[i])) {
                countWord.put(arrayInput[i], countWord.get(arrayInput[i]) + 1);
            } else {
                countWord.put(arrayInput[i], 1);
            }
        }
        for (String key : countWord.keySet()) {
            System.out.printf("%s - %d\n",key,countWord.get(key));
        }
    }
}
