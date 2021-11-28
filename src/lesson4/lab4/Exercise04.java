package lesson4.lab4;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Input your url:");
        String myUrl = myObj.nextLine();
        String[] myUrlSplitResult = myUrl.split("://");
        if (myUrlSplitResult[0].equals("http")) {
            System.out.println("Your Url protocol is: http");
        }
        if (myUrlSplitResult[0].equals("https")) {
            System.out.println("Your Url protocol is: https");
        }
        if(myUrlSplitResult[1].indexOf(".com") != -1) {
            System.out.println("Your Url domain is: .com");
        }
        if(myUrlSplitResult[1].indexOf(".net") != -1) {
            System.out.println("Your Url domain is: .net");
        }

    }
}
