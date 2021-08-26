/* MINOR PROJECT_01(MAJOR ASSIGNMENT)
  Author				: HARSHITA BISWAL
  Registration number 	: 1941012051
  Year Branch Section 	: 1st C_S_E 'A'
  Purpose 				: Given four n-digit positive integer,
  						  generate an n-digit pin.Then encrypt a message
  						  using the generated pin. */



import java.util.*;
public class Harshita_1941012051
{

	public static void main(String[] args) 
	{
		
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter 4 PIN Of Your Choice :");		//input pins 
		        int n1=sc.nextInt();
		        int n2=sc.nextInt();
		        int n3=sc.nextInt();
		        int n4=sc.nextInt();
		        System.out.println("Enter the message you want to encrypt :");//input message to be encrypted
		        String msg=sc.nextLine();
		        sc.hasNextLine();
		     
		        int c=0,cc=n1,d=0,e=0,f=0,n=0,nnn=0,m=0;
		        while (cc!=0)		//to find the no. of digits 
		        {
		            cc=cc/10;
		            n+=1;
		        }
		        
		        while(c<=n-1)		//to extract minimum out of the place values 
		        { 
		            nnn=Math.min((n1%10),Math.min((n2%10),Math.min((n3%10),(n4%10))));
		            m=m+((int)Math.pow(10,c))*nnn;
		            n1=n1/10;
		            n2=n2/10;
		            n3=n3/10;
		            n4=n4/10;
		            c+=1;
		        }
		        
		        char g=' ';
		        String gg="";
		        msg=msg.replaceAll(" ","");
		        msg=msg.toLowerCase();
		        int k=msg.length();		//message is converted to lowercase
		        c=0;
		        while(e<=k-1)		//pin is encrypted
		        {
		            g=(msg.charAt(e));
		            d=m/((int)Math.pow(10,(n-1-c)));
		            d=d%10;
		            f=(int)g+d;
		            if(f>122)
		              {
		                f=96+(f-122);
		            }
		            gg=gg+((char)f);		//string is formed
		            c+=1;
		            if(c==n)
		            {
		                c=0;
		            }
		            e+=1;
		        }
		        System.out.print(gg.toUpperCase());		//message is converted to uppercase
		    } 
		
	}

