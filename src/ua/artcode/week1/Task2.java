package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Администратор on 11.10.2016.
 * 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add values: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
            int max = v1;
            int min = v3;
        if (max > v2);
        else max = v2;
        if (max > v3);
        else max = v3;
        if (min < v1);
        else min = v1;
        if (min < v2);
        else min = v2;
        System.out.println("Maximum number " + max);
        System.out.println("Minimum number " + min);

    }
}
