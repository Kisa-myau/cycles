import java.time.LocalTime;
import java.util.Scanner;
import java.util.Date;

public class Task6 {
    public static int seconds;
    public static LocalTime resultTime;
    private static int delayInSeconds = 1;

    public static void waitSecond(){}
    public static LocalTime printTime(){
        System.out.println(resultTime);
        return resultTime;
    }
    public static LocalTime start(){
        return resultTime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число секунд ");
        int seconds = in.nextInt();
        System.out.println(seconds);
    }
}
