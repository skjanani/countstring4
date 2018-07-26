package janani;
import java.util.Scanner;
public class Countstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int a,l;
		System.out.println("enter the string");
		Scanner in=new Scanner(System.in);
		 str=in.nextLine();
		 l=str.length();
		str=str.replaceAll("[0-9]", "");
		a=l-str.length();
System.out.println(a);
	}

}
