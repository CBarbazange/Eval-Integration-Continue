package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {

	private FIFO fifo_1 = null;
	private FIFO fifo_2 = null;
	private FIFO fifo_3 = null;
	private FIFO fifo_4 = null;

	@BeforeEach
	void setUp() throws Exception {
		this.fifo_1 = new FIFO();
		this.fifo_2 = new FIFO();
		this.fifo_3 = new FIFO();
		this.fifo_4 = new FIFO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFirst() {
		
		assertThrows(NoSuchElementException.class, ()-> this.fifo_1.first() );
		
		this.fifo_1.add(1);
		this.fifo_1.add(15);
		this.fifo_1.add(3);
		
		assertEquals(Integer.valueOf(1),  this.fifo_1.first());
	}

	@Test
	void testIsEmpty() {
        assertEquals(this.fifo_2.isEmpty(), true);
        
        this.fifo_2.add(12);
        
        assertEquals(fifo_2.isEmpty(), false);
	}

	@Test
	void testRemoveFirst() {
		
        assertThrows(NoSuchElementException.class, ()-> this.fifo_3.removeFirst());

        this.fifo_3.add(1);
        this.fifo_3.add(2);
        this.fifo_3.add(3);
        this.fifo_3.removeFirst();
        
        assertEquals(Integer.valueOf(2), this.fifo_3.first());

	}

	@Test
	void testSize() {
		
		assertEquals(0, this.fifo_4.size());
		
		this.fifo_4.add(46583);
		
		assertEquals(1, this.fifo_4.size());
	}

}
