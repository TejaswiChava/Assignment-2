import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MergeTest {
	Merge merge=null;
	@Before
	public void setup()
	{
		merge=new Merge();
	}
	

	@Test
	public void test() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> result=merge.merge(new int[] {1,2,4,5},new int[] {5,9,10});
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(9);
		arr.add(10);
		assertEquals(arr,result);
		
	}

}
