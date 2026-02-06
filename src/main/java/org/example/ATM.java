package org.example;

import java.util.Scanner;

public class ATM {
    private User client;
    private Scanner scanner = new Scanner(System.in);

    ATM(User client){
        this.client = client;
    }

    public void menu() {
        boolean isRunning = true;
        while(isRunning){
            messageMenu();
            int choice = scanner.nextInt();
            int respond;
            switch (choice){
                case(1):
                    System.out.println("your balance: " + client.getBalance());
                    break;
                case(2):
                    System.out.print("How much money do you want to deposit?: ");
                    respond = scanner.nextInt();
                    client.deposit(respond);
                    break;
                case(3):
                    System.out.print("How much money do you want to withdraw?: ");
                    respond = scanner.nextInt();
                    client.withdrawFunds(respond);
                    break;
                case(4):
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void messageMenu(){
        System.out.println("1. view balance.");
        System.out.println("2. Top up the account.");
        System.out.println("3. Withdraw money.");
        System.out.println("4. Go out.");
        System.out.print("your choice: ");
    }
}
