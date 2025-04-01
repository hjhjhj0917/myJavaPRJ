import java.util.Scanner;

public class B10101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ang1 = sc.nextInt();
        int ang2 = sc.nextInt();
        int ang3 = sc.nextInt();

        if (ang1 + ang2 + ang3 == 180){
        } else {
            System.out.println("Error");
            return;
        }
        if (ang1 == 60 && ang2 == 60 && ang3 == 60){
            System.out.println("Equilateral");
        } else if (ang1 == ang2 || ang2 == ang3 || ang3 == ang1 ){
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
        sc.close();
    }
}
