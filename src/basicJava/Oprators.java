package basicJava;

public class Oprators
{

	public void arithmatic()
	{
		int a =65 ; int b =10;
		System.out.println(a  +  b);
		System.out.println(a  -  b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	public void unary()
	{
		int a =5;
		System.out.println(++a); // pre-increment
		System.out.println(a++); // post-increment
		System.out.println(a);
		System.out.println(--a);  //pre-decrement
		System.out.println(a--);  // post-decrement
		System.out.println(a);   
		System.out.println(-a);
			
	}
		
	public void assigment()
	{
		int a =5;
		
		System.out.println(a +=5);
		System.out.println(a*=2);
		System.out.println(a /=5);
		System.out.println(a%=2);
		
		
	}
	
	public void relational()
	{
		int a = 5, b = 10;
		System.out.println(a == b);  // false
		System.out.println(a != b);  // true
		System.out.println(a < b);   // true
		System.out.println(b >= 10); // true
		System.out.println(b <= 10); // true

	}
	
	public void logical()
	{
		boolean p = true, q = false;
		System.out.println(p && q); // false  // both true then --> true
		System.out.println(p || q); // true   // any one is true then  --> true
		System.out.println(!p); 

	}
	
	
	public static void main(String[] args) 
	{
		//control center
		Oprators o= new Oprators();   
		//o.arithmatic();
		//o.unary();
		//o.assigment();
		//o.relational();
		o.logical();
	
		
		System.out.println("operation performed ");

	}

}
