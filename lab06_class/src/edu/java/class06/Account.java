package edu.java.class06;

/**
 * 은행 계좌 정보 클래스.
 * 계좌번호, 잔액을 필드로 갖고, 입금, 출금, 이체, 정보 출력 기능을 메서드로 갖음.
 */
public class Account {

    // field
    int accountNo; // 계좌번호
    double balance; // 잔고

    // constructor - argument 2개를 갖는 생성자.
    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

        
    /**
    * 입금(deposit)     
    *  
    * @param amount 입금액
    * @return 입금 후 잔액을 리턴.
    */    
    
    public void deposit(double amount) {
        System.out.println("입금 후 잔고 : " + (this.balance += amount) + "원");    
    }
    
    
    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액
     * @return 출금 후 잔액을 리턴.
     */
        
    public void withdraw(double amount) {
        System.out.println("출금 후 잔고 : " + (this.balance -= amount) + "원"); 
    }
    

    /**
     * 이체(transfer)
     * 
     * @param to 이체할 계좌 객체(Account 타입)
     * @param amount 이체할 금액
     * @return true(이체 성공). 
     */
    
    public boolean transfer(Account account2, double amount) {
        account2 = new Account(account2.accountNo, account2.balance);
        this.balance -= amount;
        account2.balance += amount;
        return true; 
    }


    /**
     * 계좌 정보 출력(printAccountInfo). 계좌 번호와 잔액을 출력.
     */
    
    public void printAccountInfo() {
        System.out.println("--------계좌 정보--------");
        System.out.println("계좌번호 : " + this.accountNo);
        System.out.println("잔액 : " + this.balance + "원");
    }
    
    
}
