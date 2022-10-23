import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkYear();
        downloadApp();
       deliveryDays(60);

    }

    public static void checkYear() {
        int[] year = {1725, 1888, 1997, 2000, 2004, 2010, 2021, 3756};
        for (int i = 0; i < year.length; i++) {
            if ((year[i] % 4 == 0) && (year[i] % 100 == 0) && (year[i] % 400 == 0)){
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

    public static void deliveryDays(int deliveryDistance) {
        int deliveryDays = 1;;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryDays);
        } else {
            if (deliveryDays > 20 && deliveryDays < 60) {
                deliveryDays = deliveryDays + 1;
                System.out.println("Потребуется дней " + deliveryDays);
            } else {
                if (deliveryDays > 60) {
                    deliveryDays = deliveryDays + 2;
                    System.out.println("Потребуется дней " + deliveryDays);
                }
            }
        }
    }
}
