import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(97.5);
		g1.addScore(86.5);
		g2.addScore(89.5);
		g2.addScore(75.5);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1=g2=null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("97.5 86.5 0.0 0.0 0.0 "));
		assertEquals(g1.toString(),"97.5 86.5 0.0 0.0 0.0 ");
	}

	@Test
	void testSum() {
		assertEquals(g1.sum(),184.0);
		assertEquals(g2.sum(),165.0);
		
	}

	@Test
	void testMinimum() {
		assertEquals(g1.minimum(),86.5);
		assertEquals(g2.minimum(),75.5);
	}

	@Test
	void testFinalScore() {
		assertEquals(g1.finalScore(),97.5);
		assertEquals(g2.finalScore(),89.5);
	}

}
