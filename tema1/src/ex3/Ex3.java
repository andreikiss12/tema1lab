package ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n= ");
        int n = sc.nextInt();
        int count=0;
        System.out.print("divizorii: ");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
                System.out.print(i+" ");
            }
        }
        if(count==2)
            System.out.println("nr prim");
    }
}
