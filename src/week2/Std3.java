package week2;

import java.util.Scanner;

public class Std3 {

    public static void main(String[] args) {

        // 예제1
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 2; j++){
                System.out.println(i + "번째 외부 for문에서 " + j + "번째 내부 for문");
            }
        }
        System.out.println();

        // 예제2
        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <=9; j++){
                int result = i * j;
                System.out.print(i + "X" + j + "=" + result + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 예제3
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("숫자를 입력하세요 (0 입력시 종료) : ");

            int a = sc.nextInt();

            if (a == 0){
                System.out.println("0을 입력해서 while문 종료");
                break;
            }
            System.out.println(a + "를 입력하셨습니다. while문 계속");
            System.out.println();
        }
    }
}
