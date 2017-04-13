import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class RemovinDuplicatesTEst {

	RemovinDuplicates removinduplicates=null;
	@Before 
	public void setup()
	{
		removinduplicates =new RemovinDuplicates();
	}

	@Test
	public void test() {
	
		Set<Integer> eset=new LinkedHashSet<Integer>();

	 
			 eset.add(4);
			 eset.add(3);
			 eset.add(2);
			 eset.add(5);
			 int[] result={4,3,3,4,5,2};
	 	assertEquals(eset,(removinduplicates.removeDuplicates(result)));
	}


}
