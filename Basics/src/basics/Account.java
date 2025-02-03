package basics;

public class Account {
    private int number ;
    private int balance ;
    private String name ;
    private String email ;
    private int phoneNumber ;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount){
        this.balance += amount ;
        System.out.println("balance : "+ this.balance);
    }

    public void withdraw(int amount){
        if ( amount > this.balance ) {
            System.out.println("insufficient founds !");
        } else {
            this.balance -= amount ;
        }

        System.out.println("balance : "+ this.balance );
    }
}