import java.util.Scanner;

public class Number{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=s.nextInt();
		if(num>0)
		{
			System.out.println("Given Number is Positive");
			
		}
		else if(num<0)
		{
			System.out.println("Given Number is Negative");
			
		}
		else
		{
			System.out.println("Given Number is Zero");
			
		}
	}
}
