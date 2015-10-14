package fst.info.springhibernate.dao;

import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDAO {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
					new String[] { "WebContent/WEB-INF/applicationContext.xml" });
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}
}