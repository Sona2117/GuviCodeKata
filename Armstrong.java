
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class armstrong {  
  public static void main(String[] args)  {  
     
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the range");
    int num=s.nextInt();
    int c=0,a,temp; 
   
    temp=num;  
    while(num!=0)  
    {  
    a=num%10;  
    num=num/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  {
    System.out.println("It is an armstrong number");
    }
    else  {
        System.out.println("Not an armstrong number");   
    }
   }  
} 

