package OOPS;

public class child extends parent 
{
	public child()
	{
		super(5);
		System.out.println("i am in child constructor");
		
		
		System.out.println("git testing ");
		
		System.out.println("git testing 2222");
		
		
		
	}
	
	public void school()
	{
		System.out.println("child go to school");
	}
	
	public void play()
	{
		System.out.println("child go to play ");
	}
	
	public static void main(String[] args)
	{
		child c = new child();
		c.school();
		c.play();
		c.job();
		c.paybill();  // IV access
		c.village();
		c.farmhouse();
		
		parent p = new parent(4);
		p.job();
		p.paybill();
		p.village();
		p.farmhouse();
		
		// iV asssigment side = new object creation side      
		parent p1 = new child();     
		p1.job();
		p1.paybill();
		p1.farmhouse();
		p1.village();
		
		grandparent g = new grandparent();
		g.farmhouse();
		g.village();
			
		
		int a =15;   
		double b = a; // up casting   // widening 
		
		int y = (int) b;
		
		//child c1 = (child) new parent();  // narrowing , downcsting 
		
		parent p2 = new child();
		child c2 = (child) p2;
		c2.school();
		c2.play();
		c2.paybill();
		c2.farmhouse();
		c2.job();
		c2.village();

	}

}
