import java.util.Scanner;
class node//our node
{
	int info;
	node prev;
	node next;
}
public class DLL 
{
	public static node p=null;
	public static node create(node p)
	{
		node temp=new node();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		temp.info=s.nextInt();
		temp.prev=null;
		temp.next=null;
		p=temp;
		System.out.println("The linked list is successfully created");
		return p;
	}
	public static node insBeg(node p)
	{
		node n=new node();Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n.info=s.nextInt();
		n.prev=null;
		n.next=p;
		p.prev=n;
		p=n;
		return p;
	}
	public static node insPos(node p)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the position where you want to enter the next node");
		int c=s.nextInt();
		if(c==1)
		{
			System.out.println("The 1st if is executed");
			p=insBeg(p); return p;
		}
		if(c>=count(p))
		{
			System.out.println("The 2nd if is execcuted");
			p=insEnd(p);return p;
		}
	
		System.out.println("Enter a number");
		node n=new node();
		n.info=s.nextInt();
		node temp=p;int cnt=1;
		while((temp.next!=null)&&(cnt<c-1))
		{
			temp=temp.next;cnt++;
		}
		n.next=temp.next;
		n.prev=temp;
		temp.next.prev=n;
		temp.next=n;
		return p;
	}
	public static int count(node p)
	{
		node temp=p;int c=0;
		while(temp!=null)
		{
			c++;temp=temp.next;
		}
		return c;
	}
	public static node insEnd(node p)
	{
		Scanner s=new Scanner(System.in);
		node temp=p;
		System.out.println("Enter a number");
		node n=new node();
		n.info=s.nextInt();
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		n.prev=temp;
		n.next=null;
		temp.next=n;
		return p;
	}
	public static node delBeg(node p)
	{
		p=p.next;//p moved to the next node
		p.prev=null;//The previous node is made null so as to delete the last node
		return p;
	}
	public static node delEnd(node p)
	{
		if (p.next==null)
		{
			p=null;return p;
		}
		node temp=p;
		while(temp.next.next!=null)//last element is reached
		{
			temp=temp.next;
		}
		temp.next=null;//element is lost
		System.out.println("deleted from the end of the linked list");
		return p;
	}
	public static node delPos(node p)
	{
		if(p.next==null)
		{
			p=null;return p;
		}
		System.out.println("Enter the position where you want to delete");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		if(c==1)
		{
			p=delBeg(p);return p;
		}
		if(c>=count(p))
		{
			p=delEnd(p);return p;
		}
		node temp=p;int cnt=1;
		while((temp.next!=null)&&(c-1>cnt))
		{
			temp=temp.next;cnt++;
		}
		temp.next.next.prev=temp;//link set
		temp.next=temp.next.next;
		
		return p;
	}
	public static void search(node p)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int c=s.nextInt();
		node temp=p;
		while(temp!=null)
		{
			if(temp.info==c)
			{
				break;
			}
			
		}
		if(temp==null)
		{
			System.out.println("The elemnt is not");
		}
		else
		{
			System.out.println("Enter the new number");
			temp.info=s.nextInt();
			System.out.println("The element is added");
		}
	}
	public static void display(node p)
	{
		node temp=p;
		while(temp!=null)
		{
			System.out.print(temp.info+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	/*public static node reverse(node p)
	{
		if(p==null)
		{
			System.out.println("The linked list is empty.");return p;
		}
		node temp=p;node q=null;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=temp.prev;node tem=null;
		temp.prev=null;
		q=temp;//1st node is updated in the linked list
		temp=temp.next;
		while (temp.prev!=null)//updated till the last element
		{
			
			tem=temp.next;
			temp.next=temp.prev;
			temp.prev=tem;//the prev and the next are reversed
			temp=temp.next;
		}
		temp.prev=temp.next;
		temp.next=null;
		display(q);
		System.out.println("The linked list is reversed");
		return q;
	}*/
	public static void sort(node p)
	{
		node i,j;
		for(i=p;i.next!=null;i=i.next)
		{
			for(j=p;j.next!=null;j=j.next)
			{
				if(j.info>j.next.info)
				{
					int temp=j.info;
					j.info=j.next.info;
					j.next.info=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);int ch;boolean b=true;
while(b)
{
	System.out.println("*************MENU******************");
	System.out.println("1.>Enter 1 to create the linked list.\n2.>Enter 2 to delete the element from the linked list."
			+"\n3.>Enter 3 to sort the linked list.\n4.>Enter 4 to count the linked list.\n"
			+"5.>Enter 5 search through the linked list.\n6.Enter 6 display the contents ini the linked list."
			+"\n7.>Enter 7 to exit the progrsm.");
	ch=s.nextInt();//the choice is entered
	switch(ch)
	{
	case 1:
		if(p==null)
		{
			p=create(p);break;
		}
		while(true)
		{
			System.out.println("1.>Enter 1 to insert at the beginning"
					+"\nEnter 2 to enter at any position"
					+"\nEnter 3 to enter at the end of the linked list."
					+"\nEnter any other number to get back to the menu.");
			ch=s.nextInt();
			if(ch==1)
			{
				p=insBeg(p);
			}
			else if(ch==2)
			{
				p=insPos(p);
			}
			else if(ch==3)
			{
				p=insEnd(p);
			}
			else 
			{
				break;
			}
			
		}
		break;
	case 2:
		if(p==null)
		{
			System.out.println("No element in the linked list");break;
		}
		while(true)
		{
		System.out.println("1.>Enter 1 to delete the beginning"
				+"\nEnter 2 to delete at any position"
				+"\nEnter 3 to delete at the end of the linked list."
				+"\nEnter any other number to get back to the menu.");
		ch=s.nextInt();
		if(ch==1)
		{
			p=delBeg(p);
		}
		else if(ch==2)
		{
			p=delPos(p);
		}
		else if(ch==3)
		{
			p=delEnd(p);
		}
		else 
		{
			break;
		}
		}
		break;
	case 3:sort(p);
		break;
	case 4:
		System.out.println("The total number of elements in the linked list:"+count(p));
		break;
	case 5:search(p);
	break;
	case 6:display(p);
	break;
	case 7:b=false;
	break;
	default:System.out.println("Invalid Choice");break;
	}
	
}
System.out.println("The program has ended");
	}

}


