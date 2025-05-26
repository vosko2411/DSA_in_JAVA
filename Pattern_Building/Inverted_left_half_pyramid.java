package Pattern_Building;

import java.util.Scanner;

public class Inverted_left_half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int j;
            for(j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
