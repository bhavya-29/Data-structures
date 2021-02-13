import java.io.*;
import java.util.Scanner;
public class SelectionSortADT{
	public static void main(String[] args){
		int a[];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a= new int[n];
		System.out.println(" enter the array elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		selectionSort(a,n);
		display(a,n); 
	}
	public static void selectionSort(int a[],int n){
		int i,j,temp,min;
		for(i=0;i<n-1;i++){
			min=i;
			for(j=i+1;j<n;j++)
				if(a[min]>a[j])
					min=j;
			temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	public static void display(int a[],int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}

