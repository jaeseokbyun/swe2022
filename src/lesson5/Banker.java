package lesson5;

public class Banker {
    public boolean requestDepostit(DepositRequest req) {
        Account account = req.getDepositAccount()
        if(!account.isDepositable()) return false;
        Money money= req.getMoney();
        if (Banker.isMinimum_limit(money)) return false;
        return true
        //this가 들어가면 method의 의미를 갖지만, 현재 this 필요 x
    }
    public static final  Money MINIMUM=new Money(Currency.Won,100);
    private static boolean isMinimum_limit(Money money) {
        return money.getMoney(Currency.Won)<MINIMUM.getMoney(Currency.Won);
    }
}
