import java.util.Scanner;

public class ex2017111302 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
