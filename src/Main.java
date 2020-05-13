public class Main {
    public static void main(String[] args) {
    // Первое задание
        byte a = 8;
        short b = 16;
        int c = 32;
        long d = 64;
        double f = 6.4;
        float m = 3.2f;
        boolean t = false;
        char z = 15;
        String e = "Вроде все";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(m);
        System.out.println(t);
        System.out.println(z);
        System.out.println(e);


        System.out.println(task(1.3, 15, 6.3, 51));
        System.out.println(task2(5, 11));
        task3(-5);
        System.out.println(task4(5));
        task5("Фанзиль");
        task6(1200);
    }
    // Второе задание
    public static double task(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
    //Третье задание
    public static boolean task2(int s, int a) {
        if (10 <= s + a && s + a <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //Четвертое задание
    public static void task3(int a) {
        if (a >= 0) {
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
    //Пятое задание
    public static boolean task4(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    // Шестое задание
    public static void task5(String name) {
        System.out.println("Привет, " + name);
    }
    // Седьмое задание
    public static void task6(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Високосный год!");
        } else {
            System.out.println("Не високосный год");
        }
    }
}