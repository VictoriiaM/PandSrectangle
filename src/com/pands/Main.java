package com.pands;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        int P,S;
        System.out.println("Программа высчитывает периметр и площадь прямоугольника:");
        System.out.println("P=2*(a+b)");
        System.out.println("S=a*b");
        System.out.println("Введите a и b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите стороны прямоугольника a и b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Периметр прямоугольника равен = " + 2*(a+b));
        System.out.println("Площадь прямоугольника равен = " + a*b);
    }
}
