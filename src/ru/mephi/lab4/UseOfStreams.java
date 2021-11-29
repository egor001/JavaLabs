package ru.mephi.lab4;

import ru.mephi.lab3.*;

import java.util.List;
import java.util.Optional;

public class UseOfStreams {
    public static void main(String... args) {
        List<Employee> newList = Employee.createShortList();
        System.out.println("Пример работы map:");
        newList.stream()
                .map(p -> p.getGivenName() + " : salary :" + p.getSalary())
                .forEach(p -> System.out.println(p));
        newList.stream()
                .map(p -> p.getRole() + " : " + p.getAge())
                .forEach(p -> System.out.println(p));

        System.out.println("Пример работы peek:");
        newList.stream()
                .peek(p -> System.out.println("new salary: " + p.getSalary() / 2))
                .forEach(p -> System.out.println(p.getGivenName()));
        newList.stream()
                .filter(p -> p.getAge() > 30)
                .peek(p -> System.out.println(p.getGivenName() + " is older then 30"))
                .forEach(System.out::println);
        System.out.println("Пример работы findFirst:");
        System.out.println(newList.stream().findFirst());

        System.out.println(newList.stream().filter(p -> p.getSalary() > 100000).findFirst());

        System.out.println("Пример работы lazy:");
        newList.stream()
                .filter(p -> p.getAge() > 40)
                .peek(p -> System.out.println(p.getGivenName() + " :old people"))
                .filter(p -> p.getSalary() > 50000)
                .peek(p -> System.out.println(p.getGivenName() + " :rich old people"))
                .forEach(System.out::println);

        newList.stream()
                .filter(p -> p.getGender().equals(Employee.Gender.MALE))
                .peek(p -> System.out.println(p.getGivenName() + " :man"))
                .filter(p -> p.getSalary() > 50000)
                .peek(p -> System.out.println(p.getGivenName() + " :rich man"))
                .forEach(System.out::println);
        System.out.println("Пример работы max:");
        System.out.println(newList.stream()
                .mapToInt(p -> p.getAge())
                .max()
                .getAsInt());
        System.out.println(newList.stream()
                .mapToInt(p -> p.getSalary())
                .max()
                .getAsInt());

        System.out.println("Пример работы min:");
        System.out.println(newList.stream()
                .mapToInt(p -> p.getAge())
                .min()
                .getAsInt());
        System.out.println(newList.stream()
                .mapToInt(p -> p.getSalary())
                .min()
                .getAsInt());
        System.out.println("Пример работы sum:");
        System.out.println(newList.stream()
                .mapToInt(p -> p.getAge())
                .sum());
        System.out.println(newList.stream()
                .mapToInt(p -> p.getSalary())
                .sum());
        System.out.println("Пример работы average:");
        System.out.println(newList.stream()
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble());
        System.out.println(newList.stream()
                .mapToInt(p -> p.getSalary())
                .average()
                .getAsDouble());
    }

}
