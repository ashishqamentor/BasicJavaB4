package interfaceexample;

public class child extends parent implements uncle2
{
	public void school()
	{
		System.out.println("child go to school");
	}
	
	@Override
	public void methoduncle_1() {
		// TODO Auto-generated method stub
		System.out.println(" methoduncle_1 method from uncle 1");
		
	}

	@Override
	public void methoduncle_2() {
		// TODO Auto-generated method stub
		System.out.println(" methoduncle_2 method from uncle 1");
	}
	
	@Override
	public void methoduncle_3() {
		// TODO Auto-generated method stub
		System.out.println(" methoduncle_3 method from uncle 2");
	}

	@Override
	public void methoduncle_4() {
		// TODO Auto-generated method stub
		System.out.println(" methoduncle_4 method from uncle 2");
	}

	public void play()
	{
		System.out.println("child go to play ");
	}
	
	public static void main(String[] args)
	{
		child c= new child();
		c.school();
		c.play();
		c.play();
		c.job();
		c.village();
		c.farmhouse();
		c.methoduncle_1();
		c.methoduncle_2();
		c.methoduncle_3();
		c.methoduncle_4();
		c.method4();
		
		uncle1.method5(); // classname.methodname 
		
	
		
		
		
	}

	

}
