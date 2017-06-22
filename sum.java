import java.util.Scanner;
public class sum{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int i=1;
		int sum=0;
		while(i<=num)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println("The sum of Natural number is" + sum);
	}
}
