package lesson4.lab4;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        int enterTimes = 0;
        Scanner myObj = new Scanner(System.in);
        do {
            System.out.println("Enter your password");
            String password = myObj.nextLine();
            if (password.equals("password123")) {
                System.out.println("Successful access");
                break;
            }
            enterTimes++;
        }
            while (enterTimes < 3);
            if (!(enterTimes < 3)) {
                System.out.println("You’ve reached the maximum enter times!");
            }
    }
}
