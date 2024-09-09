package com.bridgelabz.logicpractice;

public class AddMaxAndSecMaxFromArray {
    public static void main(String args[])
    {
        int arr[] = {12,566,22,56,7,10,50};
        System.out.print("Sorted Array is : ");
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = arr[arr.length-1];
        System.out.println("Max Number = "+max);
        int secMax = arr[arr.length-2];
        System.out.println("Second Max : "+secMax);
        System.out.println("Addition Of Max & SecMax Number in Array is "+(max+secMax));
    }
}
