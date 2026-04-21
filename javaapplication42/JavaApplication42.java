package javaapplication42;

import java.util.Scanner;

// Custom Exception
class AccountLockedException extends Exception {
    public AccountLockedException(String msg) {
        super(msg);
    }
}

public class JavaApplication42 {

    static int password = 1234;
    static int attempt = 3;

    public static void main(String[] args) throws AccountLockedException {
        login();
    }

    static void login() throws AccountLockedException {
        Scanner p = new Scanner(System.in);

        while (attempt > 0) {
            System.out.println("Enter your password:");
            int pa = p.nextInt();

            if (password == pa) {
                System.out.println("Unlocked ");
                return; 
            } 
            else {
              attempt--;
                System.out.println("Wrong password ");

                if (attempt > 0) 
                {
                    System.out.println("Remaining attempts: " + attempt);
                } else {
                    throw new AccountLockedException("Account Locked ");
                }
            }
        }
    }
}