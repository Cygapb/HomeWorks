package ua.artcode.week1;

import java.util.Scanner;
/**
 * Created by Администратор on 12.10.2016.
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
 в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add value 1: ");
        double var1 = sc.nextInt();
        System.out.println("Add value 2: ");
        double var2 = sc.nextInt();
        double res1 = (var1 % var2);
        double res2 = (var2 % var1);
        if (res1 == 0 ) {
            System.out.println("True " + var1 / var2);}
        else if (res2 == 0) {
                System.out.println("True " + var2 / var1);}
        else if (res1 != 0)  {
            System.out.println("False " + var1 / var2);}
        else if (res2 != 0) {
            System.out.println("False " + var2 / var1);
            }
        }

}
