package project1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.junit.jupiter.api.Test;

import project2.Class1;

public class Class1Test {

	@Test
	public void testBar() {
		String s1 = "hello";
		String s2 = "goodbye";
		assertThat(Class1.doSomething(s1, s2), not(equalTo(0)));
	}
}
