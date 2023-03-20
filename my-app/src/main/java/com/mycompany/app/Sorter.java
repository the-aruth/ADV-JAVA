package com.mycompany.app;


public class Sorter{
	Strategy strategy;
	
	public Sorter(){
		strategy = null;
	}
	
	double[] sort(double arr[],Strategy strategy){
		return strategy.sort(arr);
	}
	
	double[] sort(double arr[]){
		return strategy.sort(arr);
	}
	
	void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	
	public double[] sorting(){
	Sorter sorter = new Sorter();
	//sorter.setStrategy( new BubbleStrategy());
	double arr[] = {24,65,87,97,67};
	double output[] = sorter.sort(arr, new BubbleStrategy());
	return output;
	//System.out.println("Bubble Sort");
	//for(int i=0; i<arr.length; i++){
		//System.out.println(output[i]);
		//}
		
	//double output1[] = sorter.sort(arr, new MergeStrategy());
	//System.out.println("Merge Sort");
	//for(int i=0; i<arr.length; i++){
		//System.out.println(output1[i]);
		//}
	
	
	}
}
