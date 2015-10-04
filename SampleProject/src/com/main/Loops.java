package com.main;

import java.util.Scanner;

public class Loops {
	static void fibonacci(){
		int n1=0,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<=10;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	static void pingpong(){
		System.out.println("enter no.");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if (n%5==0 && n%3==0)
			System.out.println("ping pong");
		else if (n%5==0)
			System.out.println("ping");
		else if (n%3==0)
			System.out.println("pong");
		else
			System.out.println(n);
		
	}
	static void swaptwoNos1(){
		int a=10;
		int b=30;
		int z=a;
		a=b;
		b=z;
		System.out.println("a="+a);
		System.out.println("b="+b);
				
	}
	static void swap2(){
		int a=20;
		int b=40;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);			
		
	}
	static void factorial1(){
		System.out.println("enter no.");
		Scanner sc= new Scanner (System.in);
		sc.close();
		int n=sc.nextInt();
		for(int i=0;i<=5;i++)
			System.out.println(n+"*"+ i +"="+n*i);
	}
	static void factorial2(){
		System.out.println("enter no.");
		Scanner sc= new Scanner (System.in);
		
		int n=sc.nextInt();
		int i=20;
		sc.close();
			System.out.println(n+"*"+ i +"="+n*i);
	}
	static void printpattern(){
		System.out.println("pattern is");
		 for(int i = 1; i <=5; i++){
	            for(int j=1;j<=i;j++){
	                System.out.print("*");
	        }
	        System.out.println();
	        }
	}
		 static boolean prime(int n){
				for(int i=2;i<=n/2;i++)
					if(n%i==0){
						return false;
			}
			return true;
						
			}	

	public static void main(String[] args) {
		
		
		  printpattern();
		//factorial2();
		//swap2();
		//swaptwoNos1();
		//pingpong();
		//fibonacci();
		//System.out.println(prime(9));

	}

}



