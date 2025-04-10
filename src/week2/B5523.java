package week2;

import java.util.Scanner;

public class B5523 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int scA = 0;
        int scB = 0;

        for (int i = 0; i < num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                scA += 1;
            } else if (a < b) {
                scB += 1;
            }
        }
        System.out.println(scA + " " + scB);
    }
}
