import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" User Enter your desired number to create a pattern ");
        int n= sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
                if (j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

