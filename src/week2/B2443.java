package week2;

import java.util.Scanner;

public class B2443 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i > 0; i--){
            for (int j = i; j < num; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2) -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
