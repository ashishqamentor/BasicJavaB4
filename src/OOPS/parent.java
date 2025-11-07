package OOPS;

public class parent extends grandparent
{

	public parent()
	{
		System.out.println("i am in parent constructor");
	}

	
	public parent(int i) 
	{
		// TODO Auto-generated constructor stub
		System.out.println("i am in paramterised--> "+i);
	}

	public void job()
	{
		System.out.println("parnet go to job");
	}
	
	public void paybill()
	{
		System.out.println("parnet pays bill");
	}
}
