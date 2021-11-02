package ru.mephi.hw3;

import ru.mephi.lab3.*;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Interface {
    public static void main(String... args) {
        List<Employee> myList = Employee.createShortList();
        Consumer<Employee> workersConsumer = p ->
                System.out.println("имя: " + p.getGivenName() + ", фамилия: " + p.getSurName());
        System.out.println("Пример работы Consumer:");
        myList.stream()
                .forEach(workersConsumer);

        System.out.println("Пример работы Function:");
        Function<Employee, Role> workersRole = p -> p.getRole();

        for (Employee t : myList) {
            System.out.println(t.getGivenName() + " является " + workersRole.apply(t));
        }
        Supplier<Employee> addSupplier =
                () -> new Employee.Builder()
                        .setGivenName("John")
                        .setSurName("Dir")
                        .setAge(45)
                        .setGender(Employee.Gender.MALE)
                        .setRole(Role.MANAGER)
                        .setDept("None")
                        .setEMail("None")
                        .setPhone("None")
                        .setAddress("None")
                        .setCiy("None")
                        .setCode("None")
                        .setState("None")
                        .build();

        System.out.println("Пример работы Supplier:");
        myList.add(addSupplier.get());
        myList.stream()
                .forEach(p -> System.out.println(p.toString()));

        BiPredicate<Employee, Role> countStaff = (p, t) -> p.getRole().equals(t);

        System.out.println("Пример работы BiPredicate:");
        int count = 0;
        for (Employee temp : myList) {
            if (countStaff.test(temp, Role.STAFF)) {
                count++;
            }
        }
        System.out.println("количество staff:" + count);

    }


}
