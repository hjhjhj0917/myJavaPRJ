package week3;

public class Std4 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setShape("흰토끼");
        rabbit.setPosition(100, 100);

        System.out.printf("토끼의 모양은 [%s]입니다. \n", rabbit.getShape());
        System.out.printf("토끼의 위치는 (%d, %d)입니다. \n", rabbit.getX(), rabbit.getY());

    }

}
