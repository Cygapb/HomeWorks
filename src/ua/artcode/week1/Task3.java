package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Администратор on 12.10.2016.
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Pls add value: ");
        int val = sc.nextInt();
        int sys = (val % 7);
        if (sys > 0) {
            System.out.println("Bad number");}
        else if (sys == 0) {
                System.out.println("Result " + val * 2);
            }
        }
}
