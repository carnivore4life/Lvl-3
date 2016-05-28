import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class TestMyStack {
 
   	@Test
   	public void test() {
          	MyStack stack = new MyStack();
          	stack.push("Item1");
          	stack.push("Item2");
          	stack.push("Item3");
          	stack.push("Item4");
          	
          	assertEquals("Item4",stack.peek());
          	assertEquals(false, stack.isEmpty());
          	assertEquals("Item4",stack.pop());
          	assertEquals(false, stack.isEmpty());
          	assertEquals("Item3",stack.pop());
          	assertEquals(false, stack.isEmpty());
          	assertEquals("Item2",stack.pop());
          	assertEquals(false, stack.isEmpty());
          	assertEquals("Item1",stack.pop());
          	assertEquals(true, stack.isEmpty());
 
   	}
 
}
