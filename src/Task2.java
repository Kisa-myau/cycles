import java.time.LocalTime;
import java.util.Scanner;



public class Task2 {
    public static void main(String[] args) {

        System.out.println("Считаем, что газонокосилки работали последовательно, одна за другой, а не одновременно");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число, количество часов, проработанное 1й сенокосилкой m: ");
        int m = in.nextInt();
        System.out.println("Введите число сенокосилок n: ");
        int n = in.nextInt();
        in.close();

        if (m>0&n>0) {
        int i=2;
        LocalTime time = LocalTime.of(m,0);
        LocalTime total = time;
        int additional = 10;
            while (i < n) {
                time = time.plusMinutes(additional);
                System.out.println(time + " проработала сенокосилка под номером " + i);
                i++;
                total = total.plusHours(time.getHour()).plusMinutes(time.getMinute());
            }
            System.out.println("Общее время, проработанное всеми газонокосилками " + total);
        }
        else System.out.println("Вы ввели отрицательное число. Введите, пожалуйста, положительные числа");
    }
}