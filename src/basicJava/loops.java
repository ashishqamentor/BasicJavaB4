package basicJava;

import java.util.Scanner;

public class loops 
{
  
	private int p ;
	
	// to check number is palindrome or not , 12321 , 356 ->653 -> not aplindrome
	public  static void reverser()
	{
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();   //
		int originalNo = n;
		int d =0, rev =0 ;
		
		while(n>0)    //n = 365  365>0							//n =36 -> 36>0 			n=3 (3>0)     			n =0 , 0>0
		{
			d= n%10;			//d= 365%10 = 36.5  	d-->5 	//d= 36%10=3.6 --> d=6 		//d=3%10= 0.3 -> d=3
			rev = rev *10+d;	// rev = 0*10+5		-> rev =5	//rev =5*10+6 --> rev =56	// rev = 56*10+3 ->rev =563
			n=n/10;				// n =365/10 --> 36.5 -> n =36  //n =36/10 =3.6 --> n =3	// n = 3/10 =0.3  n = 0
		}
		
		if(rev==originalNo)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("not a plaindrome number");
		}
		
	}
	
	public int dowhileExample() // void
	{
		
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5

		do
		{
			System.out.println(n);
			n--; //4
		}  while(n<3);  // 4<3
		
		System.out.println("clsed");
		return n;
		
	}
	
	public void forloopExample()
	{
		System.out.println("enter your number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		
		for(int i =0;i<=n; i++)   //  3<=4   4<=4  4<=3
 		{
			System.out.println(i);
			
		}
		
		
	}
	
	public void foreachExample()
	{
		int a[] = {3,6,8,9,2};   //   // list of element 
		
		for(int temp :a)   					//   (webelement tempele : listofele)
		{
			System.out.println(temp);				// string name = templ.gettext();
													// if(name == name											// name.click()
			
		}		
	}
	
	public void ReverseNumber() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int tochekPalindrome= n;
		int rev =0 ; int n1;
  		while(n>0) //356
		{
			n1=n%10;
			rev =rev*10+n1; 
			n= n/10;
			
		}
		System.out.println("Reverse Number "+rev);
		
		if(rev==tochekPalindrome)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
	
	public void ReverseStringwithoutChangesequence() {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String s = sc.nextLine();
		String rev="";
		//System.out.println(s);
		for(int i=0 ;i<s.split(" ").length;i++)
		{    
			String n = s.split(" ")[i];
			
			for(int j=n.length()-1 ;j>=0;j--  )
			{
				rev =rev+n.charAt(j);
			}
			rev = rev+ " ";
			
			
		}
		System.out.println("Reveres string is ==> "+rev);
		
		
	}
	
	// ashish = 
	
	//reverse string  "ashish"   --> hsihsa
	
	public void reversestring()
	{
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		String rev ="";
		for(int i =name.length()-1; i>=0;i--) // i=5					i=4						i=3
		{
			rev = rev+name.charAt(i); 		// rev =""+h--> rev=h   	rev =h+s--> rev =hs		rev =hs+i  --> rev =hsi
		}
		 System.out.println(rev);
		
		 if(rev.equalsIgnoreCase(name)) //  ( 5==5)   
 		 {
			 System.out.println("palindrome string");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
		 
		
		
	}
	
	
	// reverse sentecnce without changing sequence   "my name is ashish "  --
	//												  ym eman si hsihsa
	
	public void reverseWithout()
	{
		System.out.println("Enter your sentence");  
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();      //"my name is ashish " 
		
		String arr[] = name.split(" ");  //-->{my , name ,is, ashish }
		
		for(int i =0; i<=arr.length-1;i++)
		{
			
			String word =arr[i];
			String rev =" ";
			for(int j =word.length()-1; j>=0;j--) // i=5					i=4						i=3
			{
				rev = rev+word.charAt(j); 		// rev =""+h--> rev=h   	rev =h+s--> rev =hs		rev =hs+i  --> rev =hsi
			}
			 		
			System.out.print(rev);
		}
			
	}
	
	//public , private ,protected , default 
	
	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
		loops l = new loops();
		reverser();
		//l.reverser();
		 int b = l.dowhileExample();
		//l.forloopExample();
		//l.foreachExample();
		//l.reversestring();
		l.reverseWithout();
	}

}
