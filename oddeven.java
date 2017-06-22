/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 8*/
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class even  {
 
        public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
               System.out.println("Enter the range");
               int r1=s.nextInt();
                int r2=s.nextInt();
                for(int i=r1; i < r2; i++)
                {
                        if( i % 2 != 0)
                        {
                                System.out.print(i + " ");
                        }
                }
        }
}
