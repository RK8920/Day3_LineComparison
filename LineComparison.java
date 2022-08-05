package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the Values for First Line");
        System.out.println("Enter the Values of the points X1 and Y1");
        System.out.println("Enter the value of X1 :  ");
        int X1 = Scan.nextInt();
        System.out.println("Enter the value of Y1 :  ");
        int Y1 = Scan.nextInt();
        System.out.println("Enter the Values of the points X2 and Y2");
        System.out.println("Enter the value of X2 :  ");
        int X2 = Scan.nextInt();
        System.out.println("Enter the value of Y2 :  ");
        int Y2 = Scan.nextInt();

        Double lengthOfLine1 = Math.sqrt((X2 - X1) * (Y2 - Y1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.println("The length of First line is  : " + lengthOfLine1);

        System.out.println("Enter the Values for Second Line");
        System.out.println("Enter the Values of the line X3 and Y3");
        System.out.println("Enter the value of X3 :  ");
        int X3 = Scan.nextInt();
        System.out.println("Enter the value of Y3 :  ");
        int Y3 = Scan.nextInt();
        System.out.println("Enter the Values of the line X4 and Y4");
        System.out.println("Enter the value of X4 :  ");
        int X4 = Scan.nextInt();
        System.out.println("Enter the value of Y4 :  ");
        int Y4 = Scan.nextInt();

        Double lengthOfLine2 = Math.sqrt((X4 - X3) * (Y4 - Y3) + (Y4 - Y3) * (Y4 - Y3));
        System.out.println("The length of Second line is  : " + lengthOfLine2);

//        if (lengthOfLine1.equals(lengthOfLine2)) {
//            System.out.println("Both Lines are Equal");
//        } else
//            System.out.println("Both Lines are Not Equal");
        if (lengthOfLine1.compareTo(lengthOfLine1)) {
            System.out.println("Both Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

    }
}