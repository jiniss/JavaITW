package edu.java.modifier04;

/*
 * field: 아이디, 비밀번호
 * constructor: argument 2개를 갖는 생성자.
 * method: 아이디 getter, 비밀번호 getter/setter
 * 
 */
public class Member {
    private String id;
    private String password;
    
    //constructor
    Member (String id, String password) {
        //앞에 public 안붙이면 같은 패키지 내에서만 보임
        //다른 패키지에서는 import해도 안보여서 못씀
        this.id = id;
        this.password = password;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
