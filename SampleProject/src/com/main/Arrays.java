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
	static void twoarrays(){
		int[] arr1 = new int[] { 6,2,4,7,8  };
		int [] arr2=new int []{3,4,2,7,8};
		for (int i=0;i<=arr1.length-1;i++){
			for (int j=0;j<=arr2.length-1;j++){
				if (arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
			
		}
		
	    
	}		

	public static void main(String[] args) {
		//largestNo();
		//sum();
		twoarrays();

	}

}



