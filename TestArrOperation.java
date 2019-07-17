import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrOperation {

	@Test
	public void test() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.maxMirror(new int[] { 1, 4, 5, 3, 5, 4, 1 });
		assertEquals(7, actual);
	}

	@Test
	public void test2() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.maxMirror(new int[] { 7, 1, 4, 9, 7, 4, 1 });
		assertEquals(2, actual);
	}

	@Test
	public void test3() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 });
		assertEquals(3, actual);
	}

	@Test
	public void test4() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.maxMirror(new int[] { 1, 4, 5, 3, 5, 4, 1 });
		assertEquals(7, actual);
	}

	@Test
	public void test5() {
		ArrOperation ar = new ArrOperation();
		int actual = ar
				.maxMirror(new int[] { 1, 2, 1, 2, 3, 3, 4, 3, 3, 2, 1 });
		assertEquals(9, actual);
	}

	// CLUMPS

	@Test
	public void test6() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.countClumps(new int[] { 1, 2, 2, 3, 4, 4 });
		assertEquals(2, actual);
	}

	@Test
	public void test7() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.countClumps(new int[] { 1, 1, 2, 1, 1 });
		assertEquals(2, actual);
	}

	@Test
	public void test8() {
		ArrOperation ar = new ArrOperation();
		int actual = ar.countClumps(new int[] { 1, 1, 1, 1, 1, 1});
		assertEquals(1, actual);

	}

}
