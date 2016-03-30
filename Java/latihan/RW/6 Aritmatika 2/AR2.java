import java.util.Scanner;

public class AR2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b;

		a = in.nextInt();
		b = in.nextInt();

		System.out.println(a+b);
		System.out.println(a*b);
		if (b!=0) { System.out.print(a/b); }
		System.out.println();
		if (b!=0) { System.out.print(a%b); }
		System.out.println();
		
		int tmp=1;
		for (int i=0;i<b;i++){
			tmp *= a;
		}
		System.out.println(tmp);
	}
}