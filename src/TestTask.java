import static org.junit.Assert.*;

import org.junit.Test;

public class TestTask {
	
	@Test
	public void TestSetName() {
		String name = "name";
		Task task = new Task();
		task.setName(name);
		
		assertEquals(name, task.getName());
	}

	@Test
	public void testSetDescription() {
		String name = "name";
		Task task = new Task();
		task.setDescription(name);
		
		assertEquals(name, task.getDescription());
	}

}
