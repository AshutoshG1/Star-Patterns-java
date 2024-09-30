package patterns;

public class B {
    public static void main(String[] args) {

        int rows = 5;

        for(int i = rows; i >= 1; --i) {  //For Loop for Row

            for(int j = 1; j <= i; ++j) { //For Loop for Col

                System.out.print("* "); //Prints *

            }

            System.out.println(); //Get to newline

        }

    }
}
