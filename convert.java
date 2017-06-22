
package player;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class sample {
     public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      System.out.println("Enter two Strings");
      String str=s.next();
      String str1=s.next();
      String str2=str+str1;
      System.out.println("Addition of two Strings" +str2);
      int n=Integer.parseInt(str);
      int n1=Integer.parseInt(str1);
      int n2=n+n1;
      System.out.println("Addition of teo Strings After converting String into Integer" +n2);
        }         
    }


