/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradecalculator;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of Subjects :");
       int nSub=sc.nextInt();
       int score[]= new int[nSub];
       int total=0;
       
       for(int i=0;i<nSub;i++){
           System.out.println("Enter score of Subject "+(i+1)+":");
           score[i]=sc.nextInt();
           if(score[i]>=0 && score[i]<=100){
                System.out.println("Score in Subject "+(i+1)+":"+score[i]);
                total+=score[i];
           }
           else{
                System.out.println("Invalid! Score should be between 0 and 100 \n Re-Enter your Score.");
                i--;
               
           }
       }
       System.out.println("Your total score is :"+total);
       
       double avg;
       avg=total/nSub;
       System.out.println("Your overall percentage is :"+avg+"%");
       
       char grade;
       if (avg >= 70) {
            grade = 'A';
            System.out.println("Excellent work—you're setting the bar high!");
        } 
       else if (avg >= 60) {
            grade = 'B';
            System.out.println("Great job! You’re on the right track and doing well.");
        } 
       else if (avg >= 50) {
            grade = 'C';
            System.out.println("You’re making progress. With a bit more focus, you’ll do even better.");
        } 
       else if (avg >= 45) {
            grade = 'D';
            System.out.println("Not quite there yet, but persistence will get you where you want to be.");
        } 
       else if (avg >= 25) {
            grade = 'E';
            System.out.println("Hang in there! Time to hit the books and push for a stronger performance.");
        } 
       else {
            grade = 'F';
              System.out.println("Don’t be discouraged—use this as a stepping stone to rise higher.");
        }
      
      System.out.println("Your Grade is :"+grade);
        }
       
    }

    

