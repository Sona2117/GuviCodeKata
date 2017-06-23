
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class myswap {
    public static void main(String[] args){
        String str="vinay";
        StringBuilder ot=new StringBuilder();
        char[] ch=str.toCharArray();
       System.out.println(Arrays.toString(ch));
                                                                                                                
        for( int i=0; i<ch.length;i++){
             if(i%2==0){
                 if((i+1)<ch.length){
                     ot.append(ch[i+1]);
                     
                 }
                  ot.append(ch[i]);
             }
             
        }
         System.out.println(ot);
    }
}
