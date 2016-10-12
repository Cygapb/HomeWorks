package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by Администратор on 12.10.2016.
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add value 1: ");
        int var = sc.nextInt();
        System.out.println("Add value 2: ");
        int var2 = sc.nextInt();
        int var3 = (var + var2);
            if (var3 <= 19 && var3 >= 11) {
            System.out.println("Correct result: " + var3);}
            else if (var3 > 20 || var3 < 11){
            System.out.println("Fail. Wrong result.");
            }
            }
        }
