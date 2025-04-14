package week2;

public class Std2 {

    public static void main(String[] args) {

        // 예제1
        for (int i=1; i <= 5; i++) {
            System.out.println(i + "번째 반복");
        }

        System.out.println();
        // 예제2
        for (int i=5; i>=1; i--) {
            System.out.println(i + "번 말할거야");
        }

        System.out.println();
        // 예제3
        int result = 0;

        for (int i=1; i <= 100; i++) {
            result += i;
        }
        System.out.println(result);

        System.out.println();
        // 예제4
        int res = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 2 ==0){
                res += i;
            }
        }
        System.out.println(res);

    }
}
