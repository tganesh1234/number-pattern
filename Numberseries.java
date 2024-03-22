package gani.assignments;

import java.util.Scanner;

public class Numberseries {

	public static void main(String[] args) {
		// print number series right pattern
		int n,x=1;
		System.out.print("enter height of the pattern :");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print(x+" ");
				x++;
			}System.out.println();
		}

	}

}
