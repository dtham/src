/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se350;


public class Price{
    
    public long P; 
    public long market_price; 
    
    public void Price(long value){
       //price check
        if(value == 0 || value == mprice) //check marketprice
        {
            System.out.println("Invalid Price Operation");
        }
        else
        {
            P = value;
        }
    }
    
    public void Price(){
        market_price = mprice; //check
    }
           
    public long add(long p){
        long p_val = p + P;
        return p_val;
    }
    
    public long subtract(long p){
        long p_val = P - p; 
        return p_val;
    }
    
    public long multiply(long p){
        long p_val = P * p;
        return p_val;
    }
    
    public int compareTo(long p){
        
    }
}
