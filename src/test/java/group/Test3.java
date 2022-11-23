package group;

import org.testng.annotations.Test;

public class Test3 {

	@Test(groups= {"smoke","regression"})
	public void create()
	{
		System.out.println("created 3");
	}
	
	@Test
	public void update()
	{
		System.out.println("update 3");
	}
}
