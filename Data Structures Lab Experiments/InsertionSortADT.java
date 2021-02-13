import java.io.*;
import java.util.Scanner;
public class InsertionSortADT{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n+1];
		System.out.println("enter array elements ......");
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		System.out.println("before sorting");
		display(a,n);
		insertionsort(a,n);
		System.out.println("after sorting");
		display(a,n);
	}
	public static void insertionsort(int a[],int n){
		int i,j,temp;
		for(i=1;i<=n;i++){
			temp = a[i];
			j=i-1;
			while(j>=0 && (temp<a[j])){
				a[j+1]=a[j];
				j--;
			}
			a[j+1] =temp;
		}
	}
	
	public static void display(int a[],int n){
		System.out.println();
		for(int i=1;i<=n;i++){
			System.out.print(a[i]+" ");
		}
	}
}

