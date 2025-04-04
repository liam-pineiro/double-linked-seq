package doubleLinkedSeq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoubleLinkedSeqTest {

	@Test
	public void addAfterTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		assert(seq.toString().equals("2.0"));
	}

	@Test
	public void addAfterTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		assert(seq.toString().equals("2.0, 3.0"));
	}
	
	@Test
	public void addAfterTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addAfter(4);
		assert(seq.toString().equals("2.0, 3.0, 4.0"));
	}
	
	@Test
	public void addAfterTest4() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addAfter(4);
		seq.addAfter(5);
		assert(seq.toString().equals("2.0, 3.0, 4.0, 5.0"));
	}
	
	@Test
	public void constructorTest() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		assert(seq.toString().equals(""));
	}
	
	@Test
	public void addBeforeTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		assert(seq.toString().equals("6.0"));
	}
	
	@Test
	public void addBeforeTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addBefore(7);
		assert(seq.toString().equals("7.0, 6.0"));
	}
	
	@Test
	public void addBeforeTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addBefore(7);
		seq.addBefore(8);
		assert(seq.toString().equals("8.0, 7.0, 6.0"));
	}
	
	@Test
	public void addBeforeTest4() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addBefore(7);
		seq.addBefore(8);
		seq.addBefore(9);
		assert(seq.toString().equals("9.0, 8.0, 7.0, 6.0"));
	}
	
	@Test
	public void addBeforeThenAfterTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addAfter(7);
		assert(seq.toString().equals("6.0, 7.0"));
	}
	
	@Test
	public void addBeforeThenAfterTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addAfter(7);
		seq.addAfter(8);
		assert(seq.toString().equals("6.0, 7.0, 8.0"));
	}
	
	@Test
	public void addBeforeThenAfterTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(6);
		seq.addBefore(8);
		seq.addAfter(7);
		assert(seq.toString().equals("8.0, 7.0, 6.0"));
	}
	
	@Test
	public void addAfterThenAddBeforeTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(7);
		seq.addBefore(2);
		assert(seq.toString().equals("2.0, 7.0"));
	}
	
	@Test
	public void addAfterThenAddBeforeTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(7);
		seq.addBefore(2);
		seq.addBefore(3);
		assert(seq.toString().equals("3.0, 2.0, 7.0"));
	}
	
	@Test
	public void addAfterThenAddBeforeTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(7);
		seq.addAfter(8);
		seq.addBefore(2);
		assert(seq.toString().equals("7.0, 2.0, 8.0"));
	}
	
	@Test
	public void addAfterAndAddBeforeTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(7);
		seq.addBefore(2);
		seq.addAfter(45);
		seq.addAfter(43);
		seq.addBefore(9);
		seq.addBefore(3);
		assert(seq.toString().equals("2.0, 45.0, 3.0, 9.0, 43.0, 7.0"));
	}
	
	@Test
	public void addAfterAndAddBeforeTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(2);
        seq.addBefore(3);
		seq.addAfter(45);
		seq.addAfter(43);
		seq.addBefore(9);
		seq.addAfter(8);
		seq.addBefore(7);
		assert(seq.toString().equals("3.0, 45.0, 9.0, 7.0, 8.0, 43.0, 2.0"));
	}
	
	@Test
	public void addAllTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		DoubleLinkedSeq seq2 = new DoubleLinkedSeq();
		
		seq.addAfter(2);
		seq.addAfter(3);
		assert(seq.toString().equals("2.0, 3.0"));
		
		seq2.addAfter(4);
		seq2.addAfter(5);
		assert(seq2.toString().equals("4.0, 5.0"));
		
		seq.addAll(seq2);
		assert(seq.toString().equals("2.0, 3.0, 4.0, 5.0"));
	}
	
	@Test
	public void addAllTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		DoubleLinkedSeq seq2 = new DoubleLinkedSeq();
		
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		
		seq2.addAfter(4);
		seq2.addBefore(2);
		seq2.addBefore(8);
		seq2.addAfter(5);
		assert(seq2.toString().equals("8.0, 5.0, 2.0, 4.0"));
		
		seq.addAll(seq2);
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0, 8.0, 5.0, 2.0, 4.0"));
	}
	
	@Test
	public void sizeTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		assertTrue(seq.size() == 4);
	}
	
	@Test
	public void sizeTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		assertTrue(seq.size() == 2);
	}
	
	@Test
	public void sizeTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		assertTrue(seq.size() == 0);
	}
	
	@Test
	public void isCurrentTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		assertFalse(seq.isCurrent());
	}
	
	@Test
	public void isCurrentTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		assertTrue(seq.isCurrent());
	}
	
	@Test
	public void getCurrentTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		assertEquals(seq.getCurrent(), 3.0);
	}
	
	@Test
	public void getCurrentTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addBefore(2);
        seq.addBefore(3);
		seq.addAfter(45);
		seq.addAfter(43);
		seq.addBefore(9);
		seq.addAfter(8);
		seq.addBefore(7);
		assertEquals(seq.getCurrent(), 7.0);
	}
	
	@Test
	public void advanceTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		
		seq.addAfter(2);
		seq.addAfter(3);
		
		seq.advance();
		assertFalse(seq.isCurrent());
	}
	
	@Test
	public void advanceTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		
		seq.advance();
		assertEquals(seq.getCurrent(), 3.0);
	}
	
	@Test
	public void startTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.start();
		assertFalse(seq.isCurrent());
	}
	
	@Test
	public void startTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		seq.start();
		assertEquals(seq.getCurrent(), 2.0);
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
	}
	
	@Test
	public void cloneTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		assert(seqCopy.toString().equals("2.0, 5.0, 4.0, 3.0"));
	}
	
	@Test
	public void cloneTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		seqCopy.addAfter(7);
		
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		assert(seqCopy.toString().equals("2.0, 5.0, 7.0, 4.0, 3.0"));
	}
	
	@Test
	public void cloneTest3() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		seqCopy.addAfter(7);
		seqCopy.addAfter(8);
		seqCopy.addBefore(12);
		
		
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		assert(seqCopy.toString().equals("2.0, 5.0, 7.0, 12.0, 8.0, 4.0, 3.0"));
	}
	
	@Test
	public void cloneTest4() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		seqCopy.addAfter(2);
		seqCopy.addBefore(9);
				
		assert(seq.toString().equals(""));
		assert(seqCopy.toString().equals("9.0, 2.0"));
	}
	
	@Test
	public void cloneTest5() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		seqCopy.addAfter(2);
		seqCopy.addBefore(9);
		seqCopy.addBefore(7);
		seqCopy.addAfter(10);
				
		assert(seq.toString().equals(""));
		assert(seqCopy.toString().equals("7.0, 10.0, 9.0, 2.0"));
	}
	
	@Test
	public void catenationTest1() {
		DoubleLinkedSeq tempSeq = new DoubleLinkedSeq();
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		DoubleLinkedSeq seqCopy = seq.clone();
		
		seqCopy.addAfter(7);
		seqCopy.addAfter(8);
		seqCopy.addBefore(12);
		
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		assert(seqCopy.toString().equals("2.0, 5.0, 7.0, 12.0, 8.0, 4.0, 3.0"));
		
		DoubleLinkedSeq combinedSeq = tempSeq.catenation(seq, seqCopy);
		
		assert(combinedSeq.toString().equals("2.0, 5.0, 4.0, 3.0, 2.0, 5.0, 7.0, 12.0, 8.0, 4.0, 3.0"));
	}
	
	@Test
	public void removeCurrentTest1() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		seq.addBefore(4);
		seq.addBefore(5);
		
		assert(seq.toString().equals("2.0, 5.0, 4.0, 3.0"));
		seq.removeCurrent();
		assert(seq.toString().equals("2.0, 4.0, 3.0"));
		
	}
	
	@Test
	public void removeCurrentTest2() {
		DoubleLinkedSeq seq = new DoubleLinkedSeq();
		seq.addAfter(2);
		seq.addAfter(3);
		assert(seq.toString().equals("2.0, 3.0"));
		seq.removeCurrent();
		assert(seq.toString().equals("2.0"));
		assertFalse(seq.isCurrent());
	}
}
