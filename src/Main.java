public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static String checkYear(int year) {
        String answer = "";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            answer = year + " год является високосным";
        } else
            answer = year + " год не является високосным";
        return (answer);
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        System.out.println(checkYear(year));

    }

    public static String checkIos(int clientOs, int clientDeviceYear) {
        String answer = "";
        if (clientOs == 0) {

            if (clientDeviceYear < 2015) {
                answer = "Установите облегченную версию приложения для iOS по ссылке";
            } else
                answer = "Установите версию приложения для iOS по ссылке";

        } else {

            if (clientDeviceYear < 2015) {
                    answer = "Установите облегченную версию приложения для Android по ссылке";
            } else
                    answer = "Установите версию приложения для Android по ссылке";


        }
        return (answer);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2010;
        System.out.println(checkIos(clientOS, clientDeviceYear));

    }

    public static int calculationsDays(int deliveryDistance) {
        int time = 1;
        if (deliveryDistance > 20) {
            time++;
        }

        if (deliveryDistance > 60) {
            time++;
        }
        return (time);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = calculationsDays(deliveryDistance);


        System.out.println("Потребуется " + days + " дней");

    }
}

