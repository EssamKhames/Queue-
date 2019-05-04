package eg.edu.alexu.csd.datastructure.queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTestL
{

/*
 *   Test case number: 1
 *   Test case values: push 1 and 2 into the queue
 *   Expected output (Post-state): [1, 2]
 */
	@Test
	public void test1()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		//Object i = q.dequeue();
		assertEquals(1,q.dequeue());
	}

/*
 *   Test case number: 2
 *   Test case values: push 1 and 2 into the queue, then pop the first item
 *   Expected output (Post-state): [2]
 */
	@Test
		public void test2()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		Object i = q.dequeue();
		assertEquals(1,i);
		
	}
	
	@Test
			public void test3()
	{
		QueueL q = new QueueL();
		q.enqueue(1);
		assertEquals(false, q.isEmpty());	
	}

	
	@Test
				public void test6()
	{
		Queue q = new Queue(0);
		assertEquals(true, q.isEmpty());	
	}
	
	@Test
	public void test5() {
		QueueL q = new QueueL();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.enqueue(3);
		assertEquals(2 ,(int)q.dequeue());
	}


}