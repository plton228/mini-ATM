package org.example;

public class User {
    private int balance;

    User(int balance){
        if(balance < 0){
            System.out.println("There cannot be a client with a negative balance!");
            this.balance = 0;
        }else
            this.balance = balance;
    }

    User(){
        this.balance = 1000;
    }

    public int getBalance(){ return this.balance; }

    public void deposit(int amount){
        if(amount >= 0){
            this.balance += amount;
            System.out.println("now your balance is: " + this.balance);
        } else {
            System.out.println("it is impossible to put less than 0");
        }
    }

    public void withdrawFunds(int amount){
        if(amount > 0){
            if(this.balance >= amount){
                this.balance -= amount;
                System.out.println("now your balance is:" + this.balance);
            } else
                System.out.println("insufficient funds");
        }else
            System.out.println("it is impossible to withdraw less than 0");
    }

}
