package T17ExceptionsAndErrorHandling;

import java.util.Scanner;

public class L04Fixing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        try {
            for (int i = 0; i <= weekDays.length; i++) {
                System.out.println(weekDays[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
        scanner.nextLine();
    }
}

