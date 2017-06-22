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
public class reverse {
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int num=s.nextInt();
        System.out.println("The Given Integer is \n" +num);
        int rev=0;
        while(num>0){
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println("Reverse of an Integer is" +rev);
    }
}
