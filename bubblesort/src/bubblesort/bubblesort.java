package bubblesort;

import java.util.Random;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr= new int[10];
        Random rm = new Random();
        System.out.print("[");
        for(int i =0;i<10;i++) {
        	arr[i]=rm.nextInt(100);
        	System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        int len =arr.length;
        for(int i = 0;i<len-1;i++) {
        	for(int j = 0;j<len-i-1;j++) {
        		if(arr[j]>arr[j+1]) {
        		int temp = arr[j];
        		arr[j]=arr[j+1];
        		arr[j+1]=temp;
        		}
        	}
        }
        System.out.print("[");
        int i =0;
        while(i<len) {
        	System.out.print(arr[i]);
        	i++;
        	System.out.print(" ");
        }
        System.out.print("]");
    }
}