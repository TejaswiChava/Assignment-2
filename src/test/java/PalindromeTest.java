import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest {
	Palindrome palindrome=null;
	@Before
	public void setup()
	{
		palindrome=new Palindrome();
	}

	@Test
	public void test() {
		boolean result=palindrome.Checking("madam");
		assertEquals(true,result);
	}

}
