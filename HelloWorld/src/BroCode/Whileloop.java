package BroCode;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[]args){
//
//        whlie loop = executes a block of code as long as its condition is true

//        Scanner scanner =  new Scanner(System.in);
//        String name="";
//
//            while (name.isBlank() ){
//                System.out.println("Enter your name:");
//                name=scanner.nextLine();
//            }
//        System.out.println("Hello"+name);




//        for loop = executes a block of code a limited amout of times

//        for (int i=10; i>=0; i-=2){
//            System.out.println(i);
//        }
//        System.out.println("happy new year");
//



//         nested loops = a loop inside of a loop

           Scanner scanner=new Scanner(System.in);
           int rows;
           int columns;
           String symbol= "";

        System.out.println("Enter # of rows:");
        rows=scanner.nextInt();
        System.out.println("Enter # of columns:");
        columns=scanner.nextInt();
        System.out.println("Enter synbol t0 use:");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns;j++)
                System.out.print(symbol);
        }

    }

}
