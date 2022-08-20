/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Admin
 */
public class Bill {
    
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;
         
    
    public double feeding(){
        return (5.00 * beer) + (3.00 * softDrink) + (7.00 * barbecue);
    }
    
      public double cover(){
        if (feeding() <= 30){
            return 4.00;
        }else{
            return 0.00;
        }
    }
        
    public double ticket(){  
        if (gender == 'F'){
            return 8.00;
        }else if (gender == 'M'){
            return 10.00;
        }else{
            return 0.0;
        }
    } 
    
    public double total(){
        return feeding() + cover() + ticket();
    }
    
}
