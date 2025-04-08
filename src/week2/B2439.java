package week2;

import java.util.Scanner;

public class B2439 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
