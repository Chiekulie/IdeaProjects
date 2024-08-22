package chapter2;

import java.util.Scanner;

public class Addition {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        float number1;
        float nairaRate=991;
        float nairaValue;

        System.out.println("how much do you have in dollar");
        number1=input.nextFloat();

        nairaValue = number1 * nairaRate;

        System.out.printf("You will get N%.2f\n",nairaValue);




    }
}
