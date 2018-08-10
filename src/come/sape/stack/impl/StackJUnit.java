package come.sape.stack.impl;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class StackJUnit {

	
	
	static Stack stack;
	
	@BeforeClass
	public static void initialize() {
		stack = new Stack(3);
	}
	
	@Test
	public void isEmpty() {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void pushAndPopElement() {
		stack.push(5);
		assertEquals(5, stack.pop());
		assertTrue(stack.isEmpty());
		
	}
	
	@Test
	public void testIsFull() {
		assertFalse(stack.isFull());
		
	}
	
	@Test(expected = java.util.EmptyStackException.class)
	public void testPopEmpty() {
		//Stack stack = new Stack(3);
		stack.pop();
		
	}
	
	@Test(expected = java.lang.StackOverflowError.class)
	public void testStackFull() {
		Stack stack1 = new Stack(1);
		stack1.push(1);
		stack1.push(2);
		stack.push(3);
		assertTrue(stack1.isFull());
	}
	
}
