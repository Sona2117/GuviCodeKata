/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class holiday {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the day");
        String day=s.next();
        if(day.equalsIgnoreCase("sunday"))
        {
            System.out.println("Its Holiday");  
            System.out.println("false");
        }
        else
        {
            System.out.println("Its working Day");  
            System.out.println("true");
        }
          
    }
}

