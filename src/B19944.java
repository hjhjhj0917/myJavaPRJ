import java.util.Scanner;

public class B19944 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int grd = sc.nextInt();

        if (num > grd && grd < 3){
            System.out.println("NEWBIE!");
        } else if (num >= grd && grd > 2){
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
        sc.close();
    }
}
