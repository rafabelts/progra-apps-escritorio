package homework.code;

import java.util.Scanner;

public class Main {

    public static void isEven(int number) throws Exception {
        if (number % 2 == 1) {
            throw new Exception("El numero es impar");
        }

        System.out.println("El numero es par");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            isEven(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}