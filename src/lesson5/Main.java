package lesson5;

public class Main {
    static public void main(String[] arg){
        Customer customer = new Customer();
        Banker banker = new Banker();
        System.out.println(customer.deposit(banker, Currency.Won, q:20))
        System.out.println(customer.deposit(banker, Currency.Won, q:200))
    }
}
