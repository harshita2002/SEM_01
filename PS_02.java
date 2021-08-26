import java.util.*;

public class PS_02 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number (length max 03) ");
		int num=sc.nextInt();
		int i;
		if(num==111||num==101)
		{
			for(i=1;i<=4;i++)
			{
			System.out.println("Enter the binary number (length max 03) ");
			 num=sc.nextInt();
			if(num==111||num==101)
			{
				for(i=1;i<=4;i++)
				{
				System.out.println("Enter the binary number (length max 03) ");
				 num=sc.nextInt();
				 if(num==0)
					 break ;
				}
			}
			}
		}
		else if(num<=99)
		{
			if(num==111||num==101)
			{
			loop1:	for(i=1;i<=4;i++)
				{
				System.out.println("Enter the binary number (length max 03) ");
				 num=sc.nextInt();
				if(num==111||num==101)
					{
					for(i=1;i<=4;i++)
						{
					System.out.println("Enter the binary number (length max 03) ");
					 num=sc.nextInt();
					 if(num==0)
						 break;
						}
						break;
					}
				}
			}
			
		}
		else
		{
			System.out.println("Non-binary input");
			System.exit(0);
		}
	}
}