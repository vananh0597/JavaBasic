package lesson4.lab4;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input your string:");
        String myString = myObj.nextLine();
        char[] myStringCharacter = myString.toCharArray();
        String numberPart = "";
        for (char character : myStringCharacter) { //for loop
            if (Character.isDigit(character)) {
                numberPart = numberPart.concat(String.valueOf(character));
            }
        }
        System.out.println(numberPart);
    }

}
