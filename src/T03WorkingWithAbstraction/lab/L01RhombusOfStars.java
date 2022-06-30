package T03WorkingWithAbstraction.lab;

import java.util.Scanner;

public class L01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);
    }

    public static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printTriangle(size - i, i);
        }

        for (int i = 1; i < size; i++) {
            printTriangle(i, size - i);
        }
    }

    private static void printTriangle(int firstCount, int secondCount) {
        for (int i = 0; i < firstCount; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < secondCount; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }

//    Scanner scanner = new Scanner(System.in);
//
//    int n = Integer.parseInt(scanner.nextLine());
//
//        for(int i = 1; i <= n; i++){
//            for(int j = 0; j < n - i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j < i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= n - 1; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 0; j < n - i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
}
