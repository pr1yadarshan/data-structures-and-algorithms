package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciSeriesTest {
	
	@Test
	public void recusiveFibTest() {
		System.out.println(new FibonacciSeries().recursiveFib(10));
	}
	
	@Test
	public void dynamicFibTest() {
		System.out.println(new FibonacciSeries().dynamicFib(10));
	}
	

}
