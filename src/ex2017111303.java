import java.util.Scanner;

public class ex2017111303 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for (int i=0;i<n;i++){
            for (int j=1;j<(n-i);j++){
                System.out.print(" ");
                }
            for (int k=n;k<=n+i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
