import java.util.Scanner;

public class Task5 {
    public static int add(int x, int y){
        return x+y;
    }
    public static int sub(int x, int y){
        return x-y;
    }
    public static int mult(int x, int y){
        return x*y;
    }
    public static int divide(int x, int y){
        return x/y;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите операцию в формате x + y (допустимые знаки +, -, *, /: ). Данные вводить через пробел!");
        int x = in.nextInt();
        char operator = in.next().charAt(0);
        int y = in.nextInt();
        in.close();

        switch (operator){
            case '+':
                System.out.println("Результат вычислений равен " + add(x,y)); break;
            case '-': System.out.println("Результат вычислений равен " + sub(x,y)); break;
            case '*': System.out.println("Результат вычислений равен " + mult(x,y)); break;
            case '/': System.out.println("Результат вычислений равен " + divide(x,y)); break;
            default:
                System.out.println("Введите допустиные математические операции: +, -, *, /");
                break;
        }
    }
}
