package ex4;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(31);
        System.out.println("x=" +x);
        int y = rand.nextInt(31);
        System.out.println("y=" +y);
        while(x!=y)
            if(x>y)
                x=x-y;
        else
                y=y-x;
        System.out.println("cmmdc= "+x);
    }
}
