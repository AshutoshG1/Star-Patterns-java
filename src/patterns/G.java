package patterns;

import java.util.Scanner;

public class G {
    public static void main(String args[]) {

        int n, x, j, blank = 1;

        System.out.print("Enter the value for rows: ");

        Scanner s = new Scanner(System.in);

        n = s.nextInt(); //input

        blank = n - 1; // logic for balck spaces

//Upper star Pyramid

        for (j = 1; j <= n; j++) {

            for (x = 1; x <= blank; x++) {

                System.out.print(" "); //print blank space

            }

            blank--;

            for (x = 1; x <= 2 * j - 1; x++) {

                System.out.print("*"); //Print Star

            }

            System.out.println("");

        }

//Lower star Pyramid

        blank = 1;

        for (j = 1; j <= n - 1; j++) {

            for (x = 1; x <= blank; x++) {

                System.out.print(" "); //Print Spaces

            }

            blank++;

            for (x = 1; x <= 2 * (n - j) - 1; x++) {

                System.out.print("*"); //Print Star

            }

            System.out.println(""); //Print new line

        }

    }
}
