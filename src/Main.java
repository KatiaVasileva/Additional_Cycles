public class Main {
    public static void main(String[] args) {

/*  Задача 4*
*   Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
*   Вывести ping, а если число делится на 5 без остатка, вывести pong.
*   Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
*   Допускается наличие пустых строк в выводе. */

        System.out.println("Задача 4*");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
        }
        System.out.println();

/*  Задача 5*
*   Вывести первые 10 чисел последовательности Фибоначчи. */

        System.out.println("Задача 5*");
        int f1 = 0;
        int f2 = 1;
        int sequenceLength = 10; // количество чисел в последовательности

        System.out.print(f1 + " " + f2 + " ");
        for (int i = 1; i <= (sequenceLength - 2); i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2; f2 = f3;
        }
        System.out.println("\n");
    }
}