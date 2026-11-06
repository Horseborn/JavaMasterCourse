package ControlFlow;

import java.util.Scanner;

public class InputChallenge {
    public static void InputChallengeMethod() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Enter number #" + i);
            int userInput = scanner.nextInt();
            sum += userInput;
        }
        System.out.println(sum);


    }
}
