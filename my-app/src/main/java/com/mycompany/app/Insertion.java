package com.mycompany.app;
public  class Insertion //implements Strategy
{
    static double[] sort(double[] arr)	
    {    
        double n = arr.length;
        int pass=1;
        double tmp=0.0;
        for(pass=1;pass<n;pass++)
        {
           tmp=arr[pass];
           int i;
           for(i=pass-1;i>=0;i--)		
           {
           		if(tmp>=arr[i])
           			break;
           		else
           			arr[i+1]=arr[i];
           }
           arr[i+1]=tmp;
        }
        System.out.println("Insertion Sort \n");
        return arr;
    }
    
    public static void main(String[] args)
    {
		double A[] = {24,65,87,97,67};
		sort(A);
		for(int i = 0; i<= A.length-1; i++) 
		{
			System.out.println(A[i]);
		}
	}
}














