import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MissingTest {
	MissingNumber missingnumber=null;
	@Before
	public void setup()
	{
		missingnumber=new MissingNumber();
	}

	@Test
	public void test() {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ArrayList<Integer> result=missingnumber.missing(new int[] {3,6,8,2,10});
		ar.add(4);
		ar.add(5);
		ar.add(7);
		ar.add(9);
		assertEquals(ar,result);
	}

}
