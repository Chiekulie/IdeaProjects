package BroCode;

import java.util.Random;

public class RandomClass {
    public static void main(String[]args){
        Random random= new Random();

        int x = random.nextInt(6)+1;
        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}

