package ua.artcode.week1;

/**
 * Created by Администратор on 11.10.2016.
 *4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);{
            System.out.println("Pls check my schedule:");}
        int time = type.nextInt();
        if (time >= 9 && time <= 18) {
            System.out.println("I am on a my job");}
        else if(time > 18 && time  <=24 ){
            System.out.println("I am at home");}
        else if (time > 24 && time < 1000) {
            System.out.println("Wrong time.Sorry.");
        }
    }
}

