/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;
/**
 *
 * @author admin
 */
import java.util.Scanner;

public class fact {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
        int fact=1;
        for(int i = 1;i <= num;i++){
            fact=fact*i;           
        }
       System.out.println(fact);
    }
}
