package week2;

import java.util.Scanner;

public class B10950 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = a + b;

            System.out.println(res);
        }
    }
}
