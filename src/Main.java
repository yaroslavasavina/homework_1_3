import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Task 1

        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        int clientOSS = 1;
        int clientDeviceYear = 2014;
        if (clientOSS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOSS == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOSS <1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Task 3

        int year = 2020;
        boolean leapYear = (year%4 == 0) && (year%100 != 0) || (year %400 == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");

        }

        // Task 4

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день, чтобы доставить Вашу карту.");
        } else if (deliveryDistance >= 20 && deliveryDistance <60) {
            System.out.println("Потребуется 2 дня, чтобы доставить Вашу карту.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня, чтобы доставить Вашу карту.");
        }

        // Task 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
             System.out.println("Сейчас зима!");
            break;
            case 3:
            case 4:
            case 5:
             System.out.println("Сейчас весна!");
            break;
            case 6:
            case 7:
            case 8:
             System.out.println("Сейчас лето!");
            case 9:
            case 10:
            case 11:
             System.out.println("Сейчас осень!");
            break;
            default:
                System.out.println("Такого месяца не существует");

        }

    }
}