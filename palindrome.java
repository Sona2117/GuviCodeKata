import java.util.Scanner;

public class palindrome {
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Integer");
        int num=s.nextInt();
        int num1=num;
        System.out.println("The Given Integer is \n" +num);
        int rev=0;
        while(num>0){
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println("Reverse of an Integer is\n" +rev);
        if(num1==rev)
        {
          System.out.println("It is Palindrome") ; 
        }
        else{
             System.out.println("It is not a Palindrome") ; 
        }
    }
     
}

