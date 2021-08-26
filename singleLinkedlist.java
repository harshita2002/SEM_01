/*
  NAME	:HARSHITA BISWAL
  REG_NO:1941012051
  SEC	:A										
  SEM	:2ND
  PRO_NO:MINOR PROJECT_03
 */



import java.util.Scanner;
//the program is the minor assignment
class node
{
	int exp;
	float coeff;
	node link;
}
public class singleLinkedlist {
public static node p1=null;
public static node p2=null;
public static node p3=null;
public static node create(node poly)
{
	System.out.println("Enter the exponent and coefficient");
	Scanner s=new Scanner(System.in);
	node temp=new node();
	temp.exp=s.nextInt();
	temp.coeff=s.nextFloat();
	poly=temp;
	return poly;
}
public static node insEnd(node poly)
{
	node n=new node();node temp=poly;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the exponent and coefficient");
	n.exp=s.nextInt();
	n.coeff=s.nextFloat();
	while(temp.link!=null)//last element is reached
	{
		temp=temp.link;
	}
	temp.link=n;
	return poly;
}
public static void sort(node poly)//arranges the nodes in descending order of power
{
	node i,j;
	for(i=poly;i.link!=null;i=i.link)
	{
	for(j=poly;j.link!=null;j=j.link)
	{
	if(j.exp < j.link.exp)
	{
	int temp=j.exp;float tem=j.coeff;
	j.exp=j.link.exp;j.coeff=j.link.coeff;
	j.link.exp=temp;j.link.coeff=tem;
}}}}
public static void display(node poly)
{
	node temp=poly;
	while(temp!=null)
	{
		System.out.print("("+temp.coeff+"x^"+temp.exp+")");
		if(temp.link!=null)
		{
			System.out.print("+");
		}
		temp=temp.link;
	}
	System.out.println();
	
}
public static node add(node p1,node p2)
{
	node i=p1,j=p2;node pp=null;int flag=0;
	while (i!=null||j!=null)
	{
		if(i==null) {
			node temp=pp;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=j;
			j=null;
		}
		else if(j==null)
		{
			node temp=pp;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=i;i=null;
		}
	else if(i.exp==j.exp)
		{
			node tem=new node();//new node created
			tem.exp=i.exp; 
			tem.coeff=i.coeff+j.coeff;//added as the exponents are same.
			tem.link=null;//as this would be the last node in pp so it points to null.
			node temp=pp;
			if(temp==null)
			{
				
				pp=tem;
			}
			else
			{
				while(temp.link!=null)//reaches the last element
				{
					temp=temp.link;
				}
				temp.link=tem;
				temp=tem;
			}
			i=i.link;j=j.link;//Both i and j are moved to the next nodes
			
		}
		else if(i.exp>j.exp)//as i is greater then only i will be added
		{
			if(pp==null	)
			{
				node tem=i;i=i.link;
				tem.link=null;
				pp=tem;
			}
			else
			{
				node temp=pp;node n=i;i=i.link;
				while (temp.link!=null)//reaches the last node
				{
					temp=temp.link;
				}
				n.link=null;
				temp.link=n;
				temp=n;
			}
		}
		else if(i.exp<j.exp)//j will be added to the end of linked list
		{
			if (pp==null)//first element is to be inserted
			{
				node n=j;j=j.link;
				n.link=null;
				pp=n;
			}
			else  {
			node temp=pp;node n=j;j=j.link;
			while (temp.link!=null)//reaches the last digit
			{
				temp=temp.link;
			}
			n.link=null;
			temp.link=n;
			temp=n;
			}
		}
	}
	return pp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);boolean b=true;int n=0;
		System.out.println("Here the user is expected to enter the powers and coefficient of the equation.");
		System.out.println("Enter the values to the first polynomial");
		while(b)
		{
			if(p1==null)
			{
				p1=create(p1);
			}
			else
			{
				p1=insEnd(p1);
			}
			System.out.println("If u want to continue adding then enter 1 otherwise enter anyother numeric value");
			n=s.nextInt();
			if(n!=1)
			{
				b=false;
			}
		}
		sort(p1);
		System.out.println("Enter the value to the second polynomial.");
		b=true;
		while(b)
		{
			if(p2==null)
			{
				p2=create(p2);
			}
			else
			{
				p2=insEnd(p2);
			}
			System.out.println("If u want to continue adding then enter 1 otherwise enter anyother numeric value");
			n=s.nextInt();
			if(n!=1)
			{
				b=false;
			}
		}
		sort(p2);
		System.out.println("The two linked list are as shown below.............");
		display(p1);
		display(p2);
		System.out.println("Both the linked list added together");
		p3=add(p1,p2);
		display(p3);
		
		
	}
}
