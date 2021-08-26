import java.util.*;

class OutOfRangeException extends RuntimeException
{
	OutOfRangeException(String msg)
	{
		super(msg);
	}
}

public class fooo 
{
	public static void disp_sort(int[] si)		//method to sort the skill ratings n display them
	{
	int temp;
	for(int i=si.length;i>0;i--)		//sorting of skill ratings list
	{
		for(int j=0;j<si.length-1;j++)
		{
			if(si[j]>si[j+1])
			{
				temp=si[j];
				si[j]=si[j+1];
				si[j+1]=temp;
			}
		}	
	}
	for(int i=0;i<si.length;++i)		//printing of sorted list
	{
		System.out.print(si[i]+" ");
	}
	}
	
	public static void calc_hrs(int si[],int N)		//method to calculate coaching time
	{
		Scanner sc=new Scanner(System.in);
		int i,j,diff=0;
		int min_diff=0,count=0;
		System.out.println("Enter the value of P (2<=P<=N) : ");		//P=total no. of students in a team required (2<=P<=N) 
		int P=sc.nextInt();
		
		    for(i=P-1;i<si.length;++i)
		    {
		    	for(j=i,count=0;count<P;--j,++count)
		    	{
		    		diff=diff+si[i]-si[j];
		    	}
		    	if (i==P-1)
		    	{
		    		min_diff=diff;
		    	}
		    	else if(min_diff>diff)
		    	{
		    		min_diff=diff;
		    	}
		    	diff=0;
		    }
		    System.out.println("The minimum hours for coaching : "+min_diff);
		
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=0,N;
		while(true)
		{
		System.out.println("Enter the no. of test case (1<=T<=100) : ");		//test case
		try
		{
		T=sc.nextInt();
		if (T>=1 && T<=100)
		{
			break;
		}
		else
		{
			throw new OutOfRangeException("T is out of the range.");
		}
		}
		catch(OutOfRangeException e)
		{
			System.out.println(e);
		}
		}
		for(int i=0;i<T;i++)		//input into test cases
		{
			while(true)
			{
			System.out.println("Enter the value of N (2<=N<=1000) : ");			//N=total no. of students
			try
			{
			N=sc.nextInt();
			if (N>=2 && N<=1000)
			{
				break;
			}
			else
			{
				throw new OutOfRangeException("N is out of the range.");
			}
			}
			catch(OutOfRangeException e)
			{
				System.out.println(e);
			}
			}
			int si[];
			si=new int [N];
			System.out.println("Enter the skill ratings (1<=si<=10000) : ");			//si=skill rating of N
			for(int j=0;j<N;j++)
			{
				si[j]=sc.nextInt();
			}
			disp_sort(si);
			calc_hrs(si,N);
		}
	}
}
