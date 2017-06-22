import java.util.Scanner;
public class leap{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		if(year%4==0)
		{
			System.out.println("Given year is LeapYear");
		}
		else
		{
			System.out.println("It is not a LeapYear");
		}
	}
}
