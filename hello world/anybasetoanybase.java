/*
 * Question:-
 * 1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.
 */



package MyClass;
import java.util.Scanner;
public class anybasetoanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int d = getvalue(n ,  b1 ,  b2);
		System.out.println(d);

	}
	public static int getvalue(int n , int b1 , int b2) {
		int dec = anybasetodecimal(n , b1);
		int dn = decimaltoanybase(dec  ,b2);
		return dn;
	}
	
	public static int decimaltoanybase(int n , int b) {
		int rv =0;
		int p= 1;
		while(n>0) {
			int dig = n%b;
			n = n/b;
			rv += dig * p;
			p = p*10;
		}
		return rv;
	}
	public static int anybasetodecimal(int n , int b) {
		int rv = 0;
		int p=1;
		while(n>0) {
			int dig = n % 10;
			n = n/10;
			rv += dig *b;
			p = p * b;
		}
		return rv;
	}

}
