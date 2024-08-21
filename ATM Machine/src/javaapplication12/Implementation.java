/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Lenovo
 */
public class Implementation implements Operation {
    ATM atm=new ATM();

    @Override
    public void viewbal() {
        System.out.println("Available Balance is :"+atm.getbal());
    }

    @Override
    public void depositamt(double deposit) {
        System.out.println("Your amount "+deposit+" has been successfully deposited. ");
        atm.setbalance(atm.getbal()+deposit);
    }

    @Override
    public void withdrawamt(double withdraw) {
       
       if(withdraw<= atm.getbal()){
        System.out.println(withdraw + " withdrawn successfuly ");
        atm.setbalance(atm.getbal()-withdraw);
        viewbal();
    }
       else{
           System.out.println("Insufficient Balance.\n");
       }
    }
        
    }
    
