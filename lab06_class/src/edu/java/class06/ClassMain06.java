package edu.java.class06;

public class ClassMain06 {

    public static void main(String[] args) {
        Account account1 = new Account(1234567, 1000);
        System.out.println(account1);
//        System.out.println("계좌번호 : " + account1.accountNo);
//        System.out.println("잔고 : " + account1.balance + "원");
        account1.printAccountInfo();

        double money = account1.deposit(10000);  //입금
        System.out.println(money);
        account1.printAccountInfo();
//        System.out.println("입금 후 잔고 : " + account1.deposit(10000) + "원");
//        System.out.println("출금 후 잔고 : " + account1.withdraw(2000) + "원");
        
        money = account1.withdraw(5000);  //출금
        System.out.println(money);
        
        //이체할 계좌 생성  
        Account account2 = new Account(456789, 1000);
        account2.printAccountInfo();
        
        //account1에서 account2으로 5,000원을 이체
        account1.transfer(account2, 5000);
        
        account1.printAccountInfo();
        account2.printAccountInfo();
        
    }

}
