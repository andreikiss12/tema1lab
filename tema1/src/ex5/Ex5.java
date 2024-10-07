package ex5;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        System.out.println("n= "+n);
        if(n==1)
        {
            System.out.println("apartine sirului lui Fibonacci");
            return;
        }
        int i, x=1, y=1, z;
        boolean ap=false;
        for(i=1;i<=n;i++)
        {
            z=x+y;
            x=y;
            y=z;
            if(y==n)
              ap=true;
        }
        if(ap==true)
            System.out.println("apartine sirului lui Fibonacci");
        else
            System.out.println("nu apartine sirului lui Fibonacci");
    }
}
