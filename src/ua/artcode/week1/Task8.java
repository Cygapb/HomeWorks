package ua.artcode.week1;

import java.util.*;

/**
 * Created by Администратор on 13.10.2016.
 * 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 * 			124    4    -   true
 *          1456   567  -   false
 *          1      2    -   false
 *          18     98   -   true
 */
public class Task8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Print number1: ");
        int var1 = sc.nextInt();
        System.out.println("Print number2: ");
        int var2 = sc.nextInt();
    double logic = (var1 % 10);
    double logic2 = (var2 % 10);
        if (logic == logic2) {
            System.out.println("true");}
        else if (logic != logic2) {
            System.out.println("false");
        }

    }
}
