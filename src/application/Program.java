/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Bill;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        
        System.out.print("Gender: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantity of Beer: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantity of SoftDrink: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantity of Barbecue: ");
        bill.barbecue = sc.nextInt();
        
        System.out.println();
        System.out.println("REPORT:");
        System.out.printf("Feeding = R$ %.2f%n", bill.feeding());
        
         if (bill.feeding() > 30){
             System.out.println("Coverage exempt");
         }else{
             System.out.printf("Cover = R$ %.2f%n", bill.cover());
         }
        
        System.out.printf("Ticket = R$ %.2f%n", bill.ticket());
        
        System.out.println();
        System.out.printf("Total Value = R$ %.2f%n", bill.total());
        
        sc.close();
        
    }
    
}
