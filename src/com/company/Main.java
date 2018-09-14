package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner intReader = new Scanner(System.in);
        System.out.println("Enter an integer");
        int userNum = intReader.nextInt();
        if (userNum % 2 == 0){
            System.out.println("The integer " + userNum + "is even.");
        }
        else {
            System.out.println("The integer " + userNum + " is odd.");
        }



    }
}