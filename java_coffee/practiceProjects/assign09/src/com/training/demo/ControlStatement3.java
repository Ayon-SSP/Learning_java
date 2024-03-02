package com.training.demo;

/*
 * 03. Simulate a simple ATM program using a loop that allows the user to withdraw money (within their account limit) until they choose to exit.
 */
public class ControlStatement3 {

    public static void main(String[] args) {
        double accbalance = 10000;

        while (true) {
            System.out.println("press 1 to check balance");
            System.out.println("press 2 to withdraw");
            System.out.println("press 3 to exit");
            System.out.println("enter choice on 1, 2, 3");
            int choice = Integer.parseInt(args[0]);
            switch (choice) {
                case 1:
                    System.out.println("currentbalance" + accbalance);
                    break;
                case 2:
                    System.out.println("enter withdral amount");
                    double withdrawamount = Integer.parseInt(args[1]);

                    if (withdrawamount > 0 && withdrawamount <= accbalance) {
                        accbalance -= withdrawamount;
                        System.out.println("remaining balance" + accbalance);
                    } else {
                        System.out.println("insufficient balance");
                    }
                    break;

                case 3:
                    System.out.println("you entered exit");
                    break;
                default:
                    System.out.println("invalid choice");
            }
            break;
        }
    }
}
