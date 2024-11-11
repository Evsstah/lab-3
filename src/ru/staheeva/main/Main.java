package ru.staheeva.main;

import ru.staheeva.bird.Cuckoo;
import ru.staheeva.bird.Parrot;
import ru.staheeva.bird.Sparrow;
import ru.staheeva.employee.Employee;
import ru.staheeva.geometry.PointZ;
import ru.staheeva.time.Time;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1.2
        try {
            System.out.println("\nЗадача 1.2:");
            System.out.println("Введите время в секундах, чтобы получить число часов, минут(с начала часа), секунд(с начала минуты): ");
            int hour2Input = getInputTime(scanner);
            int minute2Input = getInputTime(scanner);
            int sec2Input = getInputTime(scanner);

            Time timeH = new Time(hour2Input);
            Time timeM = new Time(minute2Input);
            Time timeS = new Time(sec2Input);

            System.out.println("\nТекстовая форма введенного времени:");
            System.out.println("Часы: " + timeH);
            System.out.println("Минуты: " + timeM);
            System.out.println("Секунды: " + timeS);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задача 1.11
        try {
            System.out.println("\nЗадача 1.11:");

            System.out.println("Введите фамилию 1 сотрудника:");
            String nameEmployee = getInputName(scanner);

            System.out.println("Введите отдел:");
            String departmentName = getInputName(scanner);

            System.out.println("Введите фамилию начальника:");
            String nameChief = getInputName(scanner);

            System.out.println("Введите отдел:");
            String departmentNameChief = getInputName(scanner);

            Employee employee = new Employee(nameEmployee, departmentName);
            Employee chief = new Employee(nameChief, departmentNameChief);

            // Устанавливаю начальника отдела
            chief.setChief(chief);
            employee.setChief(chief);

            // Вывод информации о сотрудниках
            System.out.println("Новый отдел с сотрудниками: ");
            System.out.println(employee);
            System.out.println(chief);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Задание 3.5
        System.out.println("\nЗадача 3.5:");

        // Ввод координат первой точки
        System.out.print("Введите координату X для первой точки: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите координату Y для первой точки: ");
        int y1 = scanner.nextInt();
        System.out.print("Введите координату Z для первой точки: ");
        int z1 = scanner.nextInt();

        PointZ point1 = new PointZ(x1, y1, z1);

        // Ввод координат второй точки
        System.out.print("Введите координату X для второй точки: ");
        int x2 = scanner.nextInt();
        System.out.print("Введите координату Y для второй точки: ");
        int y2 = scanner.nextInt();
        System.out.print("Введите координату Z для второй точки: ");
        int z2 = scanner.nextInt();

        PointZ point2 = new PointZ(x2, y2, z2);

        // Ввод координат третьей точки
        System.out.print("Введите координату X для третьей точки: ");
        int x3 = scanner.nextInt();
        System.out.print("Введите координату Y для третьей точки: ");
        int y3 = scanner.nextInt();
        System.out.print("Введите координату Z для третьей точки: ");
        int z3 = scanner.nextInt();

        PointZ point3 = new PointZ(x3, y3, z3);

        // Вывод полученных точек
        System.out.println("\nПолучившиеся точки:");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);


        // Задача 4.3
        System.out.println("\nЗадача 4.3:");
        Sparrow sparrow = new Sparrow();
        Cuckoo cuckoo = new Cuckoo();
        Parrot parrot = new Parrot("Привет!");

        // Вызываем метод sing() для каждой птицы
        System.out.println("Воробей поет:");
        sparrow.sing();
        System.out.println();

        System.out.println("Кукушка поет:");
        cuckoo.sing();
        System.out.println();

        System.out.println("Попугай поет:");
        parrot.sing();
        System.out.println();

        
        // Задача 6.2
        System.out.println("\nЗадача 6.2:");

        // Ввод координат первой точки
        System.out.print("Введите координату X для первой точки: ");
        int x_1 = scanner.nextInt();
        System.out.print("Введите координату Y для первой точки: ");
        int y_1 = scanner.nextInt();
        System.out.print("Введите координату Z для первой точки: ");
        int z_1 = scanner.nextInt();

        PointZ point_1 = new PointZ(x_1, y_1, z_1);

        // Ввод координат второй точки
        System.out.print("\nВведите координату X для второй точки: ");
        int x_2 = scanner.nextInt();
        System.out.print("Введите координату Y для второй точки: ");
        int y_2 = scanner.nextInt();
        System.out.print("Введите координату Z для второй точки: ");
        int z_2 = scanner.nextInt();

        PointZ point_2 = new PointZ(x_2, y_2, z_2);

        // Вывод полученных точек
        System.out.println("\nПолучившиеся точки:");
        System.out.println(point_1);
        System.out.println(point_2);

        // Сравнение точек
        boolean isEqual = point_1.equals(point_2);
        System.out.println("\nСравнение точек:");
        System.out.println("Равна ли точка " + point_1 + " точке " + point_2 + "?: " + isEqual);
        
    }


    // Проверка для задания 1.11
    private static String getInputName(Scanner scanner) {
        String input = scanner.nextLine();
        while (!input.matches("[a-zA-Zа-яА-Я]*")) {
            System.out.println("Ошибка: Введите строку.");
            input = scanner.nextLine();
        }
        return input;
    }

    // Проверка для задания 1.2
    private static int getInputTime(Scanner scanner) {
        int input = scanner.nextInt();
        scanner.nextLine();
        while (input < 0) {
            System.out.println("Ошибка: Введите положительное число.");
            System.out.println("Введите количество секунд: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        return input;
    }
}
