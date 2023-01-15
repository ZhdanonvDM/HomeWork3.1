import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача № 1");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        byte age = in.nextByte();
        System.out.print("Если возраст человека равен " + age +  " году(ам), то ");
        if (age>=18) {
            System.out.println("он совершеннолетний");
        }else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача № 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        byte temp = in.nextByte();
        System.out.print("На улице " + temp +  " градус, ");
        if (temp>=5) {
            System.out.println("можно идти без шапки");
        }else {
            System.out.println("нужно надеть шапку");
    }
    }
    public static void task3 () {
        System.out.println("Задача № 3");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите скорость: ");
        short velocity = in.nextShort();
        System.out.print("Если скорость " + velocity + " км/ч, то ");
        if (velocity >= 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача № 4");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        byte age = in.nextByte();
        System.out.print("Если возраст человека равен " + age + " году(ам), то ему нужно ходить ");
        if (age>=2 && age<=6) {
            System.out.println("в детский сад");
        }
        if (age>=7 && age<=18) {
            System.out.println("в школу");
        }
        if (age>18 && age<=24) {
            System.out.println("в университет");
        }
        if (age>24) {
        System.out.println("на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача № 5");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        byte age = in.nextByte();
        System.out.print("Если возраст человека равен " + age + " году(ам), то ему ");
        if (age<=5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (age>5 && age<=14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age>14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача № 6");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество человек: ");
        short number = in.nextShort();
        System.out.print("Если количество " + number + " человек, то в вагоне ");
        if (number <= 60) {
            System.out.println("есть сидячее место");
        }
            else {
                if (number>60 && number <=102) {
                    System.out.println("есть стоячее место");
                }
                    else {
                    System.out.println("мест нет");
                }
            }
    }
    public static void task7 () {
        System.out.println("Задача № 7");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int one = in.nextInt();
        System.out.print("Введите первое число: ");
        int two = in.nextInt();
        System.out.print("Введите первое число: ");
        int three = in.nextInt();
        int x;
        if (one > two) {
            x=one;}
            else {x=two;
            }
        if (x>three)
        {
            System.out.println("Самое большее число: " + x);
        }
        else {
            System.out.println("Самое большее число: " + three);
        }
        }
    }
