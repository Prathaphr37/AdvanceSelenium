package groups;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups="smoke")
	public void create()
	{
		System.out.println("created 1");
	}
	
	@Test
	public void update()
	{
		System.out.println("update 1");
	}
}
