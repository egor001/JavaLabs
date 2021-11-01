package ru.mephi.lab3;

public class Accountant {
    public static void paySalary(Employee employee){
        System.out.println("Salary paid to:" + employee.getGivenName()+" "+employee.getSurName());
    }
    public static void payPremium(Employee employee){
        System.out.println("Premium paid "+employee.getRole().getRole()+" :"+ employee.getGivenName()+" "+employee.getSurName());
    }
}
