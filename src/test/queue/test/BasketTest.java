package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/** 
* Basket Tester. 
* 
* @author <Authors name> 
* @since 2018-5-11
* @version 1.0 
*/ 
public class BasketTest {
	private BlockingQueue<String> basket = new ArrayBlockingQueue<>(3);
@Before
public void before() {
	basket.add("A apple");
	basket.add("A apple");
	basket.add("A apple");
} 

@After
public void after() {
} 

/** 
* Method: produce()
*/
@Test
public void testProduce() {
	Assert.assertEquals(basket.offer("A apple"), true);
} 

/** 
* Method: consume()
*/
@Test
public void testConsume() {
	basket.poll();
	basket.poll();
	basket.poll();
	Assert.assertEquals(basket.poll(), "null");
}

/** 
* Method: getAppleNumber()
*/
@Test
public void testGetAppleNumber() {
	Assert.assertEquals(basket.size(), 4);
}


} 
