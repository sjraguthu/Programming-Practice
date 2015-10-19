package com.main;

public class Strings {
	static void reverseAString(){
		String str="This is good";
		String rev=" ";
		char[]arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			rev=rev+arr[i];
			
		}
		System.out.println(rev);		  
	}
	static void reverse(){
		String input="This is not bad";
		String output=" ";
		String[]arr=input.split(" ");
		for(int i=arr.length-1;i>=0;i--){
			output=output+arr[i]+" ";
		}
		System.out.println(output);
	
	}
	static void palindrome(){
		String str="racecar";
		String rev=" ";
		char []arr=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
			rev=rev+arr[i];	
		   System.out.println(rev.toString());
		    if (rev==str)
			System.out.println("yes");
			else 
			System.out.println("not");
		}
		
	

	public static void main(String[] args) {
		//reverseAString();
		//reverse();
		palindrome();
	}

}
