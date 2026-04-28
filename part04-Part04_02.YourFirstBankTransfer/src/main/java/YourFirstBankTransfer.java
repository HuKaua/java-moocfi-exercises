
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account matthew = new Account("matthew", 100);
        Account mine = new Account("myself", 0);
        matthew.withdrawal(100.0);
        mine.deposit(100.0);
        System.out.println(matthew.balance());
        System.out.println(mine.balance());

    }



}
