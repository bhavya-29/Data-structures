import java.io.*;
import java.util.Scanner;
public class LinearSearchADT{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the key you need to find : ");
		int ele = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int pos=linearSrch(a,0,n-1,ele);
		if(pos==-1){System.out.println("not found");}
		else{System.out.println("found at"+pos);}
	}
	public static int linearSrch(int a[],int f,int l,int ele){
		if(l<f)
			return(-1);
		if(a[f]==ele)
			return(f);
		return(linearSrch(a,f+1,l,ele));
	}	
}
