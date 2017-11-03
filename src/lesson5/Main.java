package lesson5;

import java.util.Arrays;

public class Main {
    static public void main(String[] arg){
        Customer customer = new Customer();
        Banker banker = new Banker();
        System.out.println(customer.deposit(banker, Currency.Won, q:20))
        System.out.println(customer.deposit(banker, Currency.Won, q:200))

        Employee me= new Employee(salary; 100), you = new Employee(salary; 200);
        System.out.println(me.compareTo(you));
        System.out.println(Comparable.compare(you,me));

        Employee[] employees = {me,you};
        Arrays.sort(employees);
        System.out.println(employees[0] == you);
    }
}
