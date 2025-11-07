package interfaceexample;

public interface uncle1
{

	
	public abstract void methoduncle_1();
	public abstract void methoduncle_2();
	
	default void method4()
	{
		System.out.println("calling default method");
	}
	
	static void method5()
	{
		System.out.println("calling static method");
	}
	
	private void method6()
	{
		System.out.println("calling private method");
	}
	
	
}
