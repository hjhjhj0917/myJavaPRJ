import java.util.Scanner;

public class Std1 {

    public static void main(String[] args) { // 조건문 안에서 실행할 문장이 두가지 이상인 경우 중 괄호를 무조건 사용한다.

        Scanner sc = new Scanner(System.in);

        int num = 200;

        if (num < 100)
            System.out.println("100보다 작군요.");
        else
            System.out.println("100보다 크군요");

        int select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("1을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("2를 선택하셨습니다.");
                break;

                default: // default는 if문의 else와 같은 역할을 한다.
                    System.out.println("잘못된 선택입니다.");
        }
    }
}
