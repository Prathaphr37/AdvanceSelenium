
package groups;

import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void create()
	{
		System.out.println("created 1");
	}
	
	@Test(groups="regression")
	public void update()
	{
		System.out.println("update 2");
	}
}
