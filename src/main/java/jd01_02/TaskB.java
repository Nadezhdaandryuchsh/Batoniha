package main.java.jd01_02;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        step1();

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        step2(month);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        step3(a, b, c);
    }

    static void step1() {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }

    private static void step3(double a, double b, double c) {
        double dis = b * b - 4 * a * c;
        if (dis < 0)
            System.out.println("корней нет");
        else if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else if (dis == 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println(x1 + " " + x2);


        }
    }
}
