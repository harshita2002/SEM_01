import java.util.Scanner;
public class Coaching {
	public static int[] input_skill()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the numbers players in the team.");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;++i)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int[] Sort(int a[])
	{
		int i,j,temp;
		for(i=0;i<a.length;++i)
		{
			for(j=0;j<a.length-1;++j)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		return a;
	}
	public static void check_time(int n,int p,int arr[])
	{
		int i,j,diff=0;
	    int min_diff=0,count=0;
	    diff=0;
	    for(i=p-1;i<arr.length;++i)
	    {
	    	for(j=i,count=0;count<p;--j,++count)
	    	{
	    		diff=diff+arr[i]-arr[j];
	    	}
	    	if (i==p-1)
	    	{
	    		min_diff=diff;
	    	}
	    	else if(min_diff>diff)
	    	{
	    		min_diff=diff;
	    	}
	    	diff=0;
	    }
	    System.out.println("The minimum hour:"+min_diff);
	}

	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of turns.");
		int num=s.nextInt();
		int p,count=0;
		while(count<num)
		{
			
			int arr[]=input_skill();
			arr=Sort(arr);
			display(arr);
			System.out.println("enter p ");
			p=s.nextInt();
			check_time( arr.length, p, arr);
			count++;
		}
	}
}
			