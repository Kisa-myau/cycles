import java.util.Scanner;

public class task3 {

    public static void snakePrint(int n, int col) {
        int i = -col;
        int j = -col;
        for (int a = 1;a<=n/col;a++) {
            System.out.print(a + "| ");
            if (a%2!=0){
                for (j = i+col+1; j <= col*a; j++)
                    System.out.print(j + "  ");
            }
            if (a%2==0) {
                for (i = j+ col-1; i >= j; i--) {
                    System.out.print(i + "  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое число col - количество чисел в строке: ");
            int col = in.nextInt();
            System.out.println("Введите целое число n - число, до которого нужно выводить змейку: ");
            int n = in.nextInt();
            in.close();

            if (n>=1&col>0) snakePrint(n,col);
            else System.out.println("Введите числа n>=1 и col >0! ");
    }
}

