
package group;

import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void create()
	{
		System.out.println("test2 created 1");
	}
	
	@Test(groups="regression")
	public void update()
	{
		System.out.println("update 2");
	}
}
