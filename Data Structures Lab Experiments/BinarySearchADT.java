import java.io.*;
import java.util.Scanner;
public class BinarySearchADT{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array....");
		int n =sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements.......");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("enter the key..");
		int key = sc.nextInt();
		int pos = binarySrch(a,n,key);
		if(pos==-1)
			System.out.println("not found");
	   else
	       System.out.println("found at position"+pos);
	}

    public static int binarySrch(int a[],int n,int key){
        int lb=0,ub=n-1,mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(a[mid]==key)
                return(mid);
            else{
                if(a[mid]>key)
                    ub=mid-1;
                else
                    lb=mid+1;
            }
        }
        return(-1);
    }
	
	
}
