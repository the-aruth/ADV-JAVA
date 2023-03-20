package com.mycompany.app;


public class MergeStrategy implements Strategy{
	public double[] sort(double arr[]){
		return mergesort(arr,0,arr.length-1);
	}

	double[] mergesort(double arr[],int left,int right){
		int m;
		double temp[] = new double[right+1];
		if(left==right){
			double arr1[]={arr[left]};
			return arr1;
		}
		if(left < right){
			m=(left+right)/2;
			double arr1[]=mergesort(arr,left,m);
			double arr2[]=mergesort(arr,m+1,right);
			temp= merge(arr1,arr2);
		}
		return temp;
	}

	double[] merge(double arr1[],double arr2[]){
		int a1Start=0;
		int a1end=arr1.length;
		int a2start=0;
		int a2end=arr2.length;
		int length=arr1.length+arr2.length;
		double temp[]= new double[length] ;
		int k=0;
		while(a1Start<a1end && a2start<a2end){
			if(arr1[a1Start]<arr2[a2start])
				temp[k++]=arr1[a1Start++];
			else
				temp[k++]=arr2[a2start++];
		}
		if(a1Start==a1end)
			while(a2start<a2end)
				temp[k++]=arr2[a2start++];
		else if(a2start==a2end)
			while(a1Start<a1end)
				temp[k++]=arr1[a1Start++];
		return temp;
	}

}

