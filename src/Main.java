import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число m: ");
        int m = in.nextInt();
        System.out.println("Введите целое число n: ");
        int n = in.nextInt();
        in.close();

        int x;
        for (x=m;x<=n;x++) {
            if ((x%3==0)&(x%5!=0)) System.out.println(x);
        }
    }
}