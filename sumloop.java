import java.util.Scanner;
public class sumloop{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int num=s.nextInt();
		int sum=0;
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		{
			int num1=s.nextInt();
			sum=sum+num1;
		}
		System.out.println("Sum of the elements is" +sum);
	}
}
		
