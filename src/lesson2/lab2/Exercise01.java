package lesson2.lab2;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array Length: ");
        int desireArrLength = scanner.nextInt();

        int[] myArrInt = new int[desireArrLength];
        for (int index = 0; index < desireArrLength; index++) {
            System.out.print("Index" + index + " : ");
            myArrInt[index] = scanner.nextInt();
        }
        int max = myArrInt[0];
        for (int index1 = 0; index1 < desireArrLength; index1++) {
            if (myArrInt[index1] > max) {
                max = myArrInt[index1];
            }
        }
        System.out.println("Maximum value from the array is " + max);
    }
}
