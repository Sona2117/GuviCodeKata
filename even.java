import java.util.Scanner;

public class even{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("The Given Number is Even");			
		}
		else
		{
			System.out.println("The Given Number is Odd");			
		}
	}
}
		
