package fr.calculatrice.calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class OperationNouveauTest {

	Operations c1;
	@Before
	public void setUp() throws Exception {
		 c1 = new Operations(2,5);
	}

	@Test
	public void testAdd() {
		
		assertEquals(7, c1.add(c1.getX(), c1.getY()));
	}

	@Test
	public void testSoust() {
		 c1 =new Operations(9,3);
		assertEquals(6,c1.soust(c1.getX(), c1.getY()));
	}

}
