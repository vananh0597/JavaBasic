package lesson4.lab4;

import java.sql.SQLOutput;

public class Exercise01 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        String[] myNewStrings = inputString.split(" and ");
        for (String s: myNewStrings){
            System.out.println(s);
        }
        String firstIndex = myNewStrings[0].replaceAll("[^0-9]","");
        int firstNumber = Integer.parseInt(firstIndex);
        String secondIndex = myNewStrings[1].replaceAll("[^0-9]","");
        int secondNumber = Integer.parseInt(secondIndex);
        System.out.println(firstNumber * 60 + secondNumber);
    }
}
