package basicJava;

import java.util.Scanner;

public class condition 
{
	// write program to check age is elible for licence or not  ,  age >18 -> elible , age<18  -> no eligible ,  age >60 -> not elible
	public void licence()
	{
		System.out.println("Enter your age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<18)   //35   //true / false 
		{
			System.out.println("not eligible");
		}else if(age>18)
			{
			  System.out.println("eligible");		
	   		} else if(age >60)
	   		{
	   			System.out.println("not eligible");
	   		}	
	}	
	
	// print month name by taking number of month  1 -jan ,2 feb , 3 mar
	
	public void switchexample()
	{
		System.out.println("which month you want , ex 1, 2,3, 4");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //5
		
		switch (n)  //5
		{
			case 1:System.out.println("jan");
			break;
			
			case 2:System.out.println("Feb");
			break;
			
			case 3:System.out.println("March");
			break;
			
			case 4: System.out.println("April");
				System.out.println("we ar learing switch ex,");
			break;
			
			case 5:System.out.println("May");
			break;
			
			case 6:System.out.println("June");
			break;
			
			case 7:System.out.println("july");
			break;
			
			case 8:System.out.println("august");
			break;

		default: System.out.println("invalid month number");
			break;
		}
	
	}
	
	
	public void reverseString()
	{
		String rev ="";
		String src = "ashish";
		for(int i =src.length()-1; i>=0;i--)
		{
			rev = rev +src.charAt(i);
		}
		System.out.println(rev);
	}
	
	
	public void reverserwithoutseq()
	{
		String src = "ashish is mentor and coaching QA professionals";
		String arr [] = src.split(" ");
		
		
		for(int i = 0;i<arr.length-1;i++)
		{
			String rev ="";
			String word =arr[i];
			for(int j =word.length()-1;j>=0;j--)
			{
				rev = rev+ word.charAt(j);
			}
			
			System.out.print(rev+" ");
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		condition c = new condition();
		//c.licence();
		//c.switchexample();
		///c.reverseString();
		c.reverserwithoutseq();
	}

}
