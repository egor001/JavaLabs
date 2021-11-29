package ru.mephi.lab5;

import java.io.File;
import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Exceptions {
    public static void main(String... args) {
        ArrayIndexOutOfBoundsException();
        FileNotFoundException();
        NullPointerException();
        IOException();
        ClassCastException();
        ArithmeticException();
        OutOfMemoryError();
        StackOverflowError();
    }

    public static void ArrayIndexOutOfBoundsException() {
        Integer[] list = {1, 2, 3};
        try {
            System.out.println(list[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("нет такого индекса");
        }
    }

    public static void FileNotFoundException() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/egord/Desktop/text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден!");
        }
    }

    public static void NullPointerException() {
        String temp = null;
        try {
            System.out.println(temp.length());
        } catch (NullPointerException e) {
            System.out.println("пустое значение!");
        }
    }

    public static void IOException() {
        File file = new File("text.txt");
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();

        } catch (IOException e) {
            System.out.println("проблемы с read");
        }
    }

    public static void ClassCastException() {
        try {
            Object a = 2;
            String b = (String) a;
        } catch (ClassCastException e) {
            System.out.println("попытка привести объект к классу, экземпляром которого он не является");
        }
    }

    public static void ArithmeticException() {
        try {
            int a, b, c;
            a = 1;
            b = 0;
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("нельзя делить на ноль");
        }
    }

    public static void OutOfMemoryError() {
        try {
            Integer[] list = new Integer[10000 * 100000];
        } catch (OutOfMemoryError e) {
            System.out.println("занял все место!!!");
        }
    }

    public static void Temp(Integer a) {
        if (a != 0) {
            Temp(a++);
        } else {
            return;
        }
    }

    public static void StackOverflowError() {
        try {
            int a = 1;
            Temp(a);
        } catch (StackOverflowError e) {
            System.out.println("бесконечный цикл!!!");
        }
    }
}
