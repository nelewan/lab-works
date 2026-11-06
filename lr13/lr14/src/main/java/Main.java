import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void task1() {
        String fileName = "profession.txt";
        String info = "Профессия: Java Software Engineer\n"
                + "Обязанности: разработка серверной логики, работа с базами данных.\n"
                + "Ключевые навыки: Java Core, Spring Boot, SQL, Git.";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(info);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(fileName);
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Чтение: " + file.canRead());
        System.out.println("Запись: " + file.canWrite());

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task2(Scanner scanner) {
        String fileName = "f_task2.txt";

        System.out.println("Введите 10 целых чисел:");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                writer.write(scanner.nextInt() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = new ArrayList<>();
        double sum = 0;
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextInt()) {
                int val = fileReader.nextInt();
                numbers.add(val);
                sum += val;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Числа: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        double avg = sum / numbers.size();
        System.out.println("Среднее арифметическое: " + avg);

        int count = 0;
        for (int n : numbers) {
            if (n > avg) {
                count++;
            }
        }
        System.out.println("Чисел больше среднего: " + count);
    }

    public static void task3() {
        String fileF = "f_task3.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        Random rnd = new Random();
        try (FileWriter writer = new FileWriter(fileF)) {
            for (int i = 0; i < 20; i++) {
                writer.write((rnd.nextInt(2000) + 1) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner reader = new Scanner(new File(fileF));
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            while (reader.hasNextInt()) {
                int val = reader.nextInt();
                int abs = Math.abs(val);
                if (abs >= 100 && abs <= 999) {
                    writerG.write(val + " ");
                } else {
                    writerH.write(val + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task4(Scanner scanner) {
        String fileName = "weights.txt";

        System.out.println("Введите 12 значений массы:");
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 12; i++) {
                writer.write(scanner.nextDouble() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextDouble()) {
                sum += fileReader.nextDouble();
                count++;
            }
            if (count > 0) {
                System.out.println("Средняя масса: " + (sum / count));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task5() {
        String fileName = "f_task5.txt";
        int[] data = {15, 23, 105, 40, 75, 88, 95, 12, 5, 200};

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int val : data) {
                writer.write(val + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextInt()) {
                if (Math.abs(fileReader.nextInt()) % 10 == 5) {
                    count++;
                }
            }
            System.out.println("Оканчиваются на 5: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1();
        task2(scanner);
        task3();
        task4(scanner);
        task5();

        scanner.close();
    }
}