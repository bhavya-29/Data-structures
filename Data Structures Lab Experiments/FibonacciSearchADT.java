import java.io.*;
import java.util.Scanner;
public class FibonacciSearchADT{
	public static int fib_srch(int a[],int n,int key){
		int pos,k,initpos=0;
		int fib[]={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597};
		if(n==-1)
			return(-1);
		k=0;
		while(fib[k]<n)
			k++;
		while(k>0){
			pos=initpos+fib[--k];
			if((pos>=n)||key<a[pos])
				continue;
			else{
				if(key>a[pos]){
					initpos=pos+1;
					k--;
				}
				else
					return(pos);
			}
		}
		return(-1);
	}

	public static void main(String args[]){
		int a[] = {1,2,3,4,5,6,7,8,-999};
		int key;
		//key = Integer.parseInt(args[0]);
		int pos = fib_srch(a,8,7);
		if(pos==-1)
			System.out.println("not found");
		else
			System.out.println("found at "+pos);
	}
}

