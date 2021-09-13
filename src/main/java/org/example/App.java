package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class App
{
    public static void main( String[] args )
    {

        ///bmi = (weight / (height × height)) * 703
        double bmi,weight,height;
        Scanner in=new Scanner(System.in);

        System.out.print( "What is your weight? " );
        weight= in.nextDouble();
        System.out.print( "What is your height in inches? " );
        height=in.nextDouble();
        bmi =  (weight / (height * height)) * 703;
        System.out.println( "Your BMI is "+Math.round(bmi*100)/100.0);

        if(18.5<bmi && bmi<25){
            System.out.println("You are within the ideal weight range.");

        }
        else if(18.5>bmi){
            System.out.println("You are underweight. You should see your doctor.");

        }
        else if(bmi>25){
            System.out.println("You are overweight. You should see your doctor.");

        }
    }
}
