package ie.atu.week7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("PLease enter a number between 0 - 9: ");
        while (true) {
            try {
                Scanner myscan = new Scanner(System.in);
                int myNum = myscan.nextInt();

                if (myNum <= 9 || myNum > 0) {
                    System.out.println("You entered " + myNum);
                    break;

                } else {
                    System.out.println("not a valid number");
                    myscan.next();

                }
            } catch (InputMismatchException ime) {
                System.out.println("caught exception, please enter valid number");

            }
        }

    }
}

