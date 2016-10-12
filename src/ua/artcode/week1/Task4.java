package ua.artcode.week1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Администратор on 12.10.2016.
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add value: ");
        double var = sc.nextDouble();
        double v1 = 0;
        double v2 = 1;
        if ((double)var < v2) {
            System.out.println("0");}
        else if ((double)var > v2) {
                System.out.println("1");
            }
    }
}

