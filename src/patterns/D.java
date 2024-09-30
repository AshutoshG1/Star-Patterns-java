package patterns;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in); //Input

        System.out.println("Enter row value ");

        int r = S.nextInt();

        for (int i = r; i >= 1; i--) {

            for (int j = r; j > i; j--) {

                System.out.print(" "); // Prints Blank space

            }

            for (int k = 1; k <= i; k++) {

                System.out.print("*"); //Prints *

            }

            System.out.println(" "); //Prints blank spaces

        }

        S.close();

    }
}
