import java.util.Scanner;
public class digit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num=s.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println("No of Digit is" + count);
	}
}
