/*
 INPUT FORMAT
 
  A word that starts with several Zs and continues by several Os.
  Note: The maximum length of this word must be 20.
  
 OUTPUT FORMAT
  
  Print YES if the input word can be considered as the string zoo otherwise, print NO.
  SAMPLE INPUT 							SAMPLE OUTPUT
  zzzoooooo								Yes
  
   */


import java.util.*;
import java.text.NumberFormat;
public class zoo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NumberFormat nf=NumberFormat.getInstance();
		nf.setMaximumIntegerDigits(4);
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(1234567.52));
	}

}
