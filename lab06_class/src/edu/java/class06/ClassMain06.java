package edu.java.class06;

public class ClassMain06 {

    public static void main(String[] args) {
        Account account = new Account(1234567, 0);
        System.out.println("계좌번호 : " + account.accountNo);
        System.out.println("잔고 : " + account.balance + "원");

        account.deposit(10000);
        account.withdraw(2000);
        
        Account account2 = new Account(456789, 0);
        System.out.println("이체 성공 : " + account.transfer(account2, 5000));
        
        account.printAccountInfo();
        
    }

}
