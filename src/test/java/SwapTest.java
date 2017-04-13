import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class SwapTest {
	Swap swap=null;
	@Before
	public void setup()
	{
		swap=new Swap();
	}

	@Test
	public void test() {
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> result=swap.swap(4, 6);
		set.add(6);
		set.add(4);
		assertEquals(set,result);
		
		
	}

}
