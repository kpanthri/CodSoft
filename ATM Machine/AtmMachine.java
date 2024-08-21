/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AtmMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operation op=new Implementation(); // Here, Operation is an inner class that is being used in Implemetation(i.e. Outer class)..and its object is created in the main function.
        int pin=1405;
        System.out.println("Welcome to the ATM ");
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Pin Number ");
         int pinNum=sc.nextInt();
         
         if(pin==pinNum){
             while(true){
                 int choice;
                  System.out.println("1.Check your balance.\n2.Deposit Amount.\n3.Withdraw Amount.\n4.Exit");
                   System.out.println("Select the option from the menu");
                   choice=sc.nextInt();
                 switch(choice){
                     case 1:
                     {
                         op.viewbal();
                         break;
                     }
                     case 2:
                             {
                                  System.out.print("Enter the amount to be deposited. ");
                                  double deposit=sc.nextDouble();
                                  op.depositamt(deposit);
                                  break;
                             }
                     case 3:
                     {
                         System.out.print("Enter the amount to be Withdrawn: ");
                     double withdraw = sc.nextDouble();
                     op.withdrawamt(withdraw);
                     break;                 
                     }
                     case 4:
                     {
                         System.out.print(" You can collect your card.\n Thank you for banking with us. ");
                         System.exit(0);
                     }
                 }
             }
         }
         else{
             System.out.println("Invalid Credentials");
         }
        
    }
    
}
