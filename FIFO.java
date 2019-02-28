package monPackage;

import java.util.ArrayList;

import java.util.NoSuchElementException;

/**
 * A FIFO queue for Integers.
 */
public class FIFO {
	private ArrayList<Integer> queue = new ArrayList<Integer>();

	
	public void add(Integer myInt) {
		queue.add(myInt);
	}


	public Integer first() throws NoSuchElementException {
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			return queue.get(0);
		}
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}


	public void removeFirst() throws NoSuchElementException {
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		} else {
			queue.remove(0);
		}
	}


	public int size() {
		return queue.size();
	}
}