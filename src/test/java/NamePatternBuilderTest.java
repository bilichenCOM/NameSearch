import static org.junit.Assert.*;

import org.junit.Test;

import com.droptable.utils.NamePatternBuilder;

public class NamePatternBuilderTest {

	@Test
	public void testSimple() {
		String input = "Johny Hurricane";
		String pattern = NamePatternBuilder.makeLikePattern(input);
		assertEquals("'%JOHNY%HURRICANE%'", pattern);
	}
}