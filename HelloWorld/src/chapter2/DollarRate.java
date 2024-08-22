package chapter2;

import java.util.Scanner;

public class DollarRate {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        float number1;
        float DollarRate =1200;
        float DollarValue ;

        System.out.println("how much do you have in naira");
        number1= input.nextFloat();

        System.out.println("what is your naira rate");
        DollarRate = input.nextFloat();

        DollarValue = number1 * DollarRate;
        System.out.printf( "you will get %.3d\n",DollarValue);




    }


}
