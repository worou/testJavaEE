package fr.calculatrice.calcul;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperationsTest {
	static  Operations op;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	     op = new Operations(4,9);
	   
	     
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd() {
		 Operations ope = new Operations(4,9);
		assertEquals(13,op.add(op.getX(), op.getY()));
		assertEquals(13,ope.add(op.getX(), op.getY()));
		//fail("Not yet implemented");
	}

	@Test
	public void testSoust() {
		assertEquals(-5,op.soust(op.getX(), op.getY()));
		//fail("Not yet implemented");
	}

}
