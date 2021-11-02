package ru.mephi.lab3;

import java.util.*;

import ru.mephi.lab3.Accountant;

public class Employee {
    public enum Gender {MALE, FEMALE}

    ;
    //enum Role{STAFF,MANAGER,EXECUTIVE};
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private String dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;//код области

    public String getDept() {
        return this.dept;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Role getRole() {
        return this.role;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getSurName() {
        return this.surName;
    }

    public int getAge() {
        return this.age;
    }

    public void setGivenName(String temp) {
        this.givenName = temp;
    }

    public void setSurName(String temp) {
        this.surName = temp;
    }

    public void setAge(int temp) {
        this.age = temp;
    }

    public void setRole(Role temp) {
        this.role = temp;
    }

    public void setGender(Gender temp) {
        this.gender = temp;
    }

    public void setDept(String temp) {
        this.dept = temp;
    }

    public String toString() {
        return "Employee{" +
                "givenName= '" + givenName + '\'' +
                ",surName= '" + surName + '\'' +
                ",age= '" + age + '\'' +
                ",gender= '" + gender + '\'' +
                ",role= '" + role + '\'' +
                ",dept= '" + dept + '\'' +
                ",eMail= '" + eMail + '\'' +
                ",phone= '" + phone + '\'' +
                ",address= '" + address + '\'' +
                ",city= '" + city + '\'' +
                ",state= '" + state + '\'' +
                ",code= '" + code + '\'' + "}";
    }

    public static class Builder {
        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private Role role;
        private String dept;
        private String eMail;
        private String phone;
        private String address;
        private String city;
        private String state;
        private String code;

        public Builder setGivenName(String temp) {
            this.givenName = temp;
            return this;
        }

        public Builder setSurName(String temp) {
            this.surName = temp;
            return this;
        }

        public Builder setAge(int temp) {
            this.age = temp;
            return this;
        }

        public Builder setGender(Gender temp) {
            this.gender = temp;
            return this;
        }

        public Builder setRole(Role temp) {
            this.role = temp;
            return this;
        }

        public Builder setDept(String temp) {
            this.dept = temp;
            return this;
        }

        public Builder setEMail(String temp) {
            this.eMail = temp;
            return this;
        }

        public Builder setPhone(String temp) {
            this.phone = temp;
            return this;
        }

        public Builder setAddress(String temp) {
            this.address = temp;
            return this;
        }

        public Builder setCiy(String temp) {
            this.city = temp;
            return this;
        }

        public Builder setState(String temp) {
            this.state = temp;
            return this;
        }

        public Builder setCode(String temp) {
            this.code = temp;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.givenName = this.givenName;
            employee.surName = this.surName;
            employee.age = this.age;
            employee.gender = this.gender;
            employee.role = this.role;
            employee.dept = this.dept;
            employee.eMail = this.eMail;
            employee.phone = this.phone;
            employee.address = this.address;
            employee.city = this.city;
            employee.state = this.state;
            employee.code = this.code;
            return employee;
        }
    }

    public static List<Employee> createShortList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Builder()
                .setGivenName("Artem")
                .setSurName("Artemov")
                .setAge(20)
                .setGender(Gender.MALE)
                .setRole(Role.STAFF)
                .setDept("Sales")
                .setEMail("xxx@mail.ru")
                .setPhone("88888888")
                .setAddress("Red Square")
                .setCiy("Moscow")
                .setState("Moscow")
                .setCode("77")
                .build());
        list.add(new Builder()
                .setGivenName("Ivan")
                .setSurName("Ivanov")
                .setAge(33)
                .setGender(Gender.MALE)
                .setRole(Role.EXECUTIVE)
                .setDept("Sales")
                .setEMail("ttt@gmail.com")
                .setPhone("12345678")
                .setAddress("first street")
                .setCiy("Kolomna")
                .setState("near Moscow")
                .setCode("11")
                .build());
        list.add(new Builder()
                .setGivenName("Elena")
                .setSurName("Lenova")
                .setAge(66)
                .setGender(Gender.FEMALE)
                .setRole(Role.MANAGER)
                .setDept("Programming")
                .setEMail("111@yandex.ru")
                .setPhone("333333333")
                .setAddress("Nevsky prospekt, 33")
                .setCiy("St.Peterburg")
                .setState("St.Peterburg")
                .setCode("88")
                .build());
        list.add(new Builder()
                .setGivenName("Vika")
                .setSurName("Vikova")
                .setAge(100)
                .setGender(Gender.FEMALE)
                .setRole(Role.STAFF)
                .setDept("accounting")
                .setEMail("007@mail.ru")
                .setPhone("555555555")
                .setAddress("Lenin street, 1")
                .setCiy("Ufa")
                .setState("ashkortostan resp.")
                .setCode("11")
                .build());
        list.add(new Builder()
                .setGivenName("Kiril")
                .setSurName("Kirilov")
                .setAge(35)
                .setGender(Gender.MALE)
                .setRole(Role.MANAGER)
                .setDept("Sales")
                .setEMail("egg@gmail.com")
                .setPhone("30000")
                .setAddress("Groov street, 5")
                .setCiy("Sochi")
                .setState("Sochi")
                .setCode("99")
                .build());
        list.add(new Builder()
                .setGivenName("Egor")
                .setSurName("Egorov")
                .setAge(29)
                .setGender(Gender.MALE)
                .setRole(Role.EXECUTIVE)
                .setDept("accounting")
                .setEMail("555@mail.ru")
                .setPhone("87654321")
                .setAddress("Main prospect, 20")
                .setCiy("Moscow")
                .setState("Moscow")
                .setCode("77")
                .build());
        list.add(new Builder()
                .setGivenName("Masha")
                .setSurName("Popova")
                .setAge(44)
                .setGender(Gender.FEMALE)
                .setRole(Role.MANAGER)
                .setDept("Programming")
                .setEMail("xyz@yandex.ru")
                .setPhone("34343434")
                .setAddress("Mephi")
                .setCiy("Obninsk")
                .setState("near Moscow")
                .setCode("11")
                .build());
        return list;
    }

    public static void main(String... args) {
        List<Employee> newList = Employee.createShortList();
        System.out.println("премии женщинам сотрудникам:");
        newList.stream()
                .filter(p -> p.getGender() == Gender.FEMALE)
                .forEach(p -> Accountant.payPremium(p));
        //newList = Employee.createShortList();
        System.out.println("зарплата сотрудникам отдела продаж:");
        newList.stream()
                .filter(p -> p.getDept().equals("Sales"))
                .forEach(p -> Accountant.paySalary(p));
        //newList = Employee.createShortList();
        System.out.println("премии сотрудникам отдела бугалтерии старше 30:");
        newList.stream()
                .filter(p -> p.getDept().equals("accounting") && p.getAge() > 30)
                .forEach(p -> Accountant.payPremium(p));
        //newList = Employee.createShortList();
        System.out.println("зарплаты менеджерам:");
        newList.stream()
                .filter(p -> p.getRole().equals(Role.MANAGER))
                .forEach(p -> Accountant.paySalary(p));
        //newList = Employee.createShortList();
        System.out.println("премии стаффа:");
        newList.stream()
                .filter(p -> p.getRole().equals(Role.STAFF))
                .forEach(p -> Accountant.payPremium(p));

    }
}
