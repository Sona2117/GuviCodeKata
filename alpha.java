import java.util.Scanner;
public class alpha{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character to be checked");
		char ch=s.next().charAt(0);
		int ascii = ch;
		if((ascii>=65)&&(ascii<=90)){
			System.out.println("It is an Alphabet");
		}
		else if((ascii>=97)&&(ascii<=122)){
			System.out.println("It is an Alphabet");
		}
		else
		{
			System.out.println("It is not an Alphabet");
		}
	}
}
