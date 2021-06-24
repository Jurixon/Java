package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2 = 0;
        do {
            System.out.println("Podaj pierwszą liczbę: ");
            num1 = input.nextInt();
            if (num1 != 0) {
                System.out.println("Podaj drugą liczbę: ");
                num2 = input.nextInt();
                if (num2 != 0) {
                    System.out.printf("Wynik dodawania %d + %d = %d \n", num1, num2, num1 + num2);
                } else {
                    System.out.println("Podano 0");
                }
                System.out.print("\n");
            } else {
                System.out.println("Podano 0");
            }
        } while (num1 != 0 && num2 != 0);
    }
}