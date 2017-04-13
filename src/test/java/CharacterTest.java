import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CharacterTest {
	Character character=null;
	@Before
	public void setup()
	{
		character=new Character();
	}

	@Test
	public void test() {
		String result=character.stringDuplicates("liril");
		assertEquals("lir",result);
	}

}
