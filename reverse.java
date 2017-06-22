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
public class one {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.next();
        System.out.println("The String is \n" +str);
        System.out.println(reverseString(str));
    }


public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
} 
} 
