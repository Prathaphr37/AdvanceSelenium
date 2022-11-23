package group;

import org.testng.annotations.Test;

public class Test4 {

	@Test(groups="regression")
	public void create()
	{
		System.out.println("created 4");
	}
	
	@Test(groups="smoke")
	public void update()
	{
		System.out.println("update 4");
	}
}
