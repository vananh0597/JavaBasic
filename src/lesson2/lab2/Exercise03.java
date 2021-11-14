package lesson2.lab2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array Length: ");
        int desireArrLength = scanner.nextInt();
        int[] myArrInt = new int[desireArrLength];
        for (int index = 0; index < desireArrLength; index++) {
            System.out.print("Index" + index + " : ");
            myArrInt[index] = scanner.nextInt();
        }

        for (int arrIndex = 0; arrIndex < desireArrLength; arrIndex++) {
            int newArray = myArrInt[arrIndex];
            for (int newIndex = arrIndex + 1; newIndex < desireArrLength; newIndex++) {
                if (newArray > myArrInt[newIndex]) {
                    myArrInt[arrIndex] = myArrInt[newIndex];
                    myArrInt[newIndex] = newArray;
                    newArray = myArrInt[arrIndex];

                }
            }

        }
        System.out.println("The sorted array is: ");
        for (int index = 0; index < desireArrLength; index++) {
            System.out.println(myArrInt[index]);
        }
    }

}
