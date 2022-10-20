import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkYear();
        downloadApp();
        generateRandomArray();
        tack1();

    }

    public static void checkYear() {
        int[] year = {1725, 1888, 1997, 2000, 2004, 2010, 2021, 3756};
        for (int i = 0; i < year.length; i++) {
            if (year[i] % 4 == 0) {
                System.out.println(year[i] + " год является високосным");
            } else {
                System.out.println(year[i] + " год не является високосным");
            }
        }
    }

    public static void downloadApp() {
        int clientOS = 1;
        if (clientOS == 0) {
        } else if (clientOS == 1) {

            LocalDate localDate = LocalDate.now();
            int year = localDate.getYear();

            if (year < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (year < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            } else if (year > 2015 && clientOS == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (year > 2015 && clientOS == 1) {
                {
                    System.out.println("Установите приложение для Android по ссылке");
                }
            }
        }
    }

    int[] deliveryDistance = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] deliveryDistance = new int[4];
        for (int i = 0; i < deliveryDistance.length; i++) {
            deliveryDistance[i] = random.nextInt(20) + 40;
        }
        return deliveryDistance;
    }

    public static void tack1() {
        int deliveryTime = 0;
        int[] deliveryDistance = generateRandomArray();
        for (int element : deliveryDistance) {
            deliveryTime += element;
        }
        if (deliveryTime <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            if (deliveryTime > 20 && deliveryTime < 60) {
                System.out.println("Потребуется дней " + deliveryTime );
            } else {
                if (deliveryTime > 60) {
                    System.out.println("Потребуется дней " + deliveryTime);
                }
            }
        }
    }
}
