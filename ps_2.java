import java.util.*;
public class ps_2 
{
	public static int cnt=0;
	public static void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number (length max 03) ");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println("The End");
			System.exit(1);
		}
		else if(num!=111 && num!=101)
		{
			cnt++;
		}
		
		else if(num==101|| num==111)
		{
			cnt=0;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number (length max 03) ");
		int num=sc.nextInt();
		int i;
	    while(num!=0)
		{
		    	input();
		    	if(cnt==4) break;   		      
		}
		
	}

}
