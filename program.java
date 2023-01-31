package Sem_1;

import java.util.Scanner;
import java.util.Random;

public class program {
    public static void main(String[] args) {// Основной блок
        printhello("Введите длину числа: ");
        int length = scancount();
        int[] array = arrfill(length);
        printarr(array);
        printhello(arrfilter(array));
    }

    static void printhello(String s) {// Вывод в консоль
        System.out.println(s);
    }

    static int scancount() {// Считывание ввода
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        scanner.close();
        return data;
    }

    static int[] arrfill(int count) {// Заполнение массива
        int[] array = new int[count];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        return array;
    }

    static void printarr(int[] arr) {// Отображение массива
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    static String arrfilter(int[] oldarr) { // создание частотного словаря из массива
        String ustr = ""; // строка уникальных значений
        String uchar = ""; // уникальное значение
        String p = "\n\n"; // частотный словарь
        for (int i = 0; i < oldarr.length; i++) {
            int count = 0;
            uchar = Integer.toString(oldarr[i]);
            if (ustr.indexOf(uchar) == -1) {
                ustr = ustr + uchar;
                p = p + uchar;
                for (int j = 0; j < oldarr.length; j++) {
                    if (oldarr[j] == oldarr[i]) {
                        count++;
                    }
                }
                p = p + " - колличество повторений в строке: " + Integer.toString(count) + "\n";
            }
        }
        return p;
    }
}