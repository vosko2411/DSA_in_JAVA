package Pattern_Building;

import java.util.Scanner;

public class Left_half_pyramid {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
