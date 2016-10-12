package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Администратор on 12.10.2016.
 * 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add values: ");
        int var = sc.nextInt();
        int var2 = sc.nextInt();

        if (var > var2) {
            System.out.println("The difference of numbers " + (var - var2));
        }
        else if (var2 > var) {
            System.out.println("Sum of numbers " + (var + var2));
        }

    }
}
