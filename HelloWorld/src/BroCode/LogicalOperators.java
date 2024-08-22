package BroCode;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[]args){

//        logical oprators = used to connect two or more expression
//                &&=(AND) both conditions must be ture
//                ||=(OR) EITHER condition must br ture
//               ! = (NOT) reverses boolean value of condition

//        int temp = 35;
//
//                if(temp>30){
//                    System.out.println("it is hot outside");
//                }
//                else if(temp>=20 && temp<30){
//                    System.out.println("it is warm outside");
//                }
//                else{
//                    System.out.println("it is cold outside");
//                }
//


        Scanner scanner = new Scanner(System.in);
        System.out.println("you are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("you quit the game");
        }
        else {
            System.out.println("you are still playing the game");
        }

    }
}
