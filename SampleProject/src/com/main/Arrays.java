package com.main;

public class Arrays {
	static void largestNo(){
		int[]arr=new int[]{23,34,12,32};		
		int max=0;
		for(int i=0;i<arr.length;i++)
		if(max<arr[i])
			max=arr[i];
		System.out.println(max);		
	}
	static void sum(){
		int [] arr=new int[]{3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println(sum);
	} 
	static  int[]merge(int[]a,int[]b){
		int[]c=new int[a.length+b.length];
		int i=0;
		for( i=0;i<a.length;i++)
			c[i]=a[i];
		for(int j=0;j<b.length;j++)
			c[i++]=b[j];
		return c;
		
		
		
		
	    
	}	
	static void mergeTwoArrays(){
		int[]arr1=new int[]{2,3,4};
		int[]arr2=new int[]{6,7,8};
		
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
		     
				
		
			}}}
	static String sortingArray(String str){
		char [] arr=str.toCharArray();
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;j<0;j--){
				if(arr[j]>arr[j-1]){
					char temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
				}}}
			str=String.valueOf(arr);			
		return str;
		}
		
	public static void main(String[] args) {
		//largestNo();
		//sum();
		//twoarrays();
		//sortingArray("helo");
		int[]a={2,3,4,5};
		int[]b={6,7,2,4};
		int[]c=merge (a,b);
		for(int i=0;i<a.length;i++)
		
			System.out.println(c[i]+" ");

	}

}



