import java.io.*;
import java.util.Scanner;
public class QuickSortADT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter elements : ");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Before Sorting");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		quickSort(a,0,n-1);
		System.out.println("After Sorting : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void quickSort(int a[],int left,int right){
		int pivot,l,u;
		l = left;
		u = right;
		pivot = left;
		while(left!=right){
			while(a[right]>=a[pivot] && left!=right)
				right--;
			if(left!=right){
				int temp = a[pivot];
				a[pivot] = a[right];
				a[right] = temp;
				pivot = right;
			}
			while(a[left]<=a[pivot] && left!=right)
				left++;
			if(left!=right){
				int temp = a[pivot];
				a[pivot] = a[left];
				a[left] = temp;
				pivot = left;
			}
		}
		if(l<pivot)
			quickSort(a,l,pivot-1);
		if(pivot<u)
			quickSort(a,pivot+1,u);
		} 
}
			