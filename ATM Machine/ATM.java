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
public class ATM {
    private double bal;
    private double withdraw;
    private double deposit;
    
    public ATM(){
        
    }
    public double getbal(){
        return bal;
    }
    public double withdraw(){
        return withdraw;
    }
        
    public double deposit(){
        return deposit;
    }

    public double setbalance(double bal) {
        this.bal=bal;
        return bal;
    }
    
}
