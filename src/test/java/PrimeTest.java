import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
	Prime prime=null;
	@Before
	public void setup()
	{
		prime=new Prime();
	}
	

	@Test
	public void test() {
		LinkedHashSet<Integer> result=prime.primeFactors(18);
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(2);
		hs.add(3);
		assertEquals(hs,result);
	}

}
