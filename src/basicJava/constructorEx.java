package basicJava;

public class constructorEx 
{
	//global location
	public int b ,a ;
	
	public constructorEx()
	{
		a=18;
		b=2;
	}

	
	public constructorEx(int i, int j) 
	{
		// TODO Auto-generated constructor stub
		a=i;
		b=j;
	}
	
	private void addition()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		//local postion
		System.out.println(a-b);
	}
		
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		constructorEx c = new constructorEx();
		c.addition();
		c.sub();
		
		constructorEx c1 = new constructorEx(15,3);
		c1.addition();
		c1.sub();
	}

}
