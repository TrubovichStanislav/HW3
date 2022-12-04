import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //задача 1
        System.out.println("Задача 1");
        System.out.println("Введите возраст");
        int agg = scanner.nextInt();
        if (agg>=2 && agg<=6)
            System.out.println("нужно ходить в детский сад");
        else if (agg>=7 && agg<18)
            System.out.println("нужно ходить в школу");
        else if (agg>=18 && agg<=24)
            System.out.println("место в университете");
        else if (agg > 24)
            System.out.println("пора ходить на работу");
        System.out.println();

        //задача 2
        System.out.println("Задача 2");
        if (agg < 5)
            System.out.println("Не может кататься на аттракционе");
        else if (agg<14)
            System.out.println("Можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        else
            System.out.println("можно кататься без сопровождения взрослого.");
        System.out.println();

        //задача 3
        System.out.println("Задача 3");
        int one=1;
        int two=2;
        int three=3;
        int temp;

        if ( one >= two)
            temp=one;
        else
            temp=two;
        if (temp>=three)
            System.out.println(temp);
        else
            System.out.println(three);
    }
}