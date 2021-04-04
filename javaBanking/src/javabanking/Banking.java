/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabanking;

import java.util.Scanner;

/**
 *
 * @author rifatbhuiyan
 */
public class Banking {
    
    private int id;
    private double balance;
    private double previous;
    private String name;
    

  public Banking(int id, String name){
    this.id = id;
    this.name= name;
    choice();
    
}
  
  
  public void view(){
      System.out.println("Current Blance:$ "+ balance);
  }
  
  public void add(double money){
     balance = balance + money;
     
  }
  
  
  

 

  public void choice(){
      System.out.println("Name:" + name);
      System.out.println("======================================");
      System.out.println("======================================");
      System.out.println("======================================");
      System.out.println("Option B for the  Add Money");
      System.out.println("-----------------------------");
      System.out.println("Option C for Withdraw Money");
      System.out.println("-----------------------------");
      System.out.println("Option D for Previous Blance");
      System.out.println("-----------------------------");
      
      
      
  
      
   
        
       
    
    
     Scanner kb = new Scanner(System.in);
  String Option;
   do{
      
   Option = kb.next();
   switch(Option){
      case "A": 
           view();
           break;
       
       
       case "B": 
           System.out.println("How much money to add On the account:");
           add(kb.nextDouble());
       break;
       
       
    
       
       
       
   }
    
   
    }while(Option !="F");
       
    
    
    
    
    
    
      
      
      
      
      
  }  
  
  
  
  
  
  
    
    
    
    public String getName(){
        
        return name;
        
    }
    
    
    
    
    
}
