package patterns;

public class C {
    public static void printStars(int n) {

        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 2 * (n - i); j >= 0; j--) { //For Loop for Row

                System.out.print(" "); // Print Spaces

            }

            for (j = 0; j <= i; j++) { //For Loop for col

                System.out.print("* "); // Print Star

            }

            System.out.println();

        }
    }
        public static void main(String args[]) {

            int n = 5; //Number of Rows

            printStars(n);

        }

}
