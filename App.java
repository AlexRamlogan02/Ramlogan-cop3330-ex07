package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static double conv = 0.09290304; //constant
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        double x, y, calc, meter;
        System.out.print("What is the length of the room?(feet): ");
        x = scan.nextDouble();
        System.out.print("What is the width of the room?(feet): ");
        y= scan.nextDouble();
        calc = x * y;
        meter = calc * conv;
        System.out.println("You entered the dimensions of " +x +" feet by " +y +"feet.\nThe area is:\n" + calc +" square feet." );
        System.out.println(meter +" square meters");

    }
}
