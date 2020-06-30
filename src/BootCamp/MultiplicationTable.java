package BootCamp;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number:");        
		
		    int n=8; 
		    
	        for(int i=1; i <= 10; i++)
	        {
	            System.out.println(n+" * "+i+" = "+n*i);
	        }

	}

}
