import java.io.*;
import java.util.Scanner;
public class RadixSortADT{
	public static void radixSort(int a[],int n){
		int big,count,digit,i,j,k,p,div;
		int bucket[][] = new int[10][15];
		int b[] = new int[10];
		big = a[0];
		for(i=1;i<n;i++){
			if(big<a[i])
				big = a[i];
		}
		count = 0;
		while(big>0){
			big = big/10;
			count++;
		}
		div = 1;
		for(p=1;p<=count;p++){
			for(i=0;i<10;i++)
				b[i]=0;
			for(i=0;i<n;i++){
				digit = (a[i]/div)%10;
				bucket[digit][b[digit]] = a[i];
				System.out.println("*******************");
				System.out.println("("+digit+" "+b[digit]+" "+a[i]+")");
				b[digit]++;
			}
			i=0;
			for(k =0;k<10;k++){
				for(j=0;j<b[k];j++)
					a[i++] = bucket[k][j];
			}
			div = div*10;
		}			
	}
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
		radixSort(a,n);
		System.out.println("After Sorting : ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}